package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Optimizer {
  private List<String> originalInstructions; // Instrucciones originales, sin tocar
  private List<String> instructions; // Lista que vamos optimizando
  private Map<String, String> constants; // Constantes detectadas en propagación

  // Constructor recibe las instrucciones iniciales
  public Optimizer(List<String> instructions) {
    this.instructions = new ArrayList<>(instructions); // Copia para trabajar
    this.originalInstructions = new ArrayList<>(instructions); // Copia para métricas
    this.constants = new HashMap<>(); // Inicializamos mapa de constantes
  }

  // Método principal: aplica todas las optimizaciones hasta que no haya cambios
  public List<String> optimize() {
    boolean changed;
    do {
      List<String> before = new ArrayList<>(instructions); // Guardamos el estado antes de optimizar
      eliminateCommonSubexpressions(); // Detecta y elimina cálculos repetidos
      propagateConstants(); // Sustituye variables por valores constantes
      foldConstants(); // Calcula operaciones entre constantes
      eliminateDeadCode(); // Elimina instrucciones que no afectan al resultado final
      changed = !before.equals(instructions); // Repetimos mientras haya cambios
    } while (changed);
    return instructions; // Devuelve la versión optimizada
  }

  // Imprime el código optimizado y lo guarda en un archivo
  public void printInstructions(String fileName) {
    this.printMetrics(); // Primero mostramos estadísticas
    Utils.printInstructions(instructions); // Imprime en consola
    Utils.saveInstructionsToFile(instructions, "src/outputs/" + fileName + "_codigo_intermedio_optimizado.txt"); // Guarda
                                                                                                                 // en
                                                                                                                 // disco
  }

  // Muestra estadísticas de optimización
  public void printMetrics() {
    int originalCount = originalInstructions.size();
    int optimizedCount = instructions.size();
    int eliminated = originalCount - optimizedCount; // Cuántas instrucciones se eliminaron
    double reduction = (eliminated * 100.0) / originalCount; // Porcentaje de reducción
    String reductionStr = String.format("%.2f", reduction);

    Utils.printSuccess("📊 Instrucciones originales: " + originalCount);
    Utils.printSuccess("📊 Instrucciones optimizadas: " + optimizedCount);
    Utils.printSuccess("📊 Instrucciones eliminadas: " + eliminated);
    Utils.printSuccess("📊 Reducción de código: " + reductionStr + "%");
  }

  // Sustituye variables por constantes conocidas
  private void propagateConstants() {
    Map<String, String> constants = new HashMap<>(); // Nuevo mapa de constantes
    List<String> newInstructions = new ArrayList<>();

    for (String instr : instructions) {
      String[] parts = instr.split("="); // Separar variable izquierda de expresión derecha
      if (parts.length == 2) {
        String left = parts[0].trim();
        String right = parts[1].trim();

        // Guardamos solo constantes simples como "x = 5", evitando self-assignments
        if (right.matches("\\d+") && !right.contains(left)) {
          constants.put(left, right);
        } else {
          // Reemplazamos variables por sus valores constantes si ya las conocemos
          for (Map.Entry<String, String> entry : constants.entrySet()) {
            String var = entry.getKey();
            String val = entry.getValue();
            right = right.replaceAll("\\b" + var + "\\b", val); // Solo reemplaza palabras completas
          }
        }

        newInstructions.add(left + " = " + right); // Guardamos la instrucción modificada
      } else {
        newInstructions.add(instr); // Instrucciones que no tienen '=' las dejamos igual
      }
    }

    instructions = newInstructions; // Actualizamos lista de instrucciones
  }

  // Evalúa operaciones entre constantes
  private void foldConstants() {
    List<String> newInstructions = new ArrayList<>();

    for (String instr : instructions) {
      String[] parts = instr.split("=");
      if (parts.length == 2) {
        String left = parts[0].trim();
        String right = parts[1].trim();

        // Detectamos operaciones simples de enteros "2 + 3" o similares
        if (right.matches("\\d+\\s*[+\\-*/]\\s*\\d+")) {
          try {
            String result = eval(right); // Calculamos el resultado
            newInstructions.add(left + " = " + result); // Sustituimos por resultado
            constants.put(left, result); // Lo guardamos como constante para usar después
          } catch (Exception e) {
            newInstructions.add(instr); // Si algo falla, dejamos la instrucción como estaba
          }
        } else {
          newInstructions.add(instr); // Si no es operación entre constantes, dejamos igual
        }
      } else {
        newInstructions.add(instr);
      }
    }
    instructions = newInstructions; // Actualizamos instrucciones
  }

  // Evalúa expresiones aritméticas simples entre enteros
  private String eval(String expr) {
    expr = expr.trim();
    if (expr.contains("+")) {
      String[] nums = expr.split("\\+");
      return String.valueOf(Integer.parseInt(nums[0].trim()) + Integer.parseInt(nums[1].trim()));
    } else if (expr.contains("-")) {
      String[] nums = expr.split("\\-");
      return String.valueOf(Integer.parseInt(nums[0].trim()) - Integer.parseInt(nums[1].trim()));
    } else if (expr.contains("*")) {
      String[] nums = expr.split("\\*");
      return String.valueOf(Integer.parseInt(nums[0].trim()) * Integer.parseInt(nums[1].trim()));
    } else if (expr.contains("/")) {
      String[] nums = expr.split("\\/");
      int divisor = Integer.parseInt(nums[1].trim());
      if (divisor == 0)
        throw new ArithmeticException("División por cero en foldConstants");
      return String.valueOf(Integer.parseInt(nums[0].trim()) / divisor);
    }
    throw new RuntimeException("Expresión no soportada: " + expr);
  }

  // Elimina subexpresiones repetidas para no recalcular lo mismo
  private void eliminateCommonSubexpressions() {
    List<String> newInstructions = new ArrayList<>();
    Map<String, String> exprMap = new HashMap<>(); // Mapa expresión -> temporal

    for (String instr : instructions) {
      String trimmed = instr.trim();
      // Solo miramos instrucciones tipo temporal = exprA + exprB
      if (trimmed.matches("t\\d+\\s*=\\s*.+\\s*[+\\-*/]\\s*.+")) {
        String[] parts = trimmed.split("=", 2);
        String left = parts[0].trim();
        String right = parts[1].trim();

        if (exprMap.containsKey(right)) {
          String existingTemp = exprMap.get(right); // Ya calculamos esta expresión antes
          newInstructions.add(left + " = " + existingTemp); // Reutilizamos resultado
        } else {
          exprMap.put(right, left); // Guardamos nueva expresión
          newInstructions.add(instr);
        }
      } else {
        newInstructions.add(instr); // Instrucciones no aritméticas se agregan tal cual
      }
    }

    instructions = newInstructions;
  }

  // Elimina instrucciones que nunca se usan (código muerto)
  private void eliminateDeadCode() {
    List<String> newInstructions = new ArrayList<>();
    java.util.Set<String> live = new java.util.HashSet<>(); // Variables que todavía necesitamos

    // Recorremos desde abajo hacia arriba para detectar uso real
    for (int i = instructions.size() - 1; i >= 0; i--) {
      String instr = instructions.get(i).trim();

      // Caso asignación normal: x = expr
      if (instr.contains("=") && !instr.startsWith("if") && !instr.startsWith("goto")) {
        String[] parts = instr.split("=");
        String left = parts[0].trim();
        String right = parts[1].trim();

        if (live.contains(left) || left.startsWith("t")) {
          // La variable es necesaria: mantenemos la instrucción
          newInstructions.add(0, instr);
          live.remove(left);

          // Agregamos las variables de la derecha como vivas
          for (String token : right.split("\\W+")) {
            if (token.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
              live.add(token);
            }
          }
        }
      } else {
        newInstructions.add(0, instr); // Mantener instrucciones de control
        // Detectamos variables usadas en condiciones y returns
        if (instr.startsWith("ifFalse") || instr.startsWith("RETURN")) {
          for (String token : instr.split("\\W+")) {
            if (token.matches("[a-zA-Z_][a-zA-Z0-9_]*"))
              live.add(token);
          }
        }
      }
    }

    instructions = newInstructions; // Actualizamos la lista final
  }

}

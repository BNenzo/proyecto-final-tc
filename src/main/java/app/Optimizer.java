package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Optimizer {
  private List<String> instructions;
  private Map<String, String> constants;

  public Optimizer(List<String> instructions) {
    this.instructions = new ArrayList<>(instructions);
    this.constants = new HashMap<>();
  }

  public List<String> optimize() {
    boolean changed;
    do {
      List<String> before = new ArrayList<>(instructions);
      eliminateCommonSubexpressions();
      propagateConstants();
      foldConstants();
      changed = !before.equals(instructions);
    } while (changed);
    return instructions;
  }

  public void printInstructions() {
    Utils.printInstructions(instructions);
    Utils.saveInstructionsToFile(instructions, "src/outputs/codigo_intermedio_optimizado.txt");
  }

  private List<String> propagateConstants() {
    Map<String, String> constants = new HashMap<>();
    List<String> newInstructions = new ArrayList<>();

    for (String instr : instructions) {
      String[] parts = instr.split("=");
      if (parts.length == 2) {
        String left = parts[0].trim();
        String right = parts[1].trim();

        // 🚫 Evitar self-assignments como "i = i + 1"
        if (right.matches("\\d+") && !right.contains(left)) {
          constants.put(left, right);
        } else {
          for (Map.Entry<String, String> entry : constants.entrySet()) {
            String var = entry.getKey();
            String val = entry.getValue();
            // Sustituir solo variables conocidas
            right = right.replaceAll("\\b" + var + "\\b", val);
          }
        }

        newInstructions.add(left + " = " + right);
      } else {
        newInstructions.add(instr);
      }
    }

    return newInstructions;
  }

  private void foldConstants() {
    List<String> newInstructions = new ArrayList<>();

    for (String instr : instructions) {
      String[] parts = instr.split("=");
      if (parts.length == 2) {
        String left = parts[0].trim();
        String right = parts[1].trim();

        if (right.matches("\\d+\\s*[+\\-*/]\\s*\\d+")) {
          try {
            String result = eval(right);
            newInstructions.add(left + " = " + result);
            constants.put(left, result);
          } catch (Exception e) {
            newInstructions.add(instr);
          }
        } else {
          newInstructions.add(instr);
        }
      } else {
        newInstructions.add(instr);
      }
    }
    instructions = newInstructions;
  }

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

  private void eliminateCommonSubexpressions() {
    List<String> newInstructions = new ArrayList<>();
    Map<String, String> exprMap = new HashMap<>();

    for (String instr : instructions) {
      String trimmed = instr.trim();
      if (trimmed.matches("t\\d+\\s*=\\s*.+\\s*[+\\-*/]\\s*.+")) {
        String[] parts = trimmed.split("=", 2);
        String left = parts[0].trim();
        String right = parts[1].trim();

        if (exprMap.containsKey(right)) {
          String existingTemp = exprMap.get(right);
          newInstructions.add(left + " = " + existingTemp);
        } else {
          exprMap.put(right, left);
          newInstructions.add(instr);
        }
      } else {
        newInstructions.add(instr);
      }
    }

    instructions = newInstructions;
  }
}

package app;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

public class MiVisitor extends idBaseVisitor<String> {

  private List<String> instructions = new ArrayList<>();

  public List<String> getInstructions() {
    return instructions;
  }

  public void printInstructions() {
    Utils.printInstructions(instructions);
    Utils.saveInstructionsToFile(instructions, "src/outputs/codigo_intermedio.txt");
  }

  private int tempCount = 0;

  private String newTemp() {
    return "t" + (tempCount++);
  }

  private int labelCount = 0;

  private String newLabel() {
    return "L" + (labelCount++);
  }

  @Override
  public String visitOperacion_aritmetica(idParser.Operacion_aritmeticaContext ctx) {
    return visit(ctx.expresion_aritmetica());
  }

  @Override
  public String visitExpresion_aritmetica(idParser.Expresion_aritmeticaContext ctx) {
    String left = visit(ctx.termino_aritmetico(0));

    for (int i = 1; i < ctx.termino_aritmetico().size(); i++) {
      String right = visit(ctx.termino_aritmetico(i));
      String temp = newTemp();
      String op = ctx.getChild(2 * i - 1).getText();
      instructions.add(temp + " = " + left + " " + op + " " + right);
      left = temp;
    }
    return left;
  }

  @Override
  public String visitTermino_aritmetico(idParser.Termino_aritmeticoContext ctx) {
    String left = visit(ctx.factor(0));

    for (int i = 1; i < ctx.factor().size(); i++) {
      String right = visit(ctx.factor(i));
      String temp = newTemp();
      String op = ctx.getChild(2 * i - 1).getText();
      instructions.add(temp + " = " + left + " " + op + " " + right);
      left = temp;
    }
    return left;
  }

  @Override
  public String visitFactor(idParser.FactorContext ctx) {
    if (ctx.NUMERO() != null) {
      return ctx.NUMERO().getText();
    } else if (ctx.NUMERO_DOUBLE() != null) {
      return ctx.NUMERO_DOUBLE().getText();
    } else if (ctx.identificador_aritmetico() != null) {
      return ctx.identificador_aritmetico().getText();
    } else {
      return visit(ctx.expresion_aritmetica());
    }
  }

  @Override
  public String visitDeclarador_simple(idParser.Declarador_simpleContext ctx) {
    String nombreVar = ctx.IDENTIFICADOR().getText();

    ParseTree actual = ctx;
    idParser.Declaracion_variableContext declCtx = null;

    while (actual != null) {
      if (actual instanceof idParser.Declaracion_variableContext) {
        declCtx = (idParser.Declaracion_variableContext) actual;
        break;
      }
      actual = actual.getParent();
    }

    String tipo = (declCtx != null) ? declCtx.tipo_variable().getText() : "unknown";

    instructions.add("DECLARE " + nombreVar + " " + tipo);
    return null;
  }

  @Override
  public String visitDeclarador_inicializado(idParser.Declarador_inicializadoContext ctx) {
    String nombreVar = ctx.IDENTIFICADOR(0).getText();

    ParseTree actual = ctx;
    idParser.Declaracion_variableContext declCtx = null;

    while (actual != null) {
      if (actual instanceof idParser.Declaracion_variableContext) {
        declCtx = (idParser.Declaracion_variableContext) actual;
        break;
      }
      actual = actual.getParent();
    }

    String tipo = (declCtx != null) ? declCtx.tipo_variable().getText() : "unknown";

    instructions.add("DECLARE " + nombreVar + " " + tipo);
    if (ctx.NUMERO() != null) {
      instructions.add(nombreVar + " = " + ctx.NUMERO().getText());
    } else if (ctx.IDENTIFICADOR().size() > 1) {
      instructions.add(nombreVar + " = " + ctx.IDENTIFICADOR(1).getText());
    } else if (ctx.NUMERO_DOUBLE() != null) {
      instructions.add(nombreVar + " = " + ctx.NUMERO_DOUBLE().getText());
    } else if (ctx.CARACTER() != null) {
      instructions.add(nombreVar + " = " + ctx.CARACTER().getText());
    } else if (ctx.expresion_aritmetica() != null) {
      String resultado = visitExpresion_aritmetica(ctx.expresion_aritmetica());
      instructions.add(nombreVar + " = " + resultado);
    } else if (ctx.expresion_booleana() != null) {
      String resultado = visitExpresion_booleana(ctx.expresion_booleana());
      instructions.add(nombreVar + " = " + resultado);
    }

    return null;
  }

  @Override
  public String visitAsignacion_variable(idParser.Asignacion_variableContext ctx) {
    String variable = ctx.asignacion_variable_identificador().getText();
    if (ctx.NUMERO() != null) {
      instructions.add(variable + " = " + ctx.NUMERO().getText());
    } else if (ctx.NUMERO_DOUBLE() != null) {
      instructions.add(variable + " = " + ctx.NUMERO_DOUBLE().getText());
    } else if (ctx.CARACTER() != null) {
      instructions.add(variable + " = " + ctx.CARACTER().getText());
    } else if (ctx.expresion_aritmetica() != null) {
      String resultado = visitExpresion_aritmetica(ctx.expresion_aritmetica());
      instructions.add(variable + " = " + resultado);
    } else if (ctx.expresion_booleana() != null) {
      String resultado = visitExpresion_booleana(ctx.expresion_booleana());
      instructions.add(variable + " = " + resultado);
    } else if (ctx.llamada_funcion_expresion() != null) {
      String resultado = visit(ctx.llamada_funcion_expresion());
      String temp = newTemp();
      instructions.add(temp + " = " + resultado);
      instructions.add(variable + " = " + temp);
    }

    return null;
  }

  @Override
  public String visitLlamada_funcion_expresion(idParser.Llamada_funcion_expresionContext ctx) {
    String functionName = ctx.llamada_nombre_funcion().getText();
    String arguments = "";
    if (ctx.llamada_funcion_parametros() != null) {
      arguments = ", " + ctx.llamada_funcion_parametros().getText();
    }

    instructions.add("CALL " + functionName + arguments);
    return "CALL " + functionName + arguments;
  }

  @Override
  public String visitExpresion_booleana(idParser.Expresion_booleanaContext ctx) {
    // Caso: termino_comparacion operador_comparacion termino_comparacion
    if (ctx.termino_comparacion().size() == 2) {
      String left = visit(ctx.termino_comparacion(0));
      String right = visit(ctx.termino_comparacion(1));
      String op = ctx.operador_comparacion().getText();

      String temp = newTemp();
      instructions.add(temp + " = " + left + " " + op + " " + right);
      return temp;
    }

    // Caso: ( expresion_booleana )
    if (ctx.PARENTESIS_APERTURA() != null) {
      return visit(ctx.expresion_booleana(0));
    }

    // Caso: expresion_booleana operador_logico expresion_booleana
    if (ctx.expresion_booleana().size() == 2) {
      String left = visit(ctx.expresion_booleana(0));
      String right = visit(ctx.expresion_booleana(1));
      String op = ctx.operador_logico().getText();

      String temp = newTemp();
      instructions.add(temp + " = " + left + " " + op + " " + right);
      return temp;
    }

    return null;
  }

  @Override
  public String visitTermino_comparacion(idParser.Termino_comparacionContext ctx) {
    if (ctx.NUMERO() != null) {
      return ctx.NUMERO().getText();
    } else if (ctx.NUMERO_DOUBLE() != null) {
      return ctx.NUMERO_DOUBLE().getText();
    } else if (ctx.CARACTER() != null) {
      return ctx.CARACTER().getText();
    } else {
      return ctx.getText(); // IDENTIFICADOR
    }
  }

  @Override
  public String visitIf(idParser.IfContext ctx) {
    String cond = visit(ctx.expresion_booleana());
    String lfalse = newLabel();
    String lend = newLabel();

    if (ctx.ELSE() == null) {
      instructions.add("ifFalse " + cond + " goto " + lfalse);

      if (!ctx.bloque().isEmpty()) {
        visit(ctx.bloque(0));
      } else if (ctx.instruccion() != null) {
        visit(ctx.instruccion());
      }

      instructions.add(lfalse + ":");
    } else {
      instructions.add("ifFalse " + cond + " goto " + lfalse);

      if (!ctx.bloque().isEmpty()) {
        visit(ctx.bloque(0));
      } else if (ctx.instruccion() != null) {
        visit(ctx.instruccion());
      }

      instructions.add("goto " + lend);
      instructions.add(lfalse + ":");

      if (ctx.bloque().size() > 1) {
        visit(ctx.bloque(1));
      } else if (ctx.instruccion() != null) {
        visit(ctx.instruccion());
      }

      instructions.add(lend + ":");
    }

    return null;
  }

  @Override
  public String visitWhile(idParser.WhileContext ctx) {
    String lstart = newLabel();
    String lend = newLabel();

    instructions.add(lstart + ":");

    String cond = visit(ctx.expresion_booleana());
    instructions.add("ifFalse " + cond + " goto " + lend);

    visit(ctx.bloque());

    instructions.add("goto " + lstart);

    instructions.add(lend + ":");

    return null;
  }

  @Override
  public String visitFor(idParser.ForContext ctx) {
    // 1. Inicialización
    if (ctx.for_declaracion() != null) {
      visit(ctx.for_declaracion());
    }

    String lstart = newLabel();
    String lend = newLabel();

    // 2. Etiqueta de inicio
    instructions.add(lstart + ":");

    // 3. Condición
    String cond = visit(ctx.expresion_booleana());
    instructions.add("ifFalse " + cond + " goto " + lend);

    // 4. Cuerpo del for
    visit(ctx.bloque());

    // 5. Autoincremental
    if (ctx.for_autoincremental() != null) {
      visit(ctx.for_autoincremental());
    }

    // 6. Volver al inicio
    instructions.add("goto " + lstart);

    // 7. Etiqueta de salida
    instructions.add(lend + ":");

    return null;
  }

  @Override
  public String visitFor_autoincremental(idParser.For_autoincrementalContext ctx) {
    String var = ctx.IDENTIFICADOR().getText();

    if (ctx.INCREMENTADOR() != null) {
      instructions.add(var + " = " + var + " + 1");
    } else if (ctx.DECREMENTADOR() != null) {
      instructions.add(var + " = " + var + " - 1");
    }

    if (ctx.for_autoincremental() != null) {
      for (idParser.For_autoincrementalContext subInc : ctx.for_autoincremental()) {
        visit(subInc);
      }
    }

    return null;
  }

  @Override
  public String visitFor_declaracion(idParser.For_declaracionContext ctx) {
    String tipo = ctx.tipo_variable().getText();

    for (idParser.Declarador_inicializadoContext decl : ctx.declarador_inicializado()) {
      String nombreVar = decl.IDENTIFICADOR(0).getText();
      instructions.add("DECLARE " + nombreVar + " " + tipo);
      if (decl.NUMERO() != null) {
        instructions.add(nombreVar + " = " + decl.NUMERO().getText());
      } else if (decl.NUMERO_DOUBLE() != null) {
        instructions.add(nombreVar + " = " + decl.NUMERO_DOUBLE().getText());
      } else if (decl.IDENTIFICADOR().size() > 1) {
        instructions.add(nombreVar + " = " + decl.IDENTIFICADOR(1).getText());
      } else if (decl.CARACTER() != null) {
        instructions.add(nombreVar + " = " + decl.CARACTER().getText());
      } else if (decl.expresion_aritmetica() != null) {
        String resultado = visitExpresion_aritmetica(decl.expresion_aritmetica());
        instructions.add(nombreVar + " = " + resultado);
      } else if (decl.expresion_booleana() != null) {
        String resultado = visitExpresion_booleana(decl.expresion_booleana());
        instructions.add(nombreVar + " = " + resultado);
      }
    }

    return null;
  }

  @Override
  public String visitDeclaracion_funcion(idParser.Declaracion_funcionContext ctx) {
    StringBuilder sb = new StringBuilder();

    String tipo = ctx.tipo_funciones().getText();
    String nombre = ctx.declaracion_funcion_identificador().getText();

    sb.append("FUNC DECLARE ").append(nombre).append(" : ").append(tipo);

    if (ctx.declaracion_funciones_parametros() != null) {
      String params = visit(ctx.declaracion_funciones_parametros());
      sb.append(" (").append(params).append(")");
    } else {
      sb.append(" ()");
    }

    sb.append(";");

    instructions.add(sb.toString());

    return sb.toString();
  }

  @Override
  public String visitDeclaracion_funciones_parametros(idParser.Declaracion_funciones_parametrosContext ctx) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < ctx.declaracion_funcion_parametro().size(); i++) {
      sb.append(visit(ctx.declaracion_funcion_parametro(i)));
      if (i < ctx.declaracion_funcion_parametro().size() - 1) {
        sb.append(", ");
      }
    }
    return sb.toString();
  }

  @Override
  public String visitDeclaracion_funcion_parametro(idParser.Declaracion_funcion_parametroContext ctx) {
    String tipo = ctx.tipo_variable().getText();
    String nombre = "";
    if (ctx.IDENTIFICADOR() != null) {
      nombre = ctx.IDENTIFICADOR().getText();
    }
    String inicializacion = "";
    if (ctx.declaracion_funcion_parametro_inicializado() != null) {
      inicializacion = " = " + ctx.declaracion_funcion_parametro_inicializado().getText();
    }
    return tipo + " " + nombre + inicializacion;
  }

  @Override
  public String visitDefinicion_funcion(idParser.Definicion_funcionContext ctx) {
    String tipo = ctx.tipo_funciones().getText();
    String nombre = ctx.definicion_funcion_nombre().getText();

    String params = "";
    if (ctx.definicion_funcion_parametros() != null) {
      idParser.Definicion_funcion_parametrosContext paramCtx = ctx.definicion_funcion_parametros();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < paramCtx.definicion_funcion_parametro().size(); i++) {
        sb.append(visit(paramCtx.definicion_funcion_parametro(i)));
        if (i < paramCtx.definicion_funcion_parametro().size() - 1) {
          sb.append(", ");
        }
      }
      params = sb.toString();
    }

    instructions.add("DEF_FUNC " + nombre + "(" + params + ") : " + tipo);

    visit(ctx.bloque());

    instructions.add("END_FUNC");
    return null;
  }

  @Override
  public String visitDefinicion_funcion_parametro(idParser.Definicion_funcion_parametroContext ctx) {
    String tipo = ctx.tipo_variable().getText();
    String nombre = ctx.definicion_funcion_parametro_nombre().getText();

    String inicializacion = "";
    if (ctx.declaracion_funcion_parametro_inicializado() != null) {
      inicializacion = ctx.declaracion_funcion_parametro_inicializado().getText();
    }

    return tipo + " " + nombre + inicializacion;
  }

  @Override
  public String visitReturn(idParser.ReturnContext ctx) {
    String valorRetorno = null;

    if (ctx.return_variables() != null) {
      if (ctx.return_variables().NUMERO() != null) {
        valorRetorno = ctx.return_variables().NUMERO().getText();
      } else if (ctx.return_variables().NUMERO_DOUBLE() != null) {
        valorRetorno = ctx.return_variables().NUMERO_DOUBLE().getText();
      } else if (ctx.return_variables().CARACTER() != null) {
        valorRetorno = ctx.return_variables().CARACTER().getText();
      } else if (ctx.return_variables().return_variable_identificador() != null) {
        valorRetorno = ctx.return_variables().return_variable_identificador().getText();
      }
    }

    if (valorRetorno != null && (valorRetorno.startsWith("t") || valorRetorno.contains("CALL"))) {
      String temp = newTemp();
      instructions.add(temp + " = " + valorRetorno);
      instructions.add("RETURN " + temp);
    } else {
      instructions.add("RETURN " + valorRetorno);
    }

    return null;
  }

}

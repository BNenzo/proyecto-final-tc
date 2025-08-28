package app;

import org.antlr.v4.runtime.tree.ParseTree;

public class MiVisitor extends idBaseVisitor<String> {
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
      System.out.println(temp + " = " + left + " " + op + " " + right);
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
      System.out.println(temp + " = " + left + " " + op + " " + right);
      left = temp;
    }
    return left;
  }

  @Override
  public String visitFactor(idParser.FactorContext ctx) {
    if (ctx.NUMERO() != null) {
      return ctx.NUMERO().getText();
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

    System.out.println("DECLARE " + nombreVar + " " + tipo);
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

    System.out.println("DECLARE " + nombreVar + " " + tipo);
    if (ctx.NUMERO() != null) {
      System.out.println(nombreVar + " = " + ctx.NUMERO().getText());
    } else if (ctx.IDENTIFICADOR().size() > 1) {
      System.out.println(nombreVar + " = " + ctx.IDENTIFICADOR(1).getText());
    } else if (ctx.CARACTER() != null) {
      System.out.println(nombreVar + " = " + ctx.CARACTER().getText());
    } else if (ctx.expresion_aritmetica() != null) {
      String resultado = visitExpresion_aritmetica(ctx.expresion_aritmetica());
      System.out.println(nombreVar + " = " + resultado);
    } else if (ctx.expresion_booleana() != null) {
      String resultado = visitExpresion_booleana(ctx.expresion_booleana());
      System.out.println(nombreVar + " = " + resultado);
    }

    return null;
  }

  @Override
  public String visitAsignacion_variable(idParser.Asignacion_variableContext ctx) {
    String variable = ctx.asignacion_variable_identificador().getText();
    if (ctx.NUMERO() != null) {
      System.out.println(variable + " = " + ctx.NUMERO().getText());
    } else if (ctx.CARACTER() != null) {
      System.out.println(variable + " = " + ctx.CARACTER().getText());
    } else if (ctx.expresion_aritmetica() != null) {
      String resultado = visitExpresion_aritmetica(ctx.expresion_aritmetica());
      System.out.println(variable + " = " + resultado);
    } else if (ctx.expresion_booleana() != null) {
      String resultado = visitExpresion_booleana(ctx.expresion_booleana());
      System.out.println(variable + " = " + resultado);
    } else if (ctx.llamada_funcion_expresion() != null) {
      String resultado = visit(ctx.llamada_funcion_expresion());
      String temp = newTemp();
      System.out.println(temp + " = " + resultado);
      System.out.println(variable + " = " + temp);
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

    System.out.println("CALL " + functionName + arguments);
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
      System.out.println(temp + " = " + left + " " + op + " " + right);
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
      System.out.println(temp + " = " + left + " " + op + " " + right);
      return temp;
    }

    return null;
  }

  @Override
  public String visitTermino_comparacion(idParser.Termino_comparacionContext ctx) {
    if (ctx.NUMERO() != null) {
      return ctx.NUMERO().getText();
    } else if (ctx.CADENA() != null) {
      return ctx.CADENA().getText();
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
      System.out.println("ifFalse " + cond + " goto " + lfalse);

      if (!ctx.bloque().isEmpty()) {
        visit(ctx.bloque(0));
      } else if (ctx.instruccion() != null) {
        visit(ctx.instruccion());
      }

      System.out.println(lfalse + ":");
    } else {
      System.out.println("ifFalse " + cond + " goto " + lfalse);

      if (!ctx.bloque().isEmpty()) {
        visit(ctx.bloque(0));
      } else if (ctx.instruccion() != null) {
        visit(ctx.instruccion());
      }

      System.out.println("goto " + lend);
      System.out.println(lfalse + ":");

      if (ctx.bloque().size() > 1) {
        visit(ctx.bloque(1));
      } else if (ctx.instruccion() != null) {
        visit(ctx.instruccion());
      }

      System.out.println(lend + ":");
    }

    return null;
  }
}

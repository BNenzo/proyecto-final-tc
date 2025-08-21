package app;

public class MiVisitor extends idBaseVisitor<String> {
  private int tempCount = 0;

  private String newTemp() {
    return "t" + (tempCount++);
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
  public String visitAsignacion_variable(idParser.Asignacion_variableContext ctx) {
    String variable = ctx.asignacion_variable_identificador().getText();
    String lastTemp = null;

    for (idParser.Operacion_aritmeticaContext opCtx : ctx.operacion_aritmetica()) {
      lastTemp = visit(opCtx);
    }

    for (idParser.Operacion_logicaContext logCtx : ctx.operacion_logica()) {
      lastTemp = visit(logCtx);
    }

    System.out.println(variable + " = " + lastTemp);
    return lastTemp;
  }

  @Override
  public String visitDeclaracion_variable(idParser.Declaracion_variableContext ctx) {
    visit(ctx.declaracion_variable_declaradores());
    return null;
  }

  public String visitDeclaracion_variable_declaradores(idParser.Declaracion_variable_declaradoresContext ctx) {

    if (ctx.declarador_simple() != null) {
      visit(ctx.declarador_simple());
    }

    if (ctx.declarador_inicializado() != null) {
      visit(ctx.declarador_inicializado());
    }

    return null;
  }

  @Override
  public String visitDeclarador_simple(idParser.Declarador_simpleContext ctx) {
    String varName = ctx.IDENTIFICADOR().getText();
    System.out.println("Declarado: " + varName);
    return varName;
  }

  @Override
  public String visitDeclarador_inicializado(idParser.Declarador_inicializadoContext ctx) {
    String varName = ctx.getStart().getText();
    String valueTemp = null;

    if (ctx.NUMERO() != null) {
      valueTemp = ctx.NUMERO().getText();
    } else if (ctx.IDENTIFICADOR(1) != null) {
      valueTemp = ctx.IDENTIFICADOR(1).getText();
    } else if (ctx.expresion_aritmetica() != null) {
      valueTemp = visit(ctx.expresion_aritmetica());
    } else if (ctx.expresion_booleana() != null) {
      valueTemp = visit(ctx.expresion_booleana());
    } else if (ctx.CARACTER() != null) {
      valueTemp = ctx.CARACTER().getText();
    }

    System.out.println(varName + " = " + valueTemp);
    return varName;
  }
}

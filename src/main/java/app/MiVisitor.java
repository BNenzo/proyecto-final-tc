package app;

import org.antlr.v4.runtime.tree.ParseTree;

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
  public String visitDeclaracion_variable(idParser.Declaracion_variableContext ctx) {
    // tipo_variable

    // declaradores (podemos recorrerlos, pero ahora nos centramos en
    // declarador_simple)

    visit(ctx.declaracion_variable_declaradores());
    return null;

  }

  @Override
  public String visitDeclarador_simple(idParser.Declarador_simpleContext ctx) {
    String nombreVar = ctx.IDENTIFICADOR().getText();
    // Necesitamos también el tipo → está un nivel arriba
    // El tipo viene del padre declaracion_variable
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

}

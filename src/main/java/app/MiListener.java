package app;

public class MiListener extends idBaseListener {
  private TipoDato tipoDatoAux;
  private boolean error = false;

  MiListener(idParser parser) {
  }

  @Override
  public void enterBloque(idParser.BloqueContext ctx) {
    TablaSimbolos.getInstance().addContext();
  }

  @Override
  public void exitBloque(idParser.BloqueContext ctx) {
    System.out.println("sddsadsa");
  }

  // @Override
  public void enterDeclaracion_variables(idParser.Declaracion_variablesContext ctx) {
    this.tipoDatoAux = TipoDato.fromString(ctx.getStart().getText());
  }

  // @Override
  public void exitDeclaracion_variables(idParser.Declaracion_variablesContext ctx) {
    this.tipoDatoAux = TipoDato.UNDEFINED;
  }

  @Override
  public void enterDeclaracion_variable_asignacion(idParser.Declaracion_variable_asignacionContext ctx) {
    TablaSimbolos tableInstance = TablaSimbolos.getInstance();
    String tokenStr = ctx.getStart().getText();

    boolean isTokenAlreadyDeclared = tableInstance.searchIdInContext(tokenStr,
        tableInstance.getContextosLogicosSize());

    if (isTokenAlreadyDeclared) {
      error = true;
      System.err.println("Error: Duplicated declaration of Token: "
          + tokenStr + ", In line: " + ctx.getStart().getLine());
      return;
    }

    MiId newId = new MiId(tokenStr, true, false, tipoDatoAux);
    tableInstance.addId(newId);
  }

  @Override
  public void enterDeclaracion_variable_simple(idParser.Declaracion_variable_simpleContext ctx) {
    TablaSimbolos tableInstance = TablaSimbolos.getInstance();
    String tokenStr = ctx.getStart().getText();

    boolean isTokenAlreadyDeclared = tableInstance.searchIdInContext(tokenStr,
        tableInstance.getContextosLogicosSize());

    if (isTokenAlreadyDeclared) {
      error = true;
      System.err.println("Error: Duplicated declaration of Token: "
          + tokenStr + ", In line: " + ctx.getStart().getLine());
      return;
    }

    MiId newId = new MiId(tokenStr, false, false, tipoDatoAux);
    tableInstance.addId(newId);
  }

  @Override
  public void exitS(idParser.SContext ctx) {

    if (error)
      return;

    TablaSimbolos.getInstance().readTable();
  }

}

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

  /* ---------------------- DECLARACIONES ------------------------------- */
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

  /* ---------------------- OPERACIONES LOGICAS ------------------------------- */

  @Override
  public void enterIdentificador_logico(idParser.Identificador_logicoContext ctx) {
    TablaSimbolos tableInstance = TablaSimbolos.getInstance();
    String tokenStr = ctx.getStart().getText();
    boolean tokenAlreadyDeclarated = false;

    for (int i = 0; i < tableInstance.getContextosLogicosSize() + 1; i++) {
      MiId id = tableInstance.getElementByKey(tokenStr, i);

      if (id != null) {
        tokenAlreadyDeclarated = true;
        id.setUsada(true);
        break;
      }
    }

    if (!tokenAlreadyDeclarated) {
      System.err.println("Error: Undeclarated Token: "
          + tokenStr + ", In line: " + ctx.getStart().getLine());
      error = true;
      return;
    }
  }

  /* ---------------------- OPERACIONES ARITMETICAS -------------------------- */

  @Override
  public void enterIdentificador_aritmetico(idParser.Identificador_aritmeticoContext ctx) {
    TablaSimbolos tableInstance = TablaSimbolos.getInstance();
    String tokenStr = ctx.getStart().getText();
    boolean tokenAlreadyDeclarated = false;

    for (int i = 0; i < tableInstance.getContextosLogicosSize() + 1; i++) {
      MiId id = tableInstance.getElementByKey(tokenStr, i);

      if (id != null) {
        tokenAlreadyDeclarated = true;
        id.setUsada(true);
        break;
      }
    }

    if (!tokenAlreadyDeclarated) {
      System.err.println("Error: Undeclarated Token: "
          + tokenStr + ", In line: " + ctx.getStart().getLine());
      error = true;
      return;
    }

  }

  @Override
  public void exitS(idParser.SContext ctx) {

    if (error)
      return;

    TablaSimbolos.getInstance().readTable();
  }

}

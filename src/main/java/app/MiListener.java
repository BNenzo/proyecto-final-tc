package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MiListener extends idBaseListener {
  private boolean error = false;
  TablaSimbolos tableInstance = TablaSimbolos.getInstance();

  // Utilidades
  String idAux = "";
  private TipoDato tipoDatoAux;
  private int parameterCountAux = 0;
  private List<LinkedHashMap<String, MiId>> functionAux = null;

  MiListener(idParser parser) {
  }

  @Override
  public void enterBloque(idParser.BloqueContext ctx) {
    tableInstance.addContext();
  }

  @Override
  public void exitBloque(idParser.BloqueContext ctx) {
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
    String tokenStr = ctx.getStart().getText();

    boolean isTokenAlreadyDeclared = tableInstance.searchIdInContext(tokenStr,
        tableInstance.getContextosLogicosSize());

    if (isTokenAlreadyDeclared) {
      error = true;
      System.err.println("Error: Duplicated declaration of Token: "
          + tokenStr + ", In line: " + ctx.getStart().getLine());
      return;
    }

    MiId newId = new MiId(tokenStr, true, false, tipoDatoAux, false);
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

    MiId newId = new MiId(tokenStr, false, false, tipoDatoAux, false);
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

  /* --------- FUNCIONES ----------- */
  @Override
  public void enterDeclaracion_funcion(idParser.Declaracion_funcionContext ctx) {
    String tokenStr = ctx.getStart().getText();
    this.tipoDatoAux = TipoDato.fromString(tokenStr);
  }

  public void exitDeclaracion_funcion(idParser.Declaracion_funcionContext ctx) {
    this.tipoDatoAux = TipoDato.UNDEFINED;
    parameterCountAux = 0;
    idAux = "";
  }

  @Override
  public void enterDeclaracion_funcion_identificador(idParser.Declaracion_funcion_identificadorContext ctx) {
    Map<String, List<LinkedHashMap<String, MiId>>> tablaFunciones = tableInstance.getTablaFunciones();
    // idAux es el nombre de la funcion
    idAux = ctx.getStart().getText();
    tableInstance.AddFunctionToTable(idAux);
    MiId functionId = new MiId(idAux, true, false, tipoDatoAux, true);
    LinkedHashMap<String, MiId> baseContextFunction = new LinkedHashMap<String, MiId>();
    baseContextFunction.put(idAux, functionId);
    tablaFunciones.get(idAux).add(baseContextFunction);
  }

  @Override
  public void enterParametro_funcion(idParser.Parametro_funcionContext ctx) {
    String tokenStr = ctx.getStart().getText();
    Map<String, List<LinkedHashMap<String, MiId>>> tablaFunciones = tableInstance.getTablaFunciones();
    System.out.println("parameterCountAux " + parameterCountAux);
    String paramName = "param_" + parameterCountAux;
    MiId paramId = new MiId(paramName, true, false, TipoDato.fromString(tokenStr), false);
    System.out.println(paramId);
    tablaFunciones.get(idAux).get(0).put(paramName, paramId);
    parameterCountAux++;
  }

  // ------------------------------- DEFINICION FUNCION --------------------------
  @Override
  public void enterDefinicion_funcion(idParser.Definicion_funcionContext ctx) {
    String tokenStr = ctx.getStart().getText();
    this.tipoDatoAux = TipoDato.fromString(tokenStr);
  }

  public void exitDefinicion_funcion(idParser.Definicion_funcionContext ctx) {
    this.tipoDatoAux = TipoDato.UNDEFINED;
    this.functionAux = null;
    this.idAux = "";
    this.parameterCountAux = 0;
  }

  @Override
  public void enterDefinicion_nombre_funcion(idParser.Definicion_nombre_funcionContext ctx) {
    String tokenStr = ctx.getStart().getText();
    Map<String, List<LinkedHashMap<String, MiId>>> tablaFunciones = tableInstance.getTablaFunciones();
    this.functionAux = tablaFunciones.get(tokenStr);
    idAux = tokenStr;

    if (functionAux == null) {
      tableInstance.AddFunctionToTable(tokenStr);
      MiId functionId = new MiId(tokenStr, true, false, tipoDatoAux, true);
      LinkedHashMap<String, MiId> newFunctionMap = new LinkedHashMap<>();
      newFunctionMap.put(tokenStr, functionId);
      tablaFunciones.get(idAux).add(newFunctionMap);
    }
  }

  @Override
  public void enterDefinicion_funcion_parametro(idParser.Definicion_funcion_parametroContext ctx) {
    String tokenStr = ctx.getStart().getText();
    tipoDatoAux = TipoDato.fromString(tokenStr);
  }

  @Override
  public void enterDefinicion_funcion_parametro_nombre(idParser.Definicion_funcion_parametro_nombreContext ctx) {

    Map<String, List<LinkedHashMap<String, MiId>>> tablaFunciones = tableInstance.getTablaFunciones();
    List<LinkedHashMap<String, MiId>> functionMap = tablaFunciones.get(idAux);
    String paramName = ctx.getStart().getText();
    MiId id = new MiId(paramName, true, false, tipoDatoAux, false);
    String oldParamKey = "param_" + parameterCountAux;
    System.out.println("FLAG 1");
    if (functionAux == null) {
      functionMap.get(0).put(paramName, id);
      return;
    }
    System.out.println("FLAG 2");

    if (functionMap.get(0).size() <= 1)
      return;

    // if (functionMap.get(0).size() - 2 < parameterCountAux) {
    // error = true;
    // System.out.println("Error: Function definition of " + idAux
    // + " has more parameters than its declaration, at line " +
    // ctx.getStart().getLine());
    // return;
    // }

    MiId paramPreviouslyDeclared = functionMap.get(0).get("param_" + parameterCountAux);

    if (paramPreviouslyDeclared.getTipoDato() != tipoDatoAux) {
      error = true;
      System.out.println("Error: Parameter should be of type " +
          paramPreviouslyDeclared.getTipoDato()
          + " but is of type " + tipoDatoAux + ", at line " +
          ctx.getStart().getLine());
      return;
    }

    LinkedHashMap<String, MiId> newFunctionMap = new LinkedHashMap<>();

    functionMap.get(0).forEach((key, value) -> {
      newFunctionMap.put(
          key.equals(oldParamKey) ? paramName : key,
          key.equals(oldParamKey) ? id : value);
    });

    tablaFunciones.put(idAux, Collections.singletonList(newFunctionMap));

    parameterCountAux++;
  }

  @Override
  public void enterLlamada_nombre_funcion(idParser.Llamada_nombre_funcionContext ctx) {
    String functionName = ctx.getStart().getText();
    Map<String, List<LinkedHashMap<String, MiId>>> tablaFunciones = tableInstance.getTablaFunciones();
    List<LinkedHashMap<String, MiId>> function = tablaFunciones.get(functionName);

    if (function == null) {
      System.out.println("Error: Function " + functionName + ", is not declarated, line " + ctx.getStart().getLine());
      error = true;
      return;
    }

    functionAux = function;
  }

  @Override
  public void enterLlamada_funcion_parametro_valores(idParser.Llamada_funcion_parametro_valoresContext ctx) {
    parameterCountAux++;
    String idValue = ctx.getStart().getText();
    String type = identificarTipo(idValue);

    if (type == "variable")
      return;

    TipoDato tipoDatoParametro = TipoDato.fromString(type);
    List<MiId> valuesList = new ArrayList<>(functionAux.get(0).values());

    if (tipoDatoParametro == valuesList.get(parameterCountAux).getTipoDato())
      return;

    System.out.println("Error: value " + idValue + " does not match with the type of the parameter num: "
        + parameterCountAux + " prevoisly declarated" + " (" + type + "->"
        + valuesList.get(parameterCountAux).getTipoDato() + " )");
    error = true;
  }

  @Override
  public void exitLlamada_funcion(idParser.Llamada_funcionContext ctx) {
    functionAux = null;
    parameterCountAux = 0;
  }

  @Override
  public void enterLlamada_funcion_parametro_valor_identificador(
      idParser.Llamada_funcion_parametro_valor_identificadorContext ctx) {
    String idValue = ctx.getStart().getText();
    MiId id = tableInstance.findByKey(idValue);
    System.out.println("FLAG3");

    if (id == null) {
      System.out.println("Error");
      error = true;
      return;
    }

    System.out.println("FLAG4");
    System.out.println(functionAux);
    List<MiId> valuesList = new ArrayList<>(functionAux.get(0).values());

    System.out.println("FLAG5");
    System.out.println(id);

    if (id.getTipoDato() == valuesList.get(parameterCountAux).getTipoDato())
      return;

    System.out.println("FLAG6");

    System.out.println("Error: value " + idValue + " does not match with the type of the parameter num: "
        + parameterCountAux + " prevoisly declarated" + " (" + id.getTipoDato() + "->"
        + valuesList.get(parameterCountAux).getTipoDato() + " )");

    error = true;
  }

  public static String identificarTipo(String input) {

    if (input.matches("^\".*\"$")) {
      return "string";
    }

    if (input.matches("^-?\\d+$")) {
      return "int";
    }

    if (input.matches("^-?\\d*\\.\\d+$")) {
      return "double";
    }

    if (input.matches("^[a-zA-Z_$][a-zA-Z\\d_$]*$")) {
      return "variable";
    }

    return input;
  }

  @Override
  public void exitS(idParser.SContext ctx) {

    if (error)
      return;

    TablaSimbolos.getInstance().readTable();
    System.out.println("");
    System.out.println("Funciones:");
    System.out.println("");
    TablaSimbolos.getInstance().imprimirTablaFunciones();
  }

}

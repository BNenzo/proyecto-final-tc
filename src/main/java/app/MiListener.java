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
  private Function functionAux = null;

  MiListener(idParser parser) {
  }

  @Override
  public void enterBloque(idParser.BloqueContext ctx) {
    tableInstance.addContext(idAux);
  }

  @Override
  public void exitBloque(idParser.BloqueContext ctx) {
    tableInstance.closeLastActiveContext(idAux);
  }

  // @Override
  public void enterDeclaracion_variable(idParser.Declaracion_variableContext ctx) {
    this.tipoDatoAux = TipoDato.fromString(ctx.getStart().getText());
  }

  // @Override
  public void exitDeclaracion_variable(idParser.Declaracion_variableContext ctx) {
    this.tipoDatoAux = TipoDato.UNDEFINED;
  }

  /* ---------------------- DECLARACIONES ------------------------------- */
  @Override
  public void enterDeclarador_inicializado(idParser.Declarador_inicializadoContext ctx) {
    String idTokenStr = ctx.getStart().getText();
    MiId id = tableInstance.findIdInLastActiveContext(idTokenStr, idAux);

    if (id != null) {
      error = true;
      System.err.println("Error: Duplicated declaration of Token: "
          + idTokenStr + ", In line: " + ctx.getStart().getLine());
      return;
    }

    MiId newId = new MiId(idTokenStr, true, false, tipoDatoAux, false);

    tableInstance.addId(newId, idAux);
  }

  @Override
  public void enterDeclarador_simple(idParser.Declarador_simpleContext ctx) {
    String idTokenStr = ctx.getStart().getText();
    MiId id = tableInstance.findIdInLastActiveContext(idTokenStr, idAux);

    if (id != null) {
      error = true;
      System.err.println("Error: Duplicated declaration of Token: "
          + idTokenStr + ", In line: " + ctx.getStart().getLine());
      return;
    }

    MiId newId = new MiId(idTokenStr, false, false, tipoDatoAux, false);

    tableInstance.addId(newId, idAux);
  }

  /* ---------------------- OPERACIONES LOGICAS ------------------------------- */

  @Override
  public void enterIdentificador_logico(idParser.Identificador_logicoContext ctx) {
    String tokenStr = ctx.getStart().getText();
    MiId id = tableInstance.checkIfIdIsAlreadyDeclarated(tokenStr, idAux);

    if (id == null) {
      System.err.println("Error: Undeclarated Token: "
          + tokenStr + ", In line: " + ctx.getStart().getLine());
      error = true;
      return;
    }

    id.setUsada(true);
  }

  /* ---------------------- OPERACIONES ARITMETICAS ---------------------- */

  @Override
  public void enterIdentificador_aritmetico(idParser.Identificador_aritmeticoContext ctx) {
    String tokenStr = ctx.getStart().getText();
    MiId id = tableInstance.checkIfIdIsAlreadyDeclarated(tokenStr, idAux);

    if (id == null) {
      System.err.println("Error: Undeclarated Token: "
          + tokenStr + ", In line: " + ctx.getStart().getLine());
      error = true;
      return;
    }

    id.setUsada(true);
  }

  /* ---------------------- DECLARACION FUNCION ---------------------- */

  @Override
  public void enterDeclaracion_funcion(idParser.Declaracion_funcionContext ctx) {
    String functionTypeStr = ctx.getStart().getText();
    this.tipoDatoAux = TipoDato.fromString(functionTypeStr);
  }

  public void exitDeclaracion_funcion(idParser.Declaracion_funcionContext ctx) {
    this.tipoDatoAux = TipoDato.UNDEFINED;
    this.parameterCountAux = 0;
    this.idAux = "";
  }

  @Override
  public void enterDeclaracion_funcion_identificador(idParser.Declaracion_funcion_identificadorContext ctx) {
    /*
     * Se obtiene el nombre de la funcion
     * Se guarda en la variable auxiliar idAux para su posterior uso
     * Se genera un nuevo map en la tabla de funciones
     */
    String functionName = ctx.getStart().getText();
    idAux = functionName;
    tableInstance.AddFunctionToTable(functionName);

    // Se genera un MiId con el nombre de la funcion para guardar informacion
    MiId functionId = new MiId(idAux, true, false, tipoDatoAux, true);
    tableInstance.getTablaFunciones().get(functionName).setFunctionId(functionId);
  }

  /*
   * Variables usadas de otras reglas
   * 
   * enterDeclaracion_funcion_identificador -> idAux (nombre de la funcion)
   */
  @Override
  public void enterDeclaracion_funcion_parametro(idParser.Declaracion_funcion_parametroContext ctx) {
    Map<String, Function> tablaFunciones = tableInstance.getTablaFunciones();
    String parameterType = ctx.getStart().getText();

    /*
     * Se generan nombres aleatorios ya que la definicion del nombre en la
     * declaracion de una funcion no es relevante
     * 
     * parameterCountAux -> cantidad de parametros que van
     */
    String parameterName = "param_" + parameterCountAux;
    MiId parameterId = new MiId(parameterName, true, false, TipoDato.fromString(parameterType), false);
    tablaFunciones.get(idAux).addIdInParameters(parameterId);
    parameterCountAux++;
  }

  // ---------------------- DEFINICION FUNCION ----------------------

  @Override
  public void enterDefinicion_funcion(idParser.Definicion_funcionContext ctx) {
    String functionType = ctx.getStart().getText();
    this.tipoDatoAux = TipoDato.fromString(functionType);
  }

  public void exitDefinicion_funcion(idParser.Definicion_funcionContext ctx) {
    this.tipoDatoAux = TipoDato.UNDEFINED;
    this.functionAux = null;
    this.idAux = "";
    this.parameterCountAux = 0;
  }

  /*
   * Variables cargadas de otras reglas
   * 
   * enterDefinicion_funcion -> tipoDatoAux (tipo de la funcion)
   */
  @Override
  public void enterDefinicion_funcion_nombre(idParser.Definicion_funcion_nombreContext ctx) {
    Map<String, Function> tablaFunciones = tableInstance.getTablaFunciones();

    String functionName = ctx.getStart().getText();
    this.functionAux = tablaFunciones.get(functionName);
    this.idAux = functionName;

    /*
     * En caso de no existir, se inserta a la tabla de funciones
     */
    if (functionAux == null) {
      tableInstance.AddFunctionToTable(functionName);
      MiId functionId = new MiId(functionName, true, false, tipoDatoAux, true);
      tablaFunciones.get(functionName).setFunctionId(functionId);
    }

    // FALTA: que pasa si la funcion existe pero su tipo es distinto al tipo que se
    // esta definiendo
  }

  @Override
  public void enterDefinicion_funcion_parametro(idParser.Definicion_funcion_parametroContext ctx) {
    String parameterType = ctx.getStart().getText();
    this.tipoDatoAux = TipoDato.fromString(parameterType);
  }

  /*
   * Variables cargadas de otras reglas
   * 
   * enterDefinicion_funcion_nombre -> functionAux (contextos de la funcion)
   * enterDefinicion_funcion_nombre -> idAux (nombre de la funcion)
   * enterDefinicion_funcion_parametro -> tipoDatoAux (tipo del parametro)
   */
  @Override
  public void enterDefinicion_funcion_parametro_nombre(idParser.Definicion_funcion_parametro_nombreContext ctx) {
    Map<String, Function> tablaFunciones = tableInstance.getTablaFunciones();
    // 100% la funcion esta cargada en la tabla
    Function function = tablaFunciones.get(idAux);
    String parameterName = ctx.getStart().getText();
    MiId id = new MiId(parameterName, true, false, this.tipoDatoAux, false);
    String oldParamKey = "param_" + parameterCountAux;

    /*
     * Si functionAux es null significa que es una funcion que no fue declarada
     * Por ende no hay parametros que reemplazar
     */
    if (functionAux == null) {
      function.addIdInParameters(id);
      return;
    }

    /*
     * Caso en donde la funcion no fue declarada con parametros
     */
    if (function.getFunctionParameters().size() == 0)
      return;

    /*
     * Caso en donde la definicion tiene mas parametros que su declaracion
     */
    if (function.getFunctionParameters().size() - 1 < parameterCountAux) {
      error = true;
      System.out.println("Error: Function definition of " + idAux
          + " has more parameters than its declaration, at line " +
          ctx.getStart().getLine());
      return;
    }

    /*
     * Caso donde el parametro declarado y definido difieren en su tipado
     */
    MiId parameterPreviouslyDeclared = function.getFunctionParameters().get("param_" + parameterCountAux);

    if (parameterPreviouslyDeclared.getTipoDato() != tipoDatoAux) {
      error = true;
      System.out.println("Error: Parameter should be of type " +
          parameterPreviouslyDeclared.getTipoDato()
          + " but is of type " + tipoDatoAux + ", at line " +
          ctx.getStart().getLine());
      return;
    }

    /*
     * Proceso en donde se reemplaza el parametro anteriormente declarado con el
     * nuevo
     */
    LinkedHashMap<String, MiId> newParameters = new LinkedHashMap<String, MiId>();

    function.getFunctionParameters().forEach((key, value) -> {
      newParameters.put(
          key.equals(oldParamKey) ? parameterName : key,
          key.equals(oldParamKey) ? id : value);
    });

    function.setParameters(newParameters);
    parameterCountAux++;
  }

  // ---------------------- LLAMADA FUNCION ----------------------
  @Override
  public void exitLlamada_funcion(idParser.Llamada_funcionContext ctx) {
    functionAux = null;
    parameterCountAux = 0;
  }

  @Override
  public void enterLlamada_nombre_funcion(idParser.Llamada_nombre_funcionContext ctx) {
    Map<String, Function> tablaFunciones = tableInstance.getTablaFunciones();
    String functionName = ctx.getStart().getText();
    Function function = tablaFunciones.get(functionName);

    if (function == null) {
      System.out.println("Error: Function " + functionName + ", is not declarated, line " + ctx.getStart().getLine());
      error = true;
      return;
    }

    functionAux = function;
  }

  /*
   * enterLlamada_nombre_funcion -> functionAux (los contextos de la funcion
   * llamada)
   */
  @Override
  public void enterLlamada_funcion_argumentos(idParser.Llamada_funcion_argumentosContext ctx) {

    if (error) {
      return;
    }

    // idValue puede ser, un valor nativo (int, char) o una variable
    String idValue = ctx.getStart().getText();
    String type = identificarTipo(idValue);

    // Si es variable se procesa en otra regla
    if (type == "variable")
      return;

    // el tipo del valor nativo
    TipoDato parameterType = TipoDato.fromString(type);

    // Se obtienen los valores del primer contexto de la funcion
    List<MiId> parametersList = new ArrayList<>(functionAux.getFunctionParameters().values());

    // Se compara el tipo del valor nativo con el parametro relacionado
    if (parameterType != parametersList.get(parameterCountAux).getTipoDato()) {
      System.out.println("Error: value " + idValue + " does not match with the type of the parameter num: "
          + parameterCountAux + " prevoisly declarated" + " (" + parameterType + "->"
          + parametersList.get(parameterCountAux).getTipoDato() + " )");
      error = true;
      return;
    }

    parameterCountAux++;
  }

  @Override
  public void enterLlamada_funcion_argumento_identificador(
      idParser.Llamada_funcion_argumento_identificadorContext ctx) {
    String idValue = ctx.getStart().getText();
    MiId id = tableInstance.checkIfIdIsAlreadyDeclarated(idValue, idAux);

    if (id == null) {
      System.out.println("Error");
      error = true;
      return;
    }

    List<MiId> parametersList = new ArrayList<>(functionAux.getFunctionParameters().values());

    if (id.getTipoDato() != parametersList.get(parameterCountAux).getTipoDato()) {
      System.out.println("Error: value " + idValue + " does not match with the type of the parameter num: "
          + parameterCountAux + " prevoisly declarated" + " (" + id.getTipoDato() + "->"
          + parametersList.get(parameterCountAux).getTipoDato() + " )");
      error = true;
      return;
    }

    id.setUsada(true);
  }

  public static String identificarTipo(String input) {

    if (input.matches("^'([^\\\\']|\\\\[btnr0'\"\\\\])'$")) {
      return "char";
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

    TablaSimbolos.getInstance().displayTable();
  }

}

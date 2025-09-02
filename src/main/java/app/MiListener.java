package app;

import java.util.ArrayList;
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
  private Function functionCallAux = null;

  private String getCurrentScope() {
    return (functionAux != null) ? functionAux.getFunctionId().getToken() : "global";
  }

  /*
   * Variables cargadas de otras reglas
   * 
   * enterDefinicion_funcion_nombre -> functionAux (funcion en la que estamos, si
   * es null significa que es el ambito global)
   */
  private MiId validateVariableUsage(String idTokenStr, int line, int column) {
    String scope = functionAux.getFunctionId().getToken();
    MiId id = tableInstance.checkIfIdIsAlreadyDeclarated(idTokenStr, scope);

    if (id == null) {
      Utils.printError("Error: Variable '" + idTokenStr + "' no declarada en el ámbito '"
          + scope + "' (línea " + line + ", columna " + column + ")");
      error = true;
    }

    return id;
  }

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

  /* ---------------------- DECLARACIONES ------------------------------- */
  @Override
  public void enterDeclaracion_variable(idParser.Declaracion_variableContext ctx) {
    // Obtener el tipo de dato de la variable
    this.tipoDatoAux = TipoDato.fromString(ctx.tipo_variable().getText());
  }

  @Override
  public void exitDeclaracion_variable(idParser.Declaracion_variableContext ctx) {
    this.tipoDatoAux = TipoDato.UNDEFINED;
  }

  @Override
  public void enterDeclarador_inicializado(idParser.Declarador_inicializadoContext ctx) {
    String idTokenStr = ctx.getStart().getText();
    validateVariableDeclarations(idTokenStr, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), true);
  }

  @Override
  public void enterDeclarador_simple(idParser.Declarador_simpleContext ctx) {
    String idTokenStr = ctx.getStart().getText();
    validateVariableDeclarations(idTokenStr, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), false);
  }

  /*
   * Variables cargadas de otras reglas
   * 
   * enterDeclaracion_variable -> tipoDatoAux (tipo de la variable/s)
   * enterDefinicion_funcion_nombre -> functionAux (funcion en la que estamos, si
   * es null significa que es el ambito global)
   */
  private void validateVariableDeclarations(String idTokenStr, int line, int column, Boolean inicializado) {
    MiId newId = new MiId(idTokenStr, inicializado, false, tipoDatoAux);

    String scope = getCurrentScope();

    MiId id = (functionAux != null)
        ? tableInstance.findIdInLastActiveContext(idTokenStr, idAux)
        : tableInstance.checkIfGlobalVariableIsAlreadyDeclarated(idTokenStr);

    if (id != null) {
      error = true;
      Utils.printAlreadyDeclarationError(idTokenStr, scope, line, column);
      return;
    }

    tableInstance.addId(newId, idAux);
  }

  /* ---------------------- ASIGNACIONES ------------------------------- */
  /*
   * Variables cargadas de otras reglas
   * 
   * enterDefinicion_funcion_nombre -> functionAux (funcion en la que estamos, si
   * es null significa que es el ambito global)
   */
  @Override
  public void enterAsignacion_variable(idParser.Asignacion_variableContext ctx) {
    String idTokenStr = ctx.asignacion_variable_identificador().getText();

    if (functionAux == null) {
      Utils.printError(
          "Error: No se pueden realizar asignaciones en el ambito global " + "' (línea " + ctx.getStart().getLine()
              + ", columna " + ctx.getStart().getCharPositionInLine() + ")");
      error = true;
      return;
    }

    MiId id = validateVariableUsage(idTokenStr, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());

    if (id == null)
      return;

    id.setInicializada(true);
  }

  /* ---------------------- OPERACIONES LOGICAS ------------------------------- */

  @Override
  public void enterIdentificador_logico(idParser.Identificador_logicoContext ctx) {
    String idTokenStr = ctx.getStart().getText();

    if (functionAux == null) {
      Utils.printError(
          "Error: No se pueden realizar operaciones logicas en el ambito global " + "' (línea "
              + ctx.getStart().getLine()
              + ", columna " + ctx.getStart().getCharPositionInLine() + ")");
      error = true;
      return;
    }

    MiId id = validateVariableUsage(idTokenStr, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());

    if (id == null)
      return;

    id.setUsada(true);
  }

  /* ---------------------- OPERACIONES ARITMETICAS ---------------------- */

  @Override
  public void enterIdentificador_aritmetico(idParser.Identificador_aritmeticoContext ctx) {
    String idTokenStr = ctx.getStart().getText();
    System.out.println(idAux);
    if (functionAux == null) {
      Utils.printError(
          "Error: No se pueden realizar operaciones aritmeticas en el ambito global " + "' (línea "
              + ctx.getStart().getLine()
              + ", columna " + ctx.getStart().getCharPositionInLine() + ")");
      error = true;
      return;
    }

    MiId id = validateVariableUsage(idTokenStr, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());

    if (id == null)
      return;

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
    MiId functionId = new MiId(idAux, true, false, tipoDatoAux);
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
    MiId parameterId = new MiId(parameterName, true, false, TipoDato.fromString(parameterType));
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
      MiId functionId = new MiId(functionName, false, false, tipoDatoAux);
      Function function = tablaFunciones.get(functionName);
      function.setFunctionId(functionId);
      functionAux = function;
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
    MiId id = new MiId(parameterName, true, false, this.tipoDatoAux);
    String oldParamKey = "param_" + parameterCountAux;

    /*
     * Si functionAux es null significa que es una funcion que no fue declarada
     * Por ende no hay parametros que reemplazar
     */
    if (function.getFunctionId().getInicializada() == false) {
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
      System.out.println("❌ Error: La definicion de la funcion " + idAux
          + " tiene mas parametros que su previa declaracion (linea " + ctx.getStart().getLine() + ")");
      return;
    }

    /*
     * Caso donde el parametro declarado y definido difieren en su tipado
     */
    MiId parameterPreviouslyDeclared = function.getFunctionParameters().get("param_" + parameterCountAux);

    if (parameterPreviouslyDeclared.getTipoDato() != tipoDatoAux) {
      error = true;
      System.out.println(
          "❌ Error: El parametro fue declarado previamente de tipo: " + parameterPreviouslyDeclared.getTipoDato()
              + ", pero en su definicion esta siendo nombrado de tipo: " + tipoDatoAux + ", En el ambito: "
              + function.getFunctionId().getToken() + " (linea " + ctx.getStart().getLine() + ")");
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
    functionCallAux = null;
    parameterCountAux = 0;
  }

  @Override
  public void enterLlamada_nombre_funcion(idParser.Llamada_nombre_funcionContext ctx) {
    Map<String, Function> tablaFunciones = tableInstance.getTablaFunciones();
    String functionName = ctx.getStart().getText();
    Function function = tablaFunciones.get(functionName);

    if (function == null) {
      System.out.println("❌ Error: La funcion " + functionName + " No ha sido declarada en el ambito global (linea "
          + ctx.getStart().getLine() + ")");
      error = true;
      return;
    }

    functionCallAux = function;
  }

  /*
   * enterLlamada_nombre_funcion -> functionCallAux (los contextos de la funcion
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
    List<MiId> parametersList = new ArrayList<>(functionCallAux.getFunctionParameters().values());

    // Se compara el tipo del valor nativo con el parametro relacionado
    if (parameterType != parametersList.get(parameterCountAux).getTipoDato()) {
      System.out.println("❌ Error: el valor " + idValue
          + " no coincide con el tipo del parámetro 'num' en la posición "
          + parameterCountAux
          + ", declarado previamente como "
          + parameterType
          + " (se esperaba "
          + parametersList.get(parameterCountAux).getTipoDato() + ")");
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
      System.err.println("❌ Error: Variable '" + idValue + "' no declarada en el ambito "
          + "por definir" + " (linea " + ctx.getStart().getLine() + ")"); // checkear el ambito
      error = true;
      return;
    }

    List<MiId> parametersList = new ArrayList<>(functionCallAux.getFunctionParameters().values());

    if (id.getTipoDato() != parametersList.get(parameterCountAux).getTipoDato()) {
      System.out.println("❌ Error: el valor " + idValue
          + " no coincide con el tipo del parámetro 'num' en la posición "
          + parameterCountAux
          + ", declarado previamente como "
          + id.getTipoDato()
          + " (se esperaba "
          + parametersList.get(parameterCountAux).getTipoDato() + ")");

      error = true;
      return;
    }

    id.setUsada(true);
  }

  @Override
  public void enterReturn_variables(idParser.Return_variablesContext ctx) {
    String idValue = ctx.getStart().getText();
    String type = identificarTipo(idValue);

    // Si es variable se procesa en otra regla
    if (type == "variable")
      return;

    TipoDato returnVariableType = TipoDato.fromString(type);

    if (functionAux.getFunctionId().getTipoDato() != returnVariableType) {
      System.out.println("Error: la función "
          + functionAux.getFunctionId().getToken()
          + " esperaba retornar una variable de tipo "
          + functionAux.getFunctionId().getTipoDato()
          + ", pero se está devolviendo un valor de tipo "
          + returnVariableType);
      error = true;
      return;
    }

  }

  @Override
  public void enterReturn_variable_identificador(idParser.Return_variable_identificadorContext ctx) {
    String idValue = ctx.getStart().getText();

    MiId id = tableInstance.checkIfIdIsAlreadyDeclarated(idValue,
        functionAux.getFunctionId().getToken());

    if (id == null) {
      System.err.println("❌ Error: Variable '" + idValue + "' no declarada en el ambito "
          + functionAux.getFunctionId().getToken() + " (linea " + ctx.getStart().getLine() + ")");
      error = true;
      return;
    }

    id.setUsada(true);
    return;
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

    // TablaSimbolos.getInstance().displayTable();
    TablaSimbolos.getInstance().displayTableFormat();

  }

}

package app;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MiListener extends idBaseListener {
  private boolean error = false;
  TablaSimbolos tableInstance = TablaSimbolos.getInstance();

  // Utilidades
  private TipoDato tipoDatoAux;
  private Boolean shouldAddContext = true;
  private String currentScope = "";

  /*
   * Variables cargadas de otras reglas
   * 
   * enterDefinicion_funcion_nombre -> currentScope (funcion en la que estamos, si
   * es "" significa que es el ambito global)
   */
  private MiId validateVariableUsage(String idTokenStr, int line, int column) {
    MiId id = tableInstance.checkIfIdIsAlreadyDeclarated(idTokenStr, currentScope);

    if (id == null) {
      Utils.printError("Error: Variable '" + idTokenStr + "' no declarada en el ámbito '"
          + currentScope + "' (línea " + line + ", columna " + column + ")");
      error = true;
    }

    return id;
  }

  MiListener(idParser parser) {
  }

  @Override
  public void enterBloque(idParser.BloqueContext ctx) {
    if (shouldAddContext == true) {
      tableInstance.addContext(currentScope);
    }
    shouldAddContext = true;
  }

  @Override
  public void exitBloque(idParser.BloqueContext ctx) {
    tableInstance.closeLastActiveContext(currentScope);
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
   * enterDefinicion_funcion_nombre -> currentScope (funcion en la que estamos, si
   * es "" significa que es el ambito global)
   */
  private void validateVariableDeclarations(String idTokenStr, int line, int column, Boolean inicializado) {
    MiId newId = new MiId(idTokenStr, inicializado, false, tipoDatoAux);
    String scope = (currentScope != "") ? currentScope : "global";
    MiId id = (currentScope != "")
        ? tableInstance.findIdInLastActiveContext(idTokenStr, scope)
        : tableInstance.checkIfGlobalVariableIsAlreadyDeclarated(idTokenStr);

    if (id != null) {
      error = true;
      Utils.printAlreadyDeclarationError(idTokenStr, scope, line, column);
      return;
    }

    tableInstance.addId(newId, currentScope);
  }

  /* ---------------------- ASIGNACIONES ------------------------------- */
  /*
   * Variables cargadas de otras reglas
   * 
   * enterDefinicion_funcion_nombre -> currentScope (funcion en la que estamos, si
   * es "" significa que es el ambito global)
   */
  @Override
  public void enterAsignacion_variable(idParser.Asignacion_variableContext ctx) {
    String idTokenStr = ctx.asignacion_variable_identificador().getText();

    if (currentScope == "") {
      Utils.printError(
          "Error: No se pueden realizar asignaciones en el ambito global " + " (línea " + ctx.getStart().getLine()
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

    if (currentScope == "") {
      Utils.printError(
          "Error: No se pueden realizar operaciones logicas en el ambito global " + " (línea "
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
    if (currentScope == "") {
      Utils.printError(
          "Error: No se pueden realizar operaciones aritmeticas en el ambito global " + " (línea "
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

    // --- 1. Info básica de la función ---
    String functionName = ctx.declaracion_funcion_identificador().getText();
    TipoDato functionType = TipoDato.fromString(ctx.getStart().getText());

    // --- 2. Parámetros de la definición ---
    // Se obtienen todos los parametros que estan siendo usados en la declaracion
    List<MiId> parametersList = new ArrayList<>();
    idParser.Declaracion_funciones_parametrosContext parametrosCtx = ctx.declaracion_funciones_parametros();
    if (parametrosCtx != null) {
      for (idParser.Declaracion_funcion_parametroContext parametroCtx : parametrosCtx.declaracion_funcion_parametro()) {
        TipoDato parameterType = TipoDato.fromString(parametroCtx.tipo_variable().getText());
        // El nombre no nos importa, solo el tipo, asi que autogeneramos nombres
        parametersList.add(new MiId("param_" + parametersList.size(), true, false, parameterType));
      }
    }

    // --- 3. Firma de la función ---
    String functionSign = Utils.getFunctionSign(functionName, parametersList);
    tableInstance.AddFunctionToTable(functionSign);

    Function function = tableInstance.getTablaFunciones().get(functionSign);
    MiId functionId = new MiId(functionSign, false, false, functionType);
    function.setFunctionId(functionId);

    // --- 4. Se agregan los parametros ---
    for (MiId parameter : parametersList) {
      function.getFunctionParameters().put(parameter.getToken(), parameter);
    }
  }

  // ---------------------- DEFINICION FUNCION ----------------------

  @Override
  public void enterDefinicion_funcion(idParser.Definicion_funcionContext ctx) {
    Map<String, Function> tablaFunciones = tableInstance.getTablaFunciones();

    // --- 1. Info básica de la función ---
    String returnTypeStr = ctx.getStart().getText();
    TipoDato returnType = TipoDato.fromString(returnTypeStr);
    String functionName = ctx.definicion_funcion_nombre().getText();

    // --- 2. Parámetros de la definición ---
    List<MiId> parametersList = Utils.extractParameters(ctx.definicion_funcion_parametros());

    // --- 3. Firma de la función ---
    String functionSign = Utils.getFunctionSign(functionName, parametersList);
    currentScope = functionSign;

    Function existingFunction = tablaFunciones.get(functionSign);

    // --- 4. Validar si coincide con una función ya declarada ---
    boolean sameFunction = Utils.isSameFunction(existingFunction, parametersList);

    // --- 5. Si es la misma función, validar tipo de retorno ---
    if (existingFunction != null && sameFunction &&
        existingFunction.getFunctionId().getTipoDato() != returnType) {

      Utils.printError("Error: Ambigua nueva declaración para la función: " + functionName +
          ", se espera retorno: " + existingFunction.getFunctionId().getTipoDato());
      error = true;
      return;
    }

    // --- 6. Si coincide con la declarada, actualizar parámetros e inicialización
    if (existingFunction != null && sameFunction) {
      LinkedHashMap<String, MiId> newParams = new LinkedHashMap<>();
      for (MiId p : parametersList) {
        newParams.put(p.getToken(), p);
      }
      existingFunction.setParameters(newParams);
      existingFunction.getFunctionId().setInicializada(true);
    }

    // --- 7. Si no existe o es una sobrecarga distinta, insertar nueva ---
    if (existingFunction == null || !sameFunction) {
      tableInstance.AddFunctionToTable(functionSign);
      MiId functionId = new MiId(
          functionSign,
          true,
          functionName.equals("main"),
          returnType);
      existingFunction = tablaFunciones.get(functionSign);
      existingFunction.setFunctionId(functionId);

      for (MiId p : parametersList) {
        existingFunction.addIdInParameters(p);
      }
    }
  }

  public void exitDefinicion_funcion(idParser.Definicion_funcionContext ctx) {
    this.currentScope = "";
  }

  // ---------------------- LLAMADA FUNCION ----------------------
  @Override
  public void enterLlamada_funcion_expresion(idParser.Llamada_funcion_expresionContext ctx) {
    Map<String, Function> tablaFunciones = tableInstance.getTablaFunciones();
    String functionName = ctx.llamada_nombre_funcion().getText();

    List<String> argumentsTypes = new ArrayList<>();
    idParser.Llamada_funcion_parametrosContext argumentosCtx = ctx.llamada_funcion_parametros();
    if (argumentosCtx != null) {
      for (idParser.Llamada_funcion_argumentosContext argumentoCtx : argumentosCtx.llamada_funcion_argumentos()) {

        if (argumentoCtx.llamada_funcion_argumento_identificador() != null) {
          String argumentId = argumentoCtx.llamada_funcion_argumento_identificador().getText();
          MiId id = tableInstance.checkIfIdIsAlreadyDeclarated(argumentId, currentScope);

          if (id == null) {
            Utils.printError("Error: Variable '" + argumentId + "' no declarada en el ambito "
                + currentScope
                + " (linea "
                + argumentoCtx.llamada_funcion_argumento_identificador().getStart().getLine()
                + ", Columna: "
                + argumentoCtx.llamada_funcion_argumento_identificador().getStart().getCharPositionInLine()
                + ")");
            error = true;
            return;
          }
          argumentsTypes.add(id.getTipoDato().toString().toLowerCase());
        }

        if (argumentoCtx.NUMERO() != null) {
          argumentsTypes.add("int");
        }

        if (argumentoCtx.NUMERO_DOUBLE() != null) {
          argumentsTypes.add("double");
        }

        if (argumentoCtx.CARACTER() != null) {
          argumentsTypes.add("char");
        }
      }
    }

    String functionSign = Utils.buildFunctionSignatureFromStringList(functionName, argumentsTypes);
    Function function = tablaFunciones.get(functionSign);

    if (function == null) {
      Utils.printError(
          "Error: La funcion "
              + functionName
              + " No ha sido declarada en el ambito global (linea "
              + ctx.llamada_nombre_funcion().getStart().getLine()
              + ", Columna "
              + ctx.llamada_nombre_funcion().getStart().getCharPositionInLine()
              + ")");
      error = true;
      return;
    }

    function.getFunctionId().setUsada(true);
  }

  // ---------------------- RETURN ----------------------

  @Override
  public void enterReturn_variable_identificador(idParser.Return_variable_identificadorContext ctx) {
    String idValue = ctx.getStart().getText();

    MiId id = tableInstance.checkIfIdIsAlreadyDeclarated(idValue, currentScope);

    if (id == null) {
      System.err.println("❌ Error: Variable '" + idValue + "' no declarada en el ambito "
          + currentScope + " (linea " + ctx.getStart().getLine() + ")");
      error = true;
      return;
    }

    id.setUsada(true);
    return;
  }

  // ---------------------- FOR ----------------------
  @Override
  public void enterFor(idParser.ForContext ctx) {
    tableInstance.addContext(currentScope);
    shouldAddContext = false;
  }

  @Override
  public void enterFor_declaracion(idParser.For_declaracionContext ctx) {
    tipoDatoAux = TipoDato.fromString(ctx.getStart().getText());
  }

  @Override
  public void enterFor_autoincremental(idParser.For_autoincrementalContext ctx) {

    String tokenIdStr = ctx.getStart().getText();
    MiId id = validateVariableUsage(tokenIdStr, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());

    if (id == null) {
      return;
    }

    id.setUsada(true);
  }

  @Override
  public void exitS(idParser.SContext ctx) {

    if (error)
      return;

    // TablaSimbolos.getInstance().displayTable();
    TablaSimbolos.getInstance().displayTableFormat();

  }

}

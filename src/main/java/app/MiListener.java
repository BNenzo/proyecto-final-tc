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
  private String currentScope = "";

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
    tableInstance.addContext(currentScope);
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
   * enterDefinicion_funcion_nombre -> functionAux (funcion en la que estamos, si
   * es null significa que es el ambito global)
   */
  private void validateVariableDeclarations(String idTokenStr, int line, int column, Boolean inicializado) {
    MiId newId = new MiId(idTokenStr, inicializado, false, tipoDatoAux);
    String scope = getCurrentScope();
    MiId id = (functionAux != null)
        ? tableInstance.findIdInLastActiveContext(idTokenStr, currentScope)
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

    // Se obtiene la informacion necesaria para
    String functionName = ctx.declaracion_funcion_identificador().getText();
    TipoDato functionType = TipoDato.fromString(ctx.getStart().getText());

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
    // Obtenemos la firma de la funcion
    String functionSign = Utils.getFunctionSign(functionName, parametersList);
    tableInstance.AddFunctionToTable(functionSign);

    Function function = tableInstance.getTablaFunciones().get(functionSign);
    MiId functionId = new MiId(functionSign, false, false, functionType);
    function.setFunctionId(functionId);

    // Se cargan los parametros
    for (MiId parameter : parametersList) {
      function.getFunctionParameters().put(parameter.getToken(), parameter);
    }
  }

  // ---------------------- DEFINICION FUNCION ----------------------

  @Override
  public void enterDefinicion_funcion(idParser.Definicion_funcionContext ctx) {

    Map<String, Function> tablaFunciones = tableInstance.getTablaFunciones();

    // Se obtiene la informacion basica de la funcion que esta siendo definida
    String functionDefinitionType = ctx.getStart().getText();
    TipoDato functionDefinitionTypeParsed = TipoDato.fromString(functionDefinitionType);
    String functionDefinitionName = ctx.definicion_funcion_nombre().getText();

    // Se obtienen todos los parametros que estan siendo usados en la definicion de
    // esta funcion
    List<MiId> parametersList = new ArrayList<>();
    idParser.Definicion_funcion_parametrosContext parametrosCtx = ctx.definicion_funcion_parametros();
    if (parametrosCtx != null) {
      for (idParser.Definicion_funcion_parametroContext parametroCtx : parametrosCtx.definicion_funcion_parametro()) {
        TipoDato parameterType = TipoDato.fromString(parametroCtx.tipo_variable().getText());
        String parameterName = parametroCtx.definicion_funcion_parametro_nombre().getText();
        parametersList.add(new MiId(parameterName, true, false, parameterType));
      }
    }

    /*
     * Se obtiene la firma de la funcion
     * La firma se compone del nombre de la funcion y de los tipos de los parametros
     * 
     */
    String functionSign = Utils.getFunctionSign(functionDefinitionName, parametersList);
    currentScope = functionSign;
    Function functionAlreadyDeclarated = tablaFunciones
        .get(functionSign);

    /*
     * Proceso para determinar si la funcion definida y declarada tienen la misma
     * firma
     */
    Boolean isTheSameFunction = true;
    // Si la funcion ya fue declarada anteriormente en (declaracion funcion)
    if (functionAlreadyDeclarated != null) {
      int i = 0;
      functionAux = functionAlreadyDeclarated;

      /*
       * Se comprueba si la cantidad de parametros de la funcion declarada es distinto
       * a la cantidad de parametros de la nueva funcion
       */
      if (functionAlreadyDeclarated.getFunctionParameters().size() != parametersList.size()) {
        isTheSameFunction = false;
      }

      /*
       * Se comprueba si el tipado de los parametros en cada posicion coinciden
       * 
       */
      if (isTheSameFunction == true) {
        for (MiId paramFromMap : functionAlreadyDeclarated.getFunctionParameters().values()) {
          MiId paramFromList = parametersList.get(i);

          if (paramFromMap.getTipoDato() != paramFromList.getTipoDato()) {
            isTheSameFunction = false;
            break;
          }
          i++;
        }
      }
    }

    /*
     * Si tienen la misma cantidad de parametros y el mismo orden de tipado
     * se asume que son la misma funcion, y se comprueba el tipo que retornan ambas
     * si son diferentes hay un error
     */
    if (functionAlreadyDeclarated != null && isTheSameFunction == true
        && functionAlreadyDeclarated.getFunctionId().getTipoDato() != TipoDato.fromString(functionDefinitionType)) {
      Utils.printError("Error: Ambigua nueva declaracion para la funcion: " + functionDefinitionName
          + ", Se espera que la definicion retorne: " + functionAlreadyDeclarated.getFunctionId().getTipoDato());
      error = true;
      return;
    }

    /*
     * Si son la misma funcion se reemplaza la lista de parametros con la nueva
     * Ya que si fue declarada los parametros son param_0, param_1, etc
     */
    if (functionAlreadyDeclarated != null && isTheSameFunction == true) {
      LinkedHashMap<String, MiId> newParameters = new LinkedHashMap<String, MiId>();
      if (parametersList.size() != 0) {
        for (MiId parameter : parametersList) {
          newParameters.put(parameter.getToken(), parameter);
        }
      }
      functionAlreadyDeclarated.setParameters(newParameters);
      functionAlreadyDeclarated.getFunctionId().setInicializada(true);
    }

    /*
     * Si functionAlreadyDeclarated es null significa que no hubo declaracion previa
     * Pero si es distinto de null y isTheSameFunction es false,
     * signfica que no es la misma que fue declarada antes
     * 
     * En ambos casos se inserta la nueva funcion
     */
    if (functionAlreadyDeclarated == null || (functionAlreadyDeclarated != null && isTheSameFunction == false)) {
      tableInstance.AddFunctionToTable(functionSign);
      MiId functionId = new MiId(functionSign, true, functionDefinitionName.equals("main"),
          functionDefinitionTypeParsed);
      functionAlreadyDeclarated = tablaFunciones.get(functionSign);
      functionAlreadyDeclarated.setFunctionId(functionId);
      if (parametersList.size() != 0) {
        for (MiId parameter : parametersList) {
          functionAlreadyDeclarated.addIdInParameters(parameter);
        }
      }
      functionAux = functionAlreadyDeclarated;
    }

  }

  public void exitDefinicion_funcion(idParser.Definicion_funcionContext ctx) {
    this.tipoDatoAux = TipoDato.UNDEFINED;
    this.functionAux = null;
    this.idAux = "";
    this.currentScope = "";
    this.parameterCountAux = 0;
  }

  // ---------------------- LLAMADA FUNCION ----------------------
  @Override
  public void exitLlamada_funcion(idParser.Llamada_funcionContext ctx) {
    functionCallAux = null;
    parameterCountAux = 0;
  }

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

  @Override
  public void enterReturn_variable_identificador(idParser.Return_variable_identificadorContext ctx) {
    String idValue = ctx.getStart().getText();

    MiId id = tableInstance.checkIfIdIsAlreadyDeclarated(idValue, currentScope);

    if (id == null) {
      System.err.println("❌ Error: Variable '" + idValue + "' no declarada en el ambito "
          + functionAux.getFunctionId().getToken() + " (linea " + ctx.getStart().getLine() + ")");
      error = true;
      return;
    }

    id.setUsada(true);
    return;
  }

  @Override
  public void exitS(idParser.SContext ctx) {

    if (error)
      return;

    // TablaSimbolos.getInstance().displayTable();
    TablaSimbolos.getInstance().displayTableFormat();

  }

}

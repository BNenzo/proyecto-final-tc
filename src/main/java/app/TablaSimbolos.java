package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablaSimbolos {
  private static TablaSimbolos tabla_instance = null;

  private Map<String, Function> tablaFunciones;
  private Map<String, MiId> globalVariables;
  private List<String> warnings = new ArrayList<>();

  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  private List<String> errors = new ArrayList<>();

  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  public Map<String, Function> getTablaFunciones() {
    return tablaFunciones;
  }

  private TablaSimbolos() {
    this.tablaFunciones = new HashMap<>();
    this.globalVariables = new HashMap<>();
  }

  public void AddFunctionToTable(String functionName) {
    tablaFunciones.put(functionName, new Function());
  }

  public void closeLastActiveContext(String functionName) {
    List<Context> contexts = tablaFunciones.get(functionName).getFunctionContexts();
    for (int i = contexts.size() - 1; i >= 0; i--) {
      Context ctx = contexts.get(i);
      if (ctx.isActive()) {
        ctx.close();
        break;
      }
    }
  }

  public void addId(MiId id, String functionName) {

    if (functionName == "") {
      globalVariables.put(id.getToken(), id);
      return;
    }

    Context lastActiveContext = Utils.getLastActiveContext(tablaFunciones.get(functionName).getFunctionContexts());
    lastActiveContext.getVariables().put(id.getToken(), id);
  }

  public void addContext(String functionName) {
    tablaFunciones.get(functionName).getFunctionContexts().add(new Context());
  }

  public void displayTable() {

    System.out.println("VARIABLES GLOBALES");
    for (Map.Entry<String, MiId> entry : globalVariables.entrySet()) {
      MiId valor = entry.getValue();
      System.out.println(valor);
    }

    System.out.println("");

    System.out.println("Contextos");
    for (Map.Entry<String, Function> entry : tablaFunciones.entrySet()) {
      System.out.println(entry.getValue());
    }
  }

  public void displayTableFormat() {
    for (Map.Entry<String, MiId> entry : globalVariables.entrySet()) {
      MiId valor = entry.getValue();
      System.out.printf("%-15s %-8s %-12s %-7d %-8d %-10s %-10s %-10s%n",
          valor.getToken(), valor.getTipoDato(), "variable", valor.getLine(), valor.getColumn(), "global",
          valor.getUsada(), valor.getInicializada());
    }
    for (Map.Entry<String, Function> entry : tablaFunciones.entrySet()) {
      MiId functionId = entry.getValue().getFunctionId();
      System.out.printf("%-15s %-8s %-12s %-7d %-8d %-10s %-10s %-10s%n",
          Utils.getFunctionNameFromSign(functionId.getToken()),
          functionId.getTipoDato(),
          "function",
          functionId.getLine(),
          functionId.getColumn(),
          "global",
          functionId.getUsada(),
          functionId.getInicializada());
      for (Map.Entry<String, MiId> entry2 : entry.getValue().getFunctionParameters().entrySet()) {
        MiId parameterId = entry2.getValue();
        System.out.printf("%-15s %-8s %-12s %-7d %-8d %-10s %-10s %-10s%n",
            parameterId.getToken(),
            parameterId.getTipoDato(),
            "parameter",
            parameterId.getLine(),
            parameterId.getColumn(),
            Utils.getFunctionNameFromSign(functionId.getToken()),
            parameterId.getUsada(),
            parameterId.getInicializada());
      }
      for (Context context : entry.getValue().getFunctionContexts()) {
        for (Map.Entry<String, MiId> entry3 : context.getVariables().entrySet()) {
          MiId variableId = entry3.getValue();
          System.out.printf("%-15s %-8s %-12s %-7d %-8d %-10s %-10s %-10s%n",
              variableId.getToken(),
              variableId.getTipoDato(),
              "variable",
              variableId.getLine(),
              variableId.getColumn(),
              Utils.getFunctionNameFromSign(entry.getValue().getFunctionId().getToken()),
              variableId.getUsada(),
              variableId.getInicializada());
        }

      }
    }
  }

  public void validateWarnings() {

    for (Map.Entry<String, MiId> entry : globalVariables.entrySet()) {
      MiId valor = entry.getValue();
      Utils.getIdWarnings(valor, warnings);
    }
    for (Map.Entry<String, Function> entry : tablaFunciones.entrySet()) {
      MiId functionId = entry.getValue().getFunctionId();
      Utils.getIdWarnings(functionId, warnings);

      for (Map.Entry<String, MiId> entry2 : entry.getValue().getFunctionParameters().entrySet()) {
        MiId parameterId = entry2.getValue();
        Utils.getIdWarnings(parameterId, warnings);

      }
      for (Context context : entry.getValue().getFunctionContexts()) {
        for (Map.Entry<String, MiId> entry3 : context.getVariables().entrySet()) {
          MiId variableId = entry3.getValue();
          Utils.getIdWarnings(variableId, warnings);
        }

      }
    }
  }

  public MiId findIdInLastActiveContext(String idToken, String functionName) {
    Context lastActiveContext = Utils.getLastActiveContext(tablaFunciones.get(functionName).getFunctionContexts());
    return lastActiveContext.getVariables().get(idToken);
  }

  public MiId checkIfIdIsAlreadyDeclarated(String idToken, String functionName) {
    Function function = tablaFunciones.get(functionName);
    List<Context> contexts = function.getFunctionContexts();
    MiId id = null;
    for (int i = contexts.size() - 1; i >= 0; i--) {
      Context context = contexts.get(i);
      if (context.isActive() && id == null) {
        id = context.getVariables().get(idToken);
      }
    }

    if (id == null) {
      id = function.getFunctionParameters().get(idToken);
    }

    if (id == null) {
      id = globalVariables.get(idToken);
    }

    return id;
  }

  public MiId checkIfGlobalVariableIsAlreadyDeclarated(String idToken) {
    MiId id = globalVariables.get(idToken);
    return id;
  }

  public void addError(String error) {
    errors.add(error);
  }

  public static TablaSimbolos getInstance() {
    if (tabla_instance == null)
      tabla_instance = new TablaSimbolos();

    return tabla_instance;
  }

}

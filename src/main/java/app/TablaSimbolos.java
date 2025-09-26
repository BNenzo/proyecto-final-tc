package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablaSimbolos {
  private static TablaSimbolos tabla_instance = null;

  private Map<String, Function> functionTable;
  private Map<String, MiId> globalVariables;
  private List<String> errors = new ArrayList<>();
  private List<String> warnings = new ArrayList<>();

  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  public Map<String, Function> getFunctionTable() {
    return functionTable;
  }

  private TablaSimbolos() {
    this.functionTable = new HashMap<>();
    this.globalVariables = new HashMap<>();
  }

  public void AddFunctionToTable(String functionName) {
    functionTable.put(functionName, new Function());
  }

  public void closeFunctionLastActiveContext(String functionName) {
    Function function = functionTable.get(functionName);
    function.closeLastActiveContext();
  }

  public void addId(MiId id, String functionName) {

    if (functionName == "") {
      globalVariables.put(id.getToken(), id);
      return;
    }

    functionTable.get(functionName).getLastActiveContext().addVariable(id);
  }

  public void addFunctionContext(String functionName) {
    functionTable.get(functionName).addContext();
  }

  public void displayTable() {

    System.out.println("VARIABLES GLOBALES");
    for (Map.Entry<String, MiId> entry : globalVariables.entrySet()) {
      MiId valor = entry.getValue();
      System.out.println(valor);
    }

    System.out.println("");

    System.out.println("Contextos");
    for (Map.Entry<String, Function> entry : functionTable.entrySet()) {
      System.out.println(entry.getValue());
    }
  }

  public void displayTableFormat() {
    for (Map.Entry<String, MiId> entry : globalVariables.entrySet()) {
      MiId valor = entry.getValue();
      System.out.printf("%-15s %-8s %-12s %-7d %-8d %-10s %-10s %-10s%n",
          valor.getToken(), valor.getType(), "variable", valor.getLine(), valor.getColumn(), "global",
          valor.getUsed(), valor.getInitialized());
    }
    for (Map.Entry<String, Function> entry : functionTable.entrySet()) {
      MiId functionId = entry.getValue().getFunctionId();
      System.out.printf("%-15s %-8s %-12s %-7d %-8d %-10s %-10s %-10s%n",
          Utils.getFunctionNameFromSign(functionId.getToken()),
          functionId.getType(),
          "function",
          functionId.getLine(),
          functionId.getColumn(),
          "global",
          functionId.getUsed(),
          functionId.getInitialized());
      for (Map.Entry<String, MiId> entry2 : entry.getValue().getParameters().entrySet()) {
        MiId parameterId = entry2.getValue();
        System.out.printf("%-15s %-8s %-12s %-7d %-8d %-10s %-10s %-10s%n",
            parameterId.getToken(),
            parameterId.getType(),
            "parameter",
            parameterId.getLine(),
            parameterId.getColumn(),
            Utils.getFunctionNameFromSign(functionId.getToken()),
            parameterId.getUsed(),
            parameterId.getInitialized());
      }
      for (Context context : entry.getValue().getFunctionContexts()) {
        for (Map.Entry<String, MiId> entry3 : context.getVariables().entrySet()) {
          MiId variableId = entry3.getValue();
          System.out.printf("%-15s %-8s %-12s %-7d %-8d %-10s %-10s %-10s%n",
              variableId.getToken(),
              variableId.getType(),
              "variable",
              variableId.getLine(),
              variableId.getColumn(),
              Utils.getFunctionNameFromSign(entry.getValue().getFunctionId().getToken()),
              variableId.getUsed(),
              variableId.getInitialized());
        }

      }
    }
  }

  public void validateWarnings() {
    for (Map.Entry<String, MiId> entry : globalVariables.entrySet()) {
      MiId valor = entry.getValue();
      Utils.getIdWarnings(valor, warnings);
    }
    for (Map.Entry<String, Function> entry : functionTable.entrySet()) {
      MiId functionId = entry.getValue().getFunctionId();
      Utils.getIdWarnings(functionId, warnings);

      for (Map.Entry<String, MiId> entry2 : entry.getValue().getParameters().entrySet()) {
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
    return functionTable.get(functionName).getLastActiveContext().getVariableByTokenString(idToken);
  }

  public MiId checkIfIdIsAlreadyDeclarated(String idToken, String functionName) {
    Function function = functionTable.get(functionName);
    MiId id = function.getVaribleByTokenString(idToken);

    if (id == null) {
      id = function.getParameterByTokenString(idToken);
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

  public void reset() {
    this.functionTable.clear();
    this.globalVariables.clear();
    this.errors.clear();
    this.warnings.clear();
  }

  public static TablaSimbolos getInstance() {
    if (tabla_instance == null)
      tabla_instance = new TablaSimbolos();

    return tabla_instance;
  }

}

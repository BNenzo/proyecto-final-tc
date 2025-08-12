package app;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Function {
  private LinkedHashMap<String, MiId> parameters;
  private List<Context> contexts;
  private MiId functionId;

  public Function() {
    parameters = new LinkedHashMap<>();
    contexts = new ArrayList<>();
    functionId = new MiId(null, null, null, null, null);
  }

  public MiId getFunctionId() {
    return functionId;
  }

  public void setFunctionId(MiId functionId) {
    this.functionId = functionId;
  }

  public void setParameters(LinkedHashMap<String, MiId> parameters) {
    this.parameters = parameters;
  }

  public List<Context> getFunctionContexts() {
    return contexts;
  }

  public LinkedHashMap<String, MiId> getFunctionParameters() {
    return parameters;
  }

  public void addIdInParameters(MiId id) {
    parameters.put(id.getToken(), id);
  }

  @Override
  public String toString() {
    String result = "Function " + functionId.getToken() + ": {" + "\n";

    result += "  ID: " + functionId + "\n";

    result += "  parameters:\n";
    if (parameters == null || parameters.isEmpty()) {
      result += "    (no parameters)\n";
    } else {
      for (Map.Entry<String, MiId> entry : parameters.entrySet()) {
        result += "    " + entry.getKey() + " -> " + entry.getValue() + "\n";
      }
    }

    result += "  contexts:\n";
    if (contexts == null || contexts.isEmpty()) {
      result += "    (no contexts)\n";
    } else {
      for (int i = 0; i < contexts.size(); i++) {
        result += "    Context #" + i + ":\n";
        String contextStr = contexts.get(i).toString();
        for (String line : contextStr.split("\n")) {
          result += "      " + line + "\n";
        }
      }
    }
    result += "}";
    return result;
  }

}

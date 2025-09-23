package app;

import java.util.LinkedHashMap;
import java.util.Map;

public class Context {
  private LinkedHashMap<String, MiId> variables;
  private boolean active;

  public Context() {
    this.variables = new LinkedHashMap<>();
    this.active = true;
  }

  public LinkedHashMap<String, MiId> getVariables() {
    return variables;
  }

  public boolean getActive() {
    return active;
  }

  public void close() {
    this.active = false;
  }

  public MiId getVariableByTokenString(String idTokenStr) {
    return variables.get(idTokenStr);
  }

  public void addVariable(MiId variable) {
    variables.put(variable.getToken(), variable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("  active=").append(active).append(",\n");
    sb.append("  variables:\n");

    if (variables.isEmpty()) {
      sb.append("    (no variables)\n");
    } else {
      for (Map.Entry<String, MiId> entry : variables.entrySet()) {
        sb.append("    ")
            .append(entry.getValue())
            .append("\n");
      }
    }

    return sb.toString();
  }

}

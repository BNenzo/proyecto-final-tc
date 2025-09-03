package app;

import java.util.List;

public class Utils {
  public static final String RESET = "\u001B[0m";
  public static final String RED = "\u001B[31m";
  public static final String GREEN = "\u001B[32m";
  public static final String YELLOW = "\u001B[33m";

  public static Context getLastActiveContext(List<Context> contexts) {
    for (int i = contexts.size() - 1; i >= 0; i--) {
      Context ctx = contexts.get(i);
      if (ctx.isActive()) {
        return ctx;
      }
    }
    return null;
  }

  public static void printError(String text) {
    final String RED = "\u001B[31m";
    final String RESET = "\u001B[0m";
    System.out.println(RED + "❌ " + text + RESET);
  }

  public static void printAlreadyDeclarationError(String idTokenStr, String scope, int line, int column) {
    printError("Error: La variable '" + idTokenStr + "' ya está declarada en el ámbito '"
        + scope + "'" + " (línea " + line + ", columna "
        + column + ")");
  }

  public static String getFunctionSign(String functionName, List<MiId> parametersList) {
    StringBuilder sb = new StringBuilder();
    sb.append(functionName).append("(");

    if (parametersList != null && !parametersList.isEmpty()) {
      for (int i = 0; i < parametersList.size(); i++) {
        MiId param = parametersList.get(i);
        sb.append(param.getTipoDato().toString().toLowerCase());

        if (i < parametersList.size() - 1) {
          sb.append(",");
        }
      }
    }

    sb.append(")");
    return sb.toString();
  }

  public static String getFunctionNameFromSign(String functionSign) {
    if (functionSign == null || functionSign.isEmpty()) {
      return "";
    }
    int parenIndex = functionSign.indexOf('(');
    if (parenIndex == -1) {
      // No tiene paréntesis, devolvemos todo
      return functionSign;
    }
    return functionSign.substring(0, parenIndex);
  }

  public static String buildFunctionSignatureFromStringList(String functionName, List<String> parameters) {
    StringBuilder sb = new StringBuilder();
    sb.append(functionName).append("(");

    if (parameters != null && !parameters.isEmpty()) {
      sb.append(String.join(",", parameters));
    }

    sb.append(")");
    return sb.toString();
  }
}

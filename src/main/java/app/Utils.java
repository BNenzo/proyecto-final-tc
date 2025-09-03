package app;

import java.util.ArrayList;
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

  public static List<MiId> extractParameters(idParser.Definicion_funcion_parametrosContext parametrosCtx) {
    List<MiId> parametersList = new ArrayList<>();
    if (parametrosCtx != null) {
      for (idParser.Definicion_funcion_parametroContext pCtx : parametrosCtx.definicion_funcion_parametro()) {
        TipoDato type = TipoDato.fromString(pCtx.tipo_variable().getText());
        String name = pCtx.definicion_funcion_parametro_nombre().getText();
        parametersList.add(new MiId(name, true, false, type));
      }
    }
    return parametersList;
  }

  public static boolean isSameFunction(Function existing, List<MiId> newParams) {
    if (existing == null)
      return false;

    // distinta cantidad de parámetros
    if (existing.getFunctionParameters().size() != newParams.size())
      return false;

    int i = 0;
    for (MiId paramFromMap : existing.getFunctionParameters().values()) {
      MiId paramFromList = newParams.get(i);
      if (paramFromMap.getTipoDato() != paramFromList.getTipoDato()) {
        return false;
      }
      i++;
    }
    return true;
  }

}

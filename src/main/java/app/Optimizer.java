package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Optimizer {
  private List<String> instructions;
  private Map<String, String> constants;

  public Optimizer(List<String> instructions) {
    this.instructions = new ArrayList<>(instructions);
    this.constants = new HashMap<>();
  }

  public List<String> optimize() {
    propagateConstants();
    return instructions;
  }

  public void printInstructions() {
    for (String instruction : instructions) {
      System.out.println(instruction);
    }
  }

  private void propagateConstants() {
    for (int i = 0; i < instructions.size(); i++) {
      String line = instructions.get(i).trim();

      if (line.matches("\\w+ = \\d+")) {
        String[] parts = line.split(" = ");
        constants.put(parts[0], parts[1]);
        instructions.set(i, line);
      } else if (line.matches("\\w+ = \\w+ [\\+\\-\\*/] \\w+")) {
        String[] parts = line.split(" = ");
        String var = parts[0].trim();
        String[] exprParts = parts[1].trim().split(" ");
        String left = exprParts[0];
        String op = exprParts[1];
        String right = exprParts[2];

        if (constants.containsKey(left))
          left = constants.get(left);
        if (constants.containsKey(right))
          right = constants.get(right);

        if (left.matches("\\d+") && right.matches("\\d+")) {
          int result = evalConstantExpression(left, op, right);
          constants.put(var, String.valueOf(result));
          line = var + " = " + result;
        } else {
          line = var + " = " + left + " " + op + " " + right;
        }
        instructions.set(i, line);
      }

      else if (line.matches("\\w+ = \\w+")) {
        String[] parts = line.split(" = ");
        String var = parts[0].trim();
        String value = parts[1].trim();

        if (constants.containsKey(value)) {
          value = constants.get(value);
          constants.put(var, value);
          line = var + " = " + value;
        }
        instructions.set(i, line);
      }
    }
  }

  private int evalConstantExpression(String left, String op, String right) {
    int leftNumber = Integer.parseInt(left);
    int rightNumber = Integer.parseInt(right);
    switch (op) {
      case "+":
        return leftNumber + rightNumber;
      case "-":
        return leftNumber - rightNumber;
      case "*":
        return leftNumber * rightNumber;
      case "/":
        return leftNumber / rightNumber;
      default:
        return 0;
    }
  }

}

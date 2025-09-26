package app;

import org.antlr.v4.runtime.*;

public class VerboseListener extends BaseErrorListener {
  private boolean hasErrors = false;

  public boolean hasErrors() {
    return hasErrors;
  }

  @Override
  public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
      int line, int charPositionInLine,
      String msg, RecognitionException e) {
    hasErrors = true;
    Utils.printError(msg);
  }
}
package app;

import java.util.List;

public class Utils {
  public static Context getLastActiveContext(List<Context> contexts) {
    for (int i = contexts.size() - 1; i >= 0; i--) {
      Context ctx = contexts.get(i);
      if (ctx.isActive()) {
        return ctx;
      }
    }
    return null;
  }
}

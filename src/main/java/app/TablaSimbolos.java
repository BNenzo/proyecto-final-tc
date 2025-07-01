package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablaSimbolos {
  private static TablaSimbolos tabla_instance = null;

  private List<HashMap<String, MiId>> contextosLogicos;

  private TablaSimbolos() {
    this.contextosLogicos = new ArrayList<HashMap<String, MiId>>();
    this.addContext();
  }

  public void addContext() {
    contextosLogicos.add(new HashMap<String, MiId>());
  }

  public boolean searchIdInContext(String token, int index) {
    return contextosLogicos.get(index).containsKey(token);
  }

  public void addId(MiId id) {
    contextosLogicos.get(contextosLogicos.size() - 1).put(id.getToken(), id);
  }

  public void removeLastContext() {
    if (contextosLogicos.size() > 0) {
      contextosLogicos.remove(getContextosLogicosSize() - 1);
    }
  }

  public HashMap<String, MiId> getContextByIndex(int index) {
    return contextosLogicos.get(index);
  }

  public HashMap<String, MiId> getLastContext() {
    return contextosLogicos.get(contextosLogicos.size() - 1);
  }

  public Integer getContextosLogicosSize() {
    return contextosLogicos.size() - 1;
  }

  public MiId getElementByKey(String token, int index) {
    return contextosLogicos.get(index).get(token);
  }

  public static TablaSimbolos getInstance() {
    if (tabla_instance == null)
      tabla_instance = new TablaSimbolos();

    return tabla_instance;
  }

  public void readTable() {
    for (int i = 0; i < this.contextosLogicos.size(); i++) {
      HashMap<String, MiId> hashMap = this.contextosLogicos.get(i);
      System.out.println("Contexto #" + i);
      for (Map.Entry<String, MiId> entry : hashMap.entrySet()) {
        System.out.println(
            "Token: " + entry.getValue().getToken()
                + ", Inicializada: " + entry.getValue().getInicializada()
                + ", Usada: " + entry.getValue().getUsada()
                + ", Tipo de Dato: " + entry.getValue().getTipoDato());
      }
    }
  }
}

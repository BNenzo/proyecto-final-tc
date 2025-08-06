package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TablaSimbolos {
  private static TablaSimbolos tabla_instance = null;

  private List<HashMap<String, MiId>> tablaGeneral;
  private Map<String, LinkedHashMap<String, MiId>> tablaFunciones;

  public List<HashMap<String, MiId>> getContextosLogicos() {
    return tablaGeneral;
  }

  public Map<String, LinkedHashMap<String, MiId>> getTablaFunciones() {
    return tablaFunciones;
  }

  private TablaSimbolos() {
    this.tablaGeneral = new ArrayList<HashMap<String, MiId>>();
    this.tablaFunciones = new HashMap<>();

    this.addContext();
  }

  public void addContext() {
    tablaGeneral.add(new HashMap<String, MiId>());
  }

  public boolean searchIdInContext(String token, int index) {
    return tablaGeneral.get(index).containsKey(token);
  }

  public void addId(MiId id) {
    tablaGeneral.get(tablaGeneral.size() - 1).put(id.getToken(), id);
  }

  public void addIdAt(int index, MiId id) {
    if (index < 0 || index >= tablaGeneral.size()) {
      throw new IndexOutOfBoundsException("Índice fuera de rango: " + index);
    }

    tablaGeneral.get(index).put(id.getToken(), id);
  }

  public void removeLastContext() {
    if (tablaGeneral.size() > 0) {
      tablaGeneral.remove(getContextosLogicosSize() - 1);
    }
  }

  public HashMap<String, MiId> getContextByIndex(int index) {
    return tablaGeneral.get(index);
  }

  public HashMap<String, MiId> getLastContext() {
    return tablaGeneral.get(tablaGeneral.size() - 1);
  }

  public Integer getContextosLogicosSize() {
    return tablaGeneral.size() - 1;
  }

  public MiId getElementByKey(String token, int index) {
    return tablaGeneral.get(index).get(token);
  }

  public static TablaSimbolos getInstance() {
    if (tabla_instance == null)
      tabla_instance = new TablaSimbolos();

    return tabla_instance;
  }

  public void AddFunctionToTable(String functionName) {
    tablaFunciones.put(functionName, new LinkedHashMap<>());
  }

  public void readTable() {
    for (int i = 0; i < tablaGeneral.size(); i++) {
      HashMap<String, MiId> hashMap = tablaGeneral.get(i);
      System.out.println("Contexto #" + i);
      for (Map.Entry<String, MiId> entry : hashMap.entrySet()) {
        System.out.println(entry.getValue());
      }
    }
  }

  public void imprimirTablaFunciones() {
    for (Map.Entry<String, LinkedHashMap<String, MiId>> entradaFuncion : tablaFunciones.entrySet()) {
      String nombreFuncion = entradaFuncion.getKey();
      Map<String, MiId> simbolosFuncion = entradaFuncion.getValue();

      System.out.println("Función: " + nombreFuncion);

      for (Map.Entry<String, MiId> entradaSimbolo : simbolosFuncion.entrySet()) {
        MiId id = entradaSimbolo.getValue();

        System.out.println("  " + id); // gracias a tu toString()
      }

      System.out.println(); // línea en blanco entre funciones
    }
  }
}

package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TablaSimbolos {
  private static TablaSimbolos tabla_instance = null;

  private List<HashMap<String, MiId>> tablaGeneral;
  private Map<String, List<LinkedHashMap<String, MiId>>> tablaFunciones;

  public List<HashMap<String, MiId>> getContextosLogicos() {
    return tablaGeneral;
  }

  public Map<String, List<LinkedHashMap<String, MiId>>> getTablaFunciones() {
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
      tablaGeneral.remove(getGeneralTableSize() - 1);
    }
  }

  public HashMap<String, MiId> getContextByIndex(int index) {
    return tablaGeneral.get(index);
  }

  public Integer getGeneralTableSize() {
    return tablaGeneral.size() - 1;
  }

  public HashMap<String, MiId> getLastContext() {
    return tablaGeneral.get(getGeneralTableSize());
  }

  public MiId getIdAtIndexByKey(String token, int index) {
    return tablaGeneral.get(index).get(token);
  }

  public MiId findIdInLastContext(String idToken) {
    return getIdAtIndexByKey(idToken, getGeneralTableSize());
  }

  public static TablaSimbolos getInstance() {
    if (tabla_instance == null)
      tabla_instance = new TablaSimbolos();

    return tabla_instance;
  }

  public void AddFunctionToTable(String functionName) {
    tablaFunciones.put(functionName, new ArrayList<LinkedHashMap<String, MiId>>());
  }

  public MiId findByKey(String key) {
    for (HashMap<String, MiId> map : tablaGeneral) {
      if (map.containsKey(key)) {
        return map.get(key);
      }
    }
    return null;
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
    for (Map.Entry<String, List<LinkedHashMap<String, MiId>>> entradaFuncion : tablaFunciones.entrySet()) {
      String nombreFuncion = entradaFuncion.getKey();
      List<LinkedHashMap<String, MiId>> listaSimbolos = entradaFuncion.getValue();

      System.out.println("Función: " + nombreFuncion);

      // Recorremos cada LinkedHashMap (posible bloque/ámbito)
      for (int i = 0; i < listaSimbolos.size(); i++) {
        LinkedHashMap<String, MiId> bloque = listaSimbolos.get(i);

        System.out.println("  Bloque #" + (i + 1) + ":");

        for (Map.Entry<String, MiId> entradaSimbolo : bloque.entrySet()) {
          MiId id = entradaSimbolo.getValue();
          System.out.println("    " + id); // Asumiendo que toString() está bien implementado
        }
      }

      System.out.println(); // línea en blanco entre funciones
    }
  }

}

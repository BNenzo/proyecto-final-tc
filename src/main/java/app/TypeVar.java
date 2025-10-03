package app;

public enum TypeVar {
  VOID,
  INT,
  DOUBLE,
  FLOAT,
  CHAR,
  UNDEFINED;

  public static TypeVar fromString(String str) {
    if (str == null)
      return UNDEFINED;
    str = str.toLowerCase();
    if (str.equals("void"))
      return VOID;
    if (str.equals("int"))
      return INT;
    if (str.equals("double"))
      return DOUBLE;
    if (str.equals("char"))
      return CHAR;
    return UNDEFINED;
  }
}

package app;

enum TipoDato {
  VOID,
  INT,
  DOUBLE,
  FLOAT,
  CHAR,
  UNDEFINED;

  public static TipoDato fromString(String str) {
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

public class MiId {
  private String Token;

  public MiId(String token, Boolean inicializada, Boolean usada, TipoDato tipoDato, Boolean isFunction) {
    this.Token = token;
    this.Inicializada = inicializada;
    this.Usada = usada;
    this.tipoDato = tipoDato;
    this.isFunction = isFunction;
    this.propsQuantity = 0;
  }

  public MiId(String token, Boolean inicializada, Boolean usada, TipoDato tipoDato, Boolean isFunction,
      Number propsQuantity) {
    this.Token = token;
    this.Inicializada = inicializada;
    this.Usada = usada;
    this.tipoDato = tipoDato;
    this.isFunction = isFunction;
    this.propsQuantity = propsQuantity;
  }

  public String getToken() {
    return Token;
  }

  public void setToken(String token) {
    Token = token;
  }

  private Boolean Inicializada;

  public Boolean getInicializada() {
    return Inicializada;
  }

  public void setInicializada(Boolean inicializada) {
    Inicializada = inicializada;
  }

  private TipoDato tipoDato;

  public TipoDato getTipoDato() {
    return tipoDato;
  }

  public void setTipoDato(TipoDato tipoDato) {
    this.tipoDato = tipoDato;
  }

  private Boolean Usada;

  public Boolean getUsada() {
    return Usada;
  }

  public void setUsada(Boolean usada) {
    Usada = usada;
  }

  private Boolean isFunction;

  public Boolean getIsFunction() {
    return isFunction;
  }

  public void setIsFunction(Boolean isFunction) {
    this.isFunction = isFunction;
  }

  private Number propsQuantity;

  public Number getPropsQuantity() {
    return propsQuantity;
  }

  public void setPropsQuantity(Number propsQuantity) {
    this.propsQuantity = propsQuantity;
  }

  @Override
  public String toString() {
    return "Token: " + Token +
        ", Inicializada: " + Inicializada +
        ", Usada: " + Usada +
        ", Tipo de Dato: " + tipoDato +
        ", Funcion: " + isFunction;
  }
}

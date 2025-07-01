package app;

enum TipoDato {
  VOID,
  INT,
  DOUBLE,
  FLOAT,
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
    if (str.equals("float"))
      return FLOAT;
    return UNDEFINED;
  }
}

public class MiId {
  private String Token;

  public MiId(String token, Boolean inicializada, Boolean usada, TipoDato tipoDato) {
    this.Token = token;
    this.Inicializada = inicializada;
    this.Usada = usada;
    this.tipoDato = tipoDato;
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

}

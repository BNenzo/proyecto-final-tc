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
  private Boolean Inicializada;
  private TipoDato tipoDato;
  private Boolean Usada;
  private int line;
  private int column;

  public MiId(String token, Boolean inicializada, Boolean usada, TipoDato tipoDato) {
    this.Token = token;
    this.Inicializada = inicializada;
    this.Usada = usada;
    this.tipoDato = tipoDato;
    this.line = 0;
    this.column = 0;
  }

  public MiId(String token, Boolean inicializada, Boolean usada, TipoDato tipoDato, int line, int column) {
    this.Token = token;
    this.Inicializada = inicializada;
    this.Usada = usada;
    this.tipoDato = tipoDato;
    this.line = line;
    this.column = column;
  }

  public String getToken() {
    return Token;
  }

  public void setToken(String token) {
    Token = token;
  }

  public Boolean getInicializada() {
    return Inicializada;
  }

  public void setInicializada(Boolean inicializada) {
    Inicializada = inicializada;
  }

  public TipoDato getTipoDato() {
    return tipoDato;
  }

  public void setTipoDato(TipoDato tipoDato) {
    this.tipoDato = tipoDato;
  }

  public Boolean getUsada() {
    return Usada;
  }

  public void setUsada(Boolean usada) {
    Usada = usada;
  }

  public int getLine() {
    return line;
  }

  public void setLine(int line) {
    this.line = line;
  }

  public int getColumn() {
    return column;
  }

  public void setColumn(int column) {
    this.column = column;
  }

  @Override
  public String toString() {
    return "Token: " + Token +
        ", Inicializada: " + Inicializada +
        ", Usada: " + Usada +
        ", Tipo de Dato: " + tipoDato;
  }
}

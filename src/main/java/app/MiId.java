package app;

public class MiId {
  private String token;
  private Boolean initialized;
  private TypeVar type;
  private Boolean used;
  private int line;
  private int column;

  public MiId(String token, Boolean initialized, Boolean used, TypeVar type) {
    this.token = token;
    this.initialized = initialized;
    this.used = used;
    this.type = type;
    this.line = 0;
    this.column = 0;
  }

  public MiId(String token, Boolean initialized, Boolean used, TypeVar type, int line, int column) {
    this.token = token;
    this.initialized = initialized;
    this.used = used;
    this.type = type;
    this.line = line;
    this.column = column;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Boolean getInitialized() {
    return initialized;
  }

  public void setInitialized(Boolean initialized) {
    this.initialized = initialized;
  }

  public TypeVar getType() {
    return type;
  }

  public void setType(TypeVar type) {
    this.type = type;
  }

  public Boolean getUsed() {
    return used;
  }

  public void setUsed(Boolean used) {
    this.used = used;
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
    return "Token: " + token +
        ", Inicializada: " + initialized +
        ", Usada: " + used +
        ", Tipo de Dato: " + type;
  }
}

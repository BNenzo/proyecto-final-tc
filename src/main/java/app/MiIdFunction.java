package app;

public class MiIdFunction {

  private String Token;

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

package comida;

public abstract class Comida {
  protected int pontosDeFelicidade;

  public Comida(int pontosDeFelicidade) {
    this.pontosDeFelicidade = pontosDeFelicidade;
  }

  public double getPontosDeFelicidade() {
    return pontosDeFelicidade;
  }

  public abstract int pontosDeFelicidade();
}

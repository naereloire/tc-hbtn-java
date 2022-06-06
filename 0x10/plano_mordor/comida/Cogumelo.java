package comida;

public class Cogumelo extends Comida {
  public Cogumelo() {
    super(-10);
  }

  @Override
  public int pontosDeFelicidade() {
    return 0;
  }
}

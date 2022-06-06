package comida;

public class OutraComida extends Comida {
  public OutraComida() {
    super(-1);
  }

  @Override
  public int pontosDeFelicidade() {
    return 0;
  }
}

import java.util.Locale;

public class Quadrado extends Retangulo {
  private double lado;

  public Quadrado() {}

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    if (lado < 0) {
      throw new java.lang.IllegalArgumentException("Lado deve ser maior ou igual a 0");
    } else {
      this.lado = lado;
      super.largura = lado;
      super.altura = lado;
    }
  }

  @Override
  public String toString() {
    double lad = this.lado;
    String format = String.format(Locale.US, "[Quadrado] %.2f", lad);
    return format;
  }
}

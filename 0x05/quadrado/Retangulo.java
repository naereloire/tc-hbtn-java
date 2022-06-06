import java.util.Locale;
public class Retangulo extends FormaGeometrica {
  protected double largura;
  protected double altura;

  public Retangulo() {
    this.largura = largura;
    this.altura = altura;
  }

  public double getLargura() {
    return largura;
  }

  public void setLargura(double largura) {
    if (this.largura < 0) {
      throw new java.lang.IllegalArgumentException("Largura deve ser maior ou igual a 0");
    } else {
      this.largura = largura;
    }
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    if (this.altura < 0) {
      throw new java.lang.IllegalArgumentException("Altura deve ser maior ou igual a 0");
    } else {
      this.altura = altura;
    }
  }
  @Override
  public double area() {
    double area = this.largura * this.altura;
    return area;
  }
  public String toString() {
    double larg = this.largura;
    double alt = this.altura;
    String format = String.format(Locale.US, "[Retangulo] %.2f / %.2f" , larg, alt);
    return format;
  }
}

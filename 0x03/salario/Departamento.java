public class Departamento {
  double valorMeta;
  double valorAtingidoMeta;

  public Departamento(double valorMeta, double valorAtingidoMeta) {
    this.valorMeta = valorMeta;
    this.valorAtingidoMeta = valorAtingidoMeta;
  }

  public double getValorMeta() {
    return this.valorMeta;
  }

  public double getValorAtingidoMeta() {
    return this.valorAtingidoMeta;
  }

  public boolean alcancouMeta() {
    if (this.valorAtingidoMeta >= this.valorMeta) {
      return true;
    } else {
      return false;
    }
  }
}

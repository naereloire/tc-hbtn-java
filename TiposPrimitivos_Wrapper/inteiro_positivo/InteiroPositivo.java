public class InteiroPositivo {
  private int valor;

  public InteiroPositivo(int valor) {
    this.setValor(valor);
  }

  public InteiroPositivo(String valor) {
    this.setValor(Integer.parseInt(valor));
  }

  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    int numb = valor < 0 ? this.throwException() : valor;
    this.valor = numb;
  }

  public int throwException() {
    throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
  }

  public boolean ehPrimo() {
    int numerosDivisiveis = 0;
    for (int numb = 2; numb <= valor; numb++) {
      if (valor % numb == 0) {
        numerosDivisiveis += 1;
      }
    }
    return numerosDivisiveis == 1 ? true : false;
  }
}

package produtos;
public class Dvd extends Produto {
  String diretor;
  String genero;
  int duracao;

  public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
    super(titulo, ano, pais, precoBruto);
    this.diretor = diretor;
    this.genero = genero;
    this.duracao = duracao;
  }

  public java.lang.String getDiretor() {
    return diretor;
  }

  public void setDiretor(String diretor) {
    this.diretor = diretor;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public int getDuracao() {
    return duracao;
  }

  public void setDuracao(int duracao) {
    this.duracao = duracao;
  }

  @Override
  public double obterPrecoLiquido (){
    double acrescimo = super.precoBruto * 0.2;
    double precoLiquido = super.precoBruto + acrescimo;
    return precoLiquido;
  }
}

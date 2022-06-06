package produtos;
public class Livro extends Produto{
  int paginas;
  String autor;
  int edicao;

  public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
    super(titulo, ano, pais, precoBruto);
    this.paginas = paginas;
    this.autor = autor;
    this.edicao = edicao;
  }

  public int getPaginas() {
    return paginas;
  }

  public void setPaginas(int paginas) {
    this.paginas = paginas;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getEdicao() {
    return edicao;
  }

  public void setEdicao(int edicao) {
    this.edicao = edicao;
  }

  @Override
  public double obterPrecoLiquido (){
    double acrescimo = super.precoBruto * 0.15;
    double precoLiquido = super.precoBruto + acrescimo;
    return precoLiquido;
  }
}

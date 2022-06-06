package produtos;
public abstract class Produto{
    String titulo;
    int ano;
    String pais;
    double precoBruto;

    public Produto(String titulo, int ano, String pais, double precoBruto) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = precoBruto;
    }
    public java.lang.String getTitulo() {
        return titulo;
    }

    public abstract double obterPrecoLiquido ();
}
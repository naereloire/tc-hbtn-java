import java.util.Locale;

public class Produto {
    private final String nome;
    private final double preco;
    private final double peso;
    private final int quantidadeEmEstoque;
    private final TiposProduto tipo;

    public Produto(String nome, double preco, double peso, int quantidadeEmEstoque, TiposProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public TiposProduto getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return String.format(Locale.GERMANY, "%s %f %f %d %s", getNome(), getPreco(), getPeso(), getQuantidadeEmEstoque(), getTipo());
    }
}

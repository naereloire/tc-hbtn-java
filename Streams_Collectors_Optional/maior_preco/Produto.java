import java.util.Locale;

public class Produto {
    private final int codigo;
    private final String nome;
    private final CategoriaProduto categoria;
    private final double preco;

    public Produto(int codigo, String nome, CategoriaProduto categoria, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format(Locale.GERMANY,"[%d] %s %s R$ %.2f", getCodigo(), getNome(), getCategoria(), getPreco());
    }

}
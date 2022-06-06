import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkUp;
    public Supplier<Double> precoComMarkUp = () -> (this.preco * this.percentualMarkUp) + this.preco;
    public Consumer<Double> atualizarMarkUp = valor -> this.percentualMarkUp = valor / 100;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
        this.percentualMarkUp = 0.1;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
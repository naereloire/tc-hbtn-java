import java.util.*;

public class Comida {
    String nome;
    double calorias;
    double preco;

    public Comida(String nome, double calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format(Locale.GERMANY,"[%s] %f R$ %f", this.getNome(), this.getCalorias(), this.getPreco());
    }
}
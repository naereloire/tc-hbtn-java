import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Pessoa implements Comparable<Pessoa> {
    private final int codigo;
    private final String nome;
    private final String cargo;
    private final int idade;
    private final double salario;
    private List<String> hobbies;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
        this.hobbies = hobbies;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.getNome().compareTo(pessoa.getNome());
    }

    @Override
    public String toString() {
        return String.format(Locale.GERMANY, "[%d] %s %s %d R$ %f", getCodigo(), getNome(), getCargo(), getIdade(), getSalario());
    }

}

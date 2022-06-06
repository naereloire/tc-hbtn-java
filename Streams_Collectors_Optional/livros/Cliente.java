public class Cliente {
    private final int codigo;
    private final String nome;
    private final boolean premium;

    public Cliente(int codigo, String nome, boolean premium) {
        this.codigo = codigo;
        this.nome = nome;
        this.premium = premium;
    }

    public String getNome() {
        return nome;
    }

}
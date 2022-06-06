
public class Contato {
    private  String nome;
    private  String númeroTelefone;
    private  TipoNumero tipo;

    public Contato(String nome, String númeroTelefone, TipoNumero tipo) {
        this.nome = nome;
        setNúmeroTelefone(númeroTelefone);
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNúmeroTelefone(String númeroTelefone) {
        this.númeroTelefone = númeroTelefone;
    }

    public String getNúmeroTelefone() {
        return númeroTelefone;
    }

    public TipoNumero getTipo() {
        return tipo;
    }
}
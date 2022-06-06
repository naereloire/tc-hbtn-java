public class Tarefa {
    private final int identificador;
    private String descricao;
    private boolean estahFeita;

    public Tarefa(String descricao, int identificador) {
        modificarDescricao(descricao);
        this.identificador = identificador;
    }

    public void modificarDescricao(String descricao) {
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        } else {
            this.descricao = descricao;
        }
    }

    public int getIdentificador() {
        return identificador;
    }

    public boolean getEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public String getDescricao() {
        return descricao;
    }

}
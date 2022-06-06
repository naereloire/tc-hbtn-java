import java.util.List;

public class Pedido {
    private final int codigo;
    private final List<Produto> produtos;
    private final Cliente cliente;

    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

}
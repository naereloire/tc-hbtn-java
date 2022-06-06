import java.util.List;
import java.util.Locale;

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

    public int getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return String.format(Locale.GERMANY, "[%d] %s", getCodigo(), getCliente().getNome());

    }
}
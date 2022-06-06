import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Comparator.comparing;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        List<Produto> listProduto = pedido.getProdutos();
        return listProduto.stream().filter(p -> p.getCategoria() == CategoriaProduto.LIVRO).collect(Collectors.toList());

    }

    public static Produto obterProdutoMaiorPreco(List<Produto> listaProduto) {
        Optional<Produto> result = listaProduto.stream().max(comparing(Produto::getPreco));
        return result.orElse(null);
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> listaProduto, double preco) {
        Stream<Produto> stream = listaProduto.stream().filter(i -> i.getPreco() >= preco);
        return stream.collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> listaPedidos) {
        Stream<Pedido> stream = listaPedidos.stream().filter(pedido -> pedido.getProdutos().stream().anyMatch(p -> p.getCategoria().equals(CategoriaProduto.ELETRONICO)));
        return stream.collect(Collectors.toList());
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream().map(p -> {
            if (p.getCategoria().equals(CategoriaProduto.ELETRONICO)) {
                p.setPreco((p.getPreco() - p.getPreco()) * 0.15);
            }
            return p;
        }).collect(Collectors.toList());
    }
}

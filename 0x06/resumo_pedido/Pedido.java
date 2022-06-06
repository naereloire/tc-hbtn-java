import produtos.*;
import java.util.Locale;

public class Pedido {
  double percentualDesconto;
  ItemPedido[] itens;

  public Pedido(double percentualDesconto, ItemPedido[] itens) {
    this.percentualDesconto = percentualDesconto;
    this.itens = itens;
  }

  public double getPercentualDesconto() {
    return percentualDesconto;
  }

  public void setPercentualDesconto(double percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  public ItemPedido[] getItens() {
    return itens;
  }

  public void setItens(ItemPedido[] itens) {
    this.itens = itens;
  }

  public double calcularTotal() {
    double totalPorItem;
    double totalComDesconto;
    double total = 0;
    for (ItemPedido item : itens) {
      totalPorItem = item.getQuantidade() * item.getProduto().obterPrecoLiquido();
      totalComDesconto = totalPorItem - ((percentualDesconto / 100) * totalPorItem);
      total += totalComDesconto;
    }
    return total;
  }

  public void apresentarResumoPedido() {
    String tipo = "";
    String titulo;
    double precoItem;
    double quantidadeItens;
    double totalPedidoComDesconto = this.calcularTotal();;
    double descontoPorItem = 0;
    double totalDosItens = 0;
    double totalComDesconto = 0;
    double totalProdutos = 0;
    double descontoDoPedido = 0;

    System.out.println("------- RESUMO PEDIDO -------");
    for (ItemPedido item : itens) {
      if (item.getProduto() instanceof Livro) {
        tipo = "Livro";
      } else if (item.getProduto() instanceof Dvd) {
        tipo = "Dvd";
      }
      titulo = item.getProduto().getTitulo();
      precoItem = item.getProduto().obterPrecoLiquido();
      quantidadeItens = item.getQuantidade();
      totalDosItens = item.getQuantidade() * item.getProduto().obterPrecoLiquido();
      totalProdutos += totalDosItens;
      descontoPorItem = totalPedidoComDesconto - ((percentualDesconto / 100) * totalDosItens);
      descontoDoPedido = totalProdutos - totalPedidoComDesconto ;

      System.out.printf(
          Locale.GERMANY,
          "Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %.0f  Total: %.2f\n",
          tipo,
          titulo,
          precoItem,
          quantidadeItens,
          totalDosItens);
    }
    System.out.println("----------------------------");
    System.out.printf(Locale.GERMANY, "DESCONTO: %.2f\n", descontoDoPedido);
    System.out.printf(Locale.GERMANY, "TOTAL PRODUTOS: %.2f\n", totalProdutos);
    System.out.println("----------------------------");
    System.out.printf(Locale.GERMANY, "TOTAL PEDIDO: %.2f\n", totalPedidoComDesconto);
    System.out.println("----------------------------");
  }
}

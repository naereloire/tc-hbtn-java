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

  public void setItens(ItemPedido[]  itens) {
    this.itens = itens;
  }

  public double calcularTotal() {
    double totalPorItem;
    double totalComDesconto;
    double total = 0;
    for(ItemPedido item : itens){
      totalPorItem = item.getQuantidade()* item.getProduto().obterPrecoLiquido();
      totalComDesconto = totalPorItem - ((percentualDesconto /100) * totalPorItem);
      total += totalComDesconto;
    }
    return total;
  }
}

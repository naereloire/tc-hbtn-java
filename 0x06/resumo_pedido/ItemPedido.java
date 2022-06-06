import produtos.*;
public class ItemPedido {
  Produto produto;
  int quantidade;


  public ItemPedido(Produto produto, int quantidade ) {
    this.produto = produto;
    this.quantidade = quantidade;

  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }
}

public class Empregado {
  String nome;
  int codigo;
  Endereco endereco;

  public Empregado(String nome, int codigo, Endereco endereco) {
    this.nome = nome;
    this.codigo = codigo;
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public void apresentar() {
    System.out.printf(
        "Codigo: %d\nNome: %s\nBairro: %s\nCidade: %s\nPais: %s",
        this.codigo, this.nome, this.endereco.getBairro(), this.endereco.getCidade(), this.endereco.getPais());
  }
}

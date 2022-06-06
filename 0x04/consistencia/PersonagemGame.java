public class PersonagemGame {
  private int saudeAtual;
  String nome;
  private String status;

  public PersonagemGame(int saudeAtualInicial, String nomeInicial) {
    setSaudeAtual(saudeAtualInicial);
    setNome(nomeInicial);
  }

  public int getSaudeAtual() {
    return saudeAtual;
  }

  public String getNome() {
    return nome;
  }

  public String getStatus() {
    return status;
  }

  public void setSaudeAtual(int saudeAtual) {
    this.saudeAtual = saudeAtual;
    if (this.saudeAtual>0){
      this.status = "vivo";
    } else if(this.saudeAtual == 0) {
      this.status = "morto";
    }
  }

  public void setNome(String nome) {
    if(nome != null && ! nome.isEmpty()){
      this.nome = nome;
    }
  }

  public void tomarDano(int quantidadeDeDano) {
    int result = this.saudeAtual - quantidadeDeDano;
    if (result > 0) {
      this.setSaudeAtual(result);
    } else {
      this.saudeAtual = 0;
      this.setSaudeAtual(this.saudeAtual);
    }
  }

  public void receberCura(int quantidadeDeCura) {
    int saudeAtualComCura = this.saudeAtual + quantidadeDeCura;
    if (saudeAtualComCura <= 100) {
      this.setSaudeAtual(saudeAtualComCura);
    } else {
      this.setSaudeAtual(100);
    }
  }
}

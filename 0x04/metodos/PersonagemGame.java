public class PersonagemGame {
  int saudeAtual;
  String nome;

  public PersonagemGame() {
    this.saudeAtual = saudeAtual;
    this.nome = nome;
  }

  public int getSaudeAtual() {
    return saudeAtual;
  }

  public void setSaudeAtual(int saudeAtual) {
    this.saudeAtual = saudeAtual;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void tomarDano(int quantidadeDeDano) {
    int result = this.saudeAtual - quantidadeDeDano;
    if(result > 0){
    this.saudeAtual = result;
    }else {
      this.saudeAtual = 0;
    }
  }

  public void receberCura(int quantidadeDeCura) {
    int saudeAtualComCura = this.saudeAtual + quantidadeDeCura;
    if (saudeAtualComCura <= 100) {
      this.saudeAtual = saudeAtualComCura;
    }else {
      this.saudeAtual = 100;
    }
  }
}

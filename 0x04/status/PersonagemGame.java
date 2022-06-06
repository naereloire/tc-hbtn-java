public class PersonagemGame {
  int saudeAtual;
  String nome;
  private String status;

  public PersonagemGame() {
    this.saudeAtual = saudeAtual;
    this.nome = nome;
  }

  public int getSaudeAtual() {
    return saudeAtual;
  }

  public void setSaudeAtual(int saudeAtual) {
    this.saudeAtual = saudeAtual;
    if (this.saudeAtual>0){
      this.status = "vivo";
    } else if(this.saudeAtual == 0) {
      this.status = "morto";
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getStatus(){
   return status;
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

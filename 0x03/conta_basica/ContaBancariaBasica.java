import exceptions.OperacaoInvalidaException;
public class ContaBancariaBasica {
  String numeracao;
  double saldo;
  double taxaJurosAnual;

  public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
    this.numeracao = numeracao;
    this.saldo = 0;
    this.taxaJurosAnual = taxaJurosAnual;
  }
  public java.lang.String getNumeracao() {
    return numeracao;
  }

  public double getSaldo() {
    return saldo;
  }

  public double getTaxaJurosAnual() {
    return taxaJurosAnual;
  }

  void depositar(double valor) throws OperacaoInvalidaException{
    if(valor >0){
      saldo += valor;
    }else {
      throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
    }
  }
  void sacar(double valor) throws OperacaoInvalidaException{
    if(valor<0){
      throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
    } else if(saldo>=valor){
      saldo = saldo-valor;
    }else {
      throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
    }
  }
  double calcularTarifaMensal() {
    double tarifaPercentual = saldo * 0.1;
    double tarifaFixa = 10;
            if (tarifaPercentual < tarifaFixa){
              return tarifaPercentual;
            }else {
              return tarifaFixa;
            }
}
  double calcularJurosMensal(){
  double taxaJurosMensal = taxaJurosAnual / 12;
          if(saldo>0){
            return saldo * (taxaJurosMensal/100);
          }else {
            return 0;
          }
  }
  void aplicarAtualizacaoMensal(){
  double tarifaTaxaMensal = calcularTarifaMensal();
  double taxaJurosMensal = calcularJurosMensal();

  this.saldo -= tarifaTaxaMensal;
  this.saldo += taxaJurosMensal;
  }
}

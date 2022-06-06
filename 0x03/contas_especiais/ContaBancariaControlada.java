public class ContaBancariaControlada extends ContaBancariaBasica{
    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao,taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }
    @Override
    public void aplicarAtualizacaoMensal(){
        double tarifaTaxaMensal = super.calcularTarifaMensal();
        double taxaJurosMensal = super.calcularJurosMensal();

        super.saldo -= tarifaTaxaMensal;
        super.saldo += taxaJurosMensal;

        if(super.saldo < saldoMinimo || super.saldo == 0){
            super.saldo -= valorPenalidade;
        }
    }
}
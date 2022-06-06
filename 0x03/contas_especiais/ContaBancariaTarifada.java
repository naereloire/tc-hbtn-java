import exceptions.OperacaoInvalidaException;
public class ContaBancariaTarifada extends ContaBancariaBasica{
    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = 0;
    }
    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    @Override
    public void sacar(double valor)throws OperacaoInvalidaException{
        quantidadeTransacoes += 1;
        if(valor<0){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        } else if(super.saldo>=valor){
            super.saldo -= valor;
            super.saldo -= 0.10;
        }else {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
    }

    @Override
    public void depositar(double valor)throws OperacaoInvalidaException{
        quantidadeTransacoes += 1;
        if(valor >0){
            super.saldo += valor;
            super.saldo -= 0.10;
        }else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }
}
public class Gerente extends Empregado{
    public Gerente ( double salarioFixo){
        super(salarioFixo);
    }
@Override
public double calcularBonus(Departamento departamento){
    if ( departamento.alcancouMeta()){
        double result = super.salarioFixo * 0.2;
        double diferenca = (departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01;
        return result + diferenca;
    }
    return 0;
}
}
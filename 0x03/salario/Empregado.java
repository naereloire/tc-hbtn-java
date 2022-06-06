public class Empregado {
    double salarioFixo;
    public Empregado (double salarioFixo){
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return this.salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        if ( departamento.alcancouMeta()){
            double result = this.salarioFixo * 0.1;
            return result;
        }
        return 0;
    }
    public double calcularSalarioTotal(Departamento departamento){
        double result = this.salarioFixo + calcularBonus(departamento);
                return result;
    }
}
public class Retangulo extends FormaGeometrica{
    private double largura;
    private double altura;

    public Retangulo(){
        this.largura = largura;
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(this.largura <0){
            throw new java.lang.IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }else {
        this.largura = largura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(this.altura <0){
            throw new java.lang.IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }else {
            this.altura = altura;
        }
    }


}
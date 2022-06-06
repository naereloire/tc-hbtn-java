public class Numero {
    public static void dividir(int a, int b){
        int soma = 0;
   try{
     soma = a/b;
   }catch (Exception e){
       System.out.println("Nao eh possivel dividir por zero");
   }finally {
       System.out.println(a+" / " + b + " = " + soma);
   }
    }
}
public class Programa{
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double soma = 0;


        try {
            for (int i = 0; i < 100; i++) {
                a += a + i;
                b += a * i;
                soma += a + b;
                System.out.println("Soma: " + soma);
                System.out.println("Int.MAX " + Integer.MAX_VALUE);
                if(soma<0){
                    throw new StackOverflowError();
                }
            }
        } catch (StackOverflowError e) {
            System.out.println("Não deu!");
        }
        System.out.println(soma);
    }
}
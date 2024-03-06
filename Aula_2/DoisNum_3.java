import java.util.Scanner;

public class DoisNum_3{
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiro = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundo = leitor.nextInt();

        if (primeiro>segundo) {
            System.out.println("O maior número é: " + primeiro);
        }
        else if(primeiro<segundo){
            System.out.println("O maior número é: " + segundo);
        }
        
    }
}

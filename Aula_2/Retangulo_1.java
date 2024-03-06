import java.util.Scanner;

public class Retangulo_1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        float altura = leitor.nextFloat();
        System.out.println("Digite a largura: ");
        float largura = leitor.nextFloat();
        System.out.println("A área do retângulo é de: " + altura * largura);

    }
}
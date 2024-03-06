import java.util.Scanner;

public class Conversao_2 {    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor em reais: ");
        float valor = leitor.nextFloat();
        
        System.out.println("O valor em Dólar é de: " + (valor / 5.17));
        System.out.println("O valor em Euro é de: " + (valor / 6.14));
        System.out.println("O valor em Peso argentino é de: " + (valor * 0.05));
        // 1. Dólar (1 dólar = 5,17 reais)
        // 2. Euro (1 euro = 6,14 reais)
        // 3. Peso argentino (1 peso argentino = 0,05 reais)
        }                                                                                                                                
}

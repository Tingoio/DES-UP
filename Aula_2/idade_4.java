import java.util.Scanner;

public class idade_4 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idd = leitor.nextInt();

        if(idd<1){
            System.out.println("Digite um valor acima de 0: ");
        }
        else{
            if(idd<=13){
                System.out.println("Criança.");
            }
            else if((idd>13)&&(idd<=18)){
                System.out.println("Adolescente.");
            }
            else if((idd>18)&&(idd<=60)){
                System.out.println("Adulto.");
            }
            else{
                System.out.println("Idoso.");
            }
        }
    }
}
// se idade <= 13: Criança, se idade > 13 e <= 18: Adolescente, se idade > 18 e <= 60: Adulto e se idade > 60:Idoso.
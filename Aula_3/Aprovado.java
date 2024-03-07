import java.util.Scanner;

public class Aprovado {

    public static void imprimir(String str){
        System.out.println(str);
    }
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        String nome;
        int matricula;
        double nota1, nota2, notaFinal;

        imprimir("Digite o nome do aluno: ");
        nome = leitor.nextLine();
        imprimir("Digite o número de matrícula: ");
        matricula = leitor.nextInt();
        imprimir("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();
        imprimir("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        notaFinal = (nota1 + nota2) / 2;

        if(notaFinal>=6){
            imprimir("APROVADO!!!!!!");
        }
        else{
            imprimir("REPROVADO!!!!!");
        }
    }
}
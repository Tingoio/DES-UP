import java.util.Scanner;

public class Fixacao_2 {

    public static void imprimir(String str){
        System.out.println(str);
    }
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int qtd = 5;
        String[] nomes;
        String[] matriculas;
        double[] nota1, nota2, notaFinal;

        for(int i=0;i>5;i++){
            imprimir("Digite o nome do aluno: ");
            nomes[i] = leitor.nextLine();
            imprimir("Digite o número de matrícula: ");
            matriculas[i] = leitor.nextLine();
            imprimir("Digite a primeira nota: ");
            nota1[i] = leitor.nextDouble();
            imprimir("Digite a segunda nota: ");
            nota2[i] = leitor.nextDouble();
            notaFinal[i] = (nota1[i] + nota2[i]) / 2;
        }


        if(notaFinal>=6){
            imprimir("APROVADO!!!!!!");
        }
        else{
            imprimir("REPROVADO!!!!!");
        }
    }
}
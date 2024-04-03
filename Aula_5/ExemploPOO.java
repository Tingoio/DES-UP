import java.util.Scanner;

public class ExemploPOO {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        // String matricula;
        // String nome;
        // double nota1, nota2;
        int qtd = 5;
        Aluno[] alunos = new Aluno[qtd];

        for(int i=0;i>5;i++){
            System.out.println("Digite a matricula: ");
            alunos[i].matricula = leitor.nextLine();
            System.out.println("Digite o nome: "); 
            alunos[i].nome = leitor.nextLine();
            System.out.println("Digite a primeira nota: ");
            alunos[i].nota1 = leitor.nextDouble();
            System.out.println("Digite a segunda nota: ");
            alunos[i].nota2 = leitor.nextDouble();

            System.out.println("Matricula: " + alunos[i].matricula);
            System.out.println("Nome: " + alunos[i].nome);
            System.out.println("Primeira nota: " + alunos[i].nota1);
            System.out.println("Segunda nota: " + alunos[i].nota2);
        }

    }
}
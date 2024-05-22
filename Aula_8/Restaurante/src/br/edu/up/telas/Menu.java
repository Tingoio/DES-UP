package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.controles.CadastroFuncionario;

public class Menu {

    Scanner leitor = new Scanner(System.in);
    
    public void mostrar(){

        System.out.println("-----------------");
        System.out.println("MENU PRINCIPAL: ");
        System.out.println("-----------------");

        int opcao = 0;

        System.out.println("Selecione uma das opções: ");
        System.out.println("-----------------");
        System.out.println("1. Cadastrar funcionário");
        System.out.println("...");
        System.out.println("5. Registrar pedido");

        opcao = leitor.nextInt();

        switch (opcao) {
            case 1:{
                mostrarMenuUsuario();
                break;
            }
            case 5: {
                break;
            }
            default: {
                break;
            }
        }

    }
    public void mostrarMenuUsuario(){
        System.out.println("-----------------");
        System.out.println("MENU USUARIO: ");
        System.out.println("-----------------");

        int opcao = 0;

        System.out.println("Selecione uma das opções: ");
        System.out.println("-----------------");
        System.out.println("1. Listar");
        System.out.println("2. Imprimir");
        System.out.println("3. Excluir");
        System.out.println("4. Alterar");
        System.out.println("5. Voltar");

        CadastroFuncionario cadastro = new CadastroFuncionario();
        switch (opcao) {
            case 1: {
                System.out.println(cadastro.getFuncionariosString());
                break;
            }
            case 2: {
                
                break;
            }
            case 3: {
                
                break;
            }
            case 4: {
                
                break;
            }
            default:{
                mostrar();
                break;
            }
        }
    }
}

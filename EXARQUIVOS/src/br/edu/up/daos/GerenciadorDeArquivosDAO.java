package br.edu.up.daos;

import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeArquivosDAO {

    private String header = "";
    private String nomeDoArquivo = "C:\\_ws\\dev_m\\DES-UP\\EXARQUIVOS\\src\\clientes.csv";

    public List<Cliente> getClientes(){

        List<Cliente> clientes = new ArrayList<>();
        
        try{
            //LER DADOS DE UM ARQUIVO DE TEXTO
            File arquivoLeitura = new File(nomeDoArquivo);
    
            Scanner leitor = new Scanner(arquivoLeitura);

            //Guardar header
            header = leitor.nextLine();

    
            //PERCORRER TODAS AS LINHAS DO ARQUIVO
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();

                String[] dados = linha.split(";");

                String nome = dados[0];
                String telefone = dados[1];
                String email = dados[2];
                String credito = dados[3];
                String cpf = dados[5];

                if(cpf != null && !cpf.equals("")){
                    double peso = Double.parseDouble(dados[6]);
                    double altura = Double.parseDouble(dados[7]);
                    Cliente cliente = new ClientePessoa(nome, telefone, email, cpf, peso, altura);
                    listaDeClientes.add(cliente);

                }else{
                    String cnpj = dados[8];
                    String iestadual = dados[9];
                    String ano = Integer.parseInt(dados[10]);

                    Cliente cliente = new ClienteEmpresa(nome, telefone, email, cnpj, iestadual, ano);
                    listaDeClientes.add(cliente);
                }


                //Cliente cliente = new Cliente(nome, telefone, email);
                //listaDeClientes.add(cliente);
                System.out.println("Nome: " + nome);
            }
    
            leitor.close();
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }
    }
    public void gravarArquivo(){

    }
    public void lerArquivo(){
        List<Cliente> listaDeClientes = new ArrayList<>();


        try{
            //LER DADOS DE UM ARQUIVO DE TEXTO
            File arquivoLeitura = new File(nomeDoArquivo);
    
            Scanner leitor = new Scanner(arquivoLeitura);

            //Guardar header
            header = leitor.nextLine();

    
            //PERCORRER TODAS AS LINHAS DO ARQUIVO
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");
                String nome = dados[0];
                String telefone = dados[1];
                String email = dados[2];

                //Cliente cliente = new Cliente(nome, telefone, email);
                //listaDeClientes.add(cliente);
                System.out.println("Nome: " + nome);
            }
    
            leitor.close();
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }

        //PROCESSAMENTO DOS DADOS

        //Incluindo novo cliente
        //Cliente novoCliente = new Cliente("Maria", "41 9999-7777", "maria@email.com");
        //listaDeClientes.add(novoCliente);

        //Removendo cliente existente
        listaDeClientes.remove(1);

        for (Cliente cliente : listaDeClientes) {
            System.out.println(cliente);
        }

        try{
            //GRAVAR DADOS EM UM ARQUIVO DE TEXTO
    
            FileWriter arquivoGravar = new FileWriter(nomeDoArquivo);
            PrintWriter gravador = new PrintWriter(arquivoGravar);

            gravador.println(header);

            for (Cliente cliente : listaDeClientes) {
                gravador.println(cliente.toCSV());
            }

            gravador.close();

        }catch(IOException e){
            System.out.println("Não foi possível gravar o arquivo");
        }
    }
}

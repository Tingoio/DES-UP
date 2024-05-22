import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        String header = "";
        String nomeDoArquivo = "C:\\_ws\\dev_m\\DES-UP\\EXARQUIVOS\\src\\clientes.csv";
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

                Cliente cliente = new Cliente(nome, telefone, email);
                listaDeClientes.add(cliente);
                System.out.println("Nome: " + nome);
            }
    
            leitor.close();
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }

        //PROCESSAMENTO DOS DADOS

        //Incluindo novo cliente
        Cliente novoCliente = new Cliente("Maria", "41 9999-7777", "maria@email.com");
        listaDeClientes.add(novoCliente);

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

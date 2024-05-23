package br.edu.up.controles;
import java.util.ArrayList;
import java.util.List;
import br.edu.up.daos.GerenciadorDeArquivosDAO;
import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.ClientePessoa;

public class ControleDeClientes {
    
    private List<Cliente> clientes;

    public ControleDeClientes(){
        GerenciadorDeArquivosDAO dao = GerenciadorDAO();
        this.clientes = dao.getClientes();
    }

    public List<ClientesPessoa> getClientesPessoa(){
        List<ClientesPessoa> clientesPessoa = new ArrayList<>();

        for (Cliente clientes : clientes) {
            if(cliente instanceof ClientePessoa){
                clientesPessoa.add((ClientePessoa)cliente);
            }
        }
    }
}

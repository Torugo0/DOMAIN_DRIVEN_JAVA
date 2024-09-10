package br.com.fiap.main;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

public class TesteClienteCrud {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        ClienteDAO clienteDAO = new ClienteDAO(con);
        Cliente cliente = new Cliente();

        // Criando os dados de 4 clientes
        cliente.setIdCliente(1);
        cliente.setNomeCliente("Vitor Hugo");
        cliente.setPlaca("JKK100");
        System.out.println(clienteDAO.inserir(cliente));
        cliente.setIdCliente(2);
        cliente.setNomeCliente("Ana Clara");
        cliente.setPlaca("LPS3642");
        System.out.println(clienteDAO.inserir(cliente));



        // ALterar os dados de um cliente

        cliente.setIdCliente(2);
        cliente.setNomeCliente("Ana Dantas");
        cliente.setPlaca("FZO9182");

        System.out.println(clienteDAO.alterar(cliente));

        // Excluindo um cliente

        cliente.setIdCliente(3);
        System.out.println(clienteDAO.excluir(cliente));

        

        // Listando todos os clientes

        ArrayList<Cliente> resultado = clienteDAO.listarTodos();

        if(resultado != null){
            for(Cliente cliente1 : resultado){
                System.out.println("ID Cliente: " + cliente1.getIdCliente());
                System.out.println("Nome do cliente: " + cliente1.getNomeCliente());
                System.out.println("Placa: " + cliente1.getPlaca());
            }
        }
        ConnectionFactory.fecharConexao(con);
    }
}

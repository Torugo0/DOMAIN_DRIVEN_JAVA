package br.com.fiap.main;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

public class ClienteRead {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        ClienteDAO clienteDAO = new ClienteDAO(con);
        ArrayList<Cliente> resultado = clienteDAO.listarTodos();

        if(resultado != null){
            for(Cliente cliente : resultado){
                System.out.println("ID Cliente: " + cliente.getIdCliente());
                System.out.println("Nome do cliente: " + cliente.getNomeCliente());
                System.out.println("Placa: " + cliente.getPlaca());
            }
        }
        ConnectionFactory.fecharConexao(con);
    }
}

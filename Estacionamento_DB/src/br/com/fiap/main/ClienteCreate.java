package br.com.fiap.main;

import java.sql.Connection;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

public class ClienteCreate {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        Cliente cliente = new Cliente();
        cliente.setIdCliente(2);
        cliente.setNomeCliente("Ana Clara");
        cliente.setPlaca("JKK100");

        ClienteDAO clienteDAO = new ClienteDAO(con);
        System.out.println(clienteDAO.inserir(cliente));

        ConnectionFactory.fecharConexao(con);
    }
}

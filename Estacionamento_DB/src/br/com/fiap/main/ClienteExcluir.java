package br.com.fiap.main;

import java.sql.Connection;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

public class ClienteExcluir {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        Cliente cliente = new Cliente();
        cliente.setIdCliente(12);
        ClienteDAO clienteDAO = new ClienteDAO(con);
        System.out.println(clienteDAO.excluir(cliente));
        ConnectionFactory.fecharConexao(con);
    }
}

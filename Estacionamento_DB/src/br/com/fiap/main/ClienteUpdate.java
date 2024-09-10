package br.com.fiap.main;

import java.sql.Connection;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

public class ClienteUpdate {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        Cliente cliente = new Cliente();
        cliente.setIdCliente(12);
        cliente.setNomeCliente("Vitor Hugo");
        cliente.setPlaca("FZO8712");

        ClienteDAO clienteDAO = new ClienteDAO(con);
        System.out.println(clienteDAO.alterar(cliente));

        ConnectionFactory.fecharConexao(con);
    }
}

package br.com.fiap.main;

import java.sql.Connection;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

public class TesteExcluir {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();
        Carro carro = new Carro();
        carro.setPlaca("JKK102");
        CarroDAO carroDAO = new CarroDAO(con);
        System.out.println(carroDAO.excluir(carro));
        ConnectionFactory.fecharConexao(con);
    }
}

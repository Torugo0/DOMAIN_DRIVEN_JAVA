package br.com.fiap.controller;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.model.dto.Carro;
import br.com.fiap.model.dao.CarroDAO;
import br.com.fiap.model.dao.ConnectionFactory;

public class CarroController {
    /*
    O que é um Controller?
    
    Controller é um componente em uma arquitetura de software, geralmente usada no padrão MVC (Model-View-Controller), que atua como um intermediário entre a View (interface do usuário) e o Model (dados e lógica de negócios). Ele é responsável por processar as solicitações do usuário, interagir com o Model e atualizar a View com base nas alterações nos dados.
     */

    public String inserirCarro(String placa, String cor, String descricao) throws ClassNotFoundException, SQLException{
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        Carro carro = new Carro();
        carro.setPlaca(placa);
        carro.setCor(cor);
        carro.setDescricao(descricao);

        CarroDAO carroDAO = new CarroDAO(con);
        resultado = carroDAO.inserir(carro);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String alterarCarro(String placa, String cor, String descricao) throws ClassNotFoundException, SQLException{
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        Carro carro = new Carro();
        carro.setPlaca(placa);
        carro.setCor(cor);
        carro.setDescricao(descricao);

        CarroDAO carroDAO = new CarroDAO(con);
        resultado = carroDAO.alterar(carro);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String excluirCarro(String placa) throws ClassNotFoundException, SQLException{
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        Carro carro = new Carro();
        carro.setPlaca(placa);
        CarroDAO carroDAO = new CarroDAO(con);
        resultado = carroDAO.excluir(carro);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String listarUm(String placa) throws ClassNotFoundException, SQLException{
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        Carro carro = new Carro();
        carro.setPlaca(placa);
        CarroDAO carroDAO = new CarroDAO(con);
        resultado = carroDAO.listarUm(carro);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }
}

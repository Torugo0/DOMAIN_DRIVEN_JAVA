package br.com.fiap.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.model.dto.Carro;

public class CarroDAO implements IDAO{
    // DAO (Data Access Object) é um padrão de design usado para acessar e manipular dados em um banco de dados. O DAO fornece uma forma organizada de interagir com o banco de dados, mantendo o código separado da lógica de negócios.
    /*
    O que é um Model?
    Model é um termo usado em arquitetura de software para se referir à representação de dados e regras de negócios em uma aplicação. Ele é responsável por armazenar(DTO), manipular (DAO) e processar (DAO) os dados da aplicação. Em outras palavras, o Model é a parte do código que lida com a estrutura dos dados e a lógica de negócios. 
    */

    private Connection con;
    private Carro carro;

    public CarroDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    // Metodo
    public String inserir(Object object) {
        carro = (Carro) object;

        String sql = "Insert into DDD_carro(placa,cor,descricao) values(?,?,?)";
        // try-with-resources
        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso!";
            } else {
                return "Falha ao inserir!";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    public String alterar(Object object) {
        carro = (Carro) object;
        String sql = "update ddd_carro set cor=?, descricao=? where placa=?";

        // try-with-resources
        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso!";
            } else {
                return "Falha ao alterar!";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    public String excluir(Object object) {
        carro = (Carro) object;
        String sql = "delete from ddd_carro where placa=?";

        // try-with-resources
        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setString(1, carro.getPlaca());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso";
            } else {
                return "Falha ao excluir";
            }

        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    public String listarUm(Object object){
        carro = (Carro) object;
        String sql = "select * from ddd_carro where placa = ?";
        try (PreparedStatement ps = getCon().prepareStatement(sql)){
            ps.setString(1, carro.getPlaca());
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                return "Placa: " + carro.getPlaca() + "\nCor: " + rs.getString("cor") + "\nDescrição: " + rs.getString("descricao");
            }else{
                return "Registro não encontrado!";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }
    
}

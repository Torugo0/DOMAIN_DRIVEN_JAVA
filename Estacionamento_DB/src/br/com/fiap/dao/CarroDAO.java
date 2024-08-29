package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.dto.Carro;

public class CarroDAO {

    private Connection con;

    public CarroDAO(Connection con){
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public String inserir(Carro carro){
        String sql = "Insert into DDD_carro(placa,cor,descricao) values(?,?,?)";

        // try-with-resources
        try(PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());

            if(ps.executeUpdate() > 0){
                return "Inserido com sucesso!";
            }else{
                return "Falha ao inserir!";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();  
        }
    }

    
    
}

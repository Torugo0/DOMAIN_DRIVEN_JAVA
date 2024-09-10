package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.fiap.dto.Cliente;

public class ClienteDAO{

    private Connection con;

    public ClienteDAO(Connection con){
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public String inserir (Cliente cliente){
        String sql = "Insert into DDD_CLIENTE(id_cliente, nome_cliente, placa) values(?,?,?)";

        // try-with-resources
        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setInt(1, cliente.getIdCliente());
            ps.setString(2, cliente.getNomeCliente());
            ps.setString(3, cliente.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso!";
            } else {
                return "Falha ao inserir!";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    // Falta o Read, update e delete

    public String alterar(Cliente cliente) {
        String sql = "update DDD_CLIENTE set placa=?, nome_cliente=? where id_cliente=?";

        // try-with-resources
        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setString(1, cliente.getPlaca());
            ps.setString(2, cliente.getNomeCliente());
            ps.setInt(3,cliente.getIdCliente());

            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso!";
            } else {
                return "Falha ao alterar!";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    public String excluir(Cliente cliente) {
        String sql = "delete from DDD_CLIENTE where id_cliente=?";

        // try-with-resources
        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setInt(1, cliente.getIdCliente());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso";
            } else {
                return "Falha ao excluir";
            }

        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    public ArrayList<Cliente> listarTodos() {
        String sql = "select * from DDD_CLIENTE order by id_cliente";
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(rs.getInt(1));
                    cliente.setNomeCliente(rs.getString(2));
                    cliente.setPlaca(rs.getString(3));
                    listaClientes.add(cliente);
                }
                return listaClientes;
            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
            return null;
        }
    }
    
}

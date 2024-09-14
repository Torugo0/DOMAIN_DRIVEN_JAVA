package br.com.fiap.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //DAO SEMPRE VAI CONTER A MANIPULAÇÃO, INSERÇÃO E LEITURA DOS DADOS ARMAZENADOS NO BANCO DE DADOS
    
     //Sem construtores e atributos, por isso se cria um static
    public static Connection abrirConexao(){
        Connection con = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
            final String USER = "rm97758";
            final String PASS = "080305";
            con = DriverManager.getConnection(url, USER, PASS);

            System.out.println("Conexão aberta");

        }catch(ClassNotFoundException e){
            System.out.println("Erro: A classe de conexão não foi encontrada. \n" + e.getMessage());   
        }catch(SQLException e){
            System.out.println("Erro de SQL!\n" + e.getMessage());
        }catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return con;
    }

    public static void fecharConexao(Connection con){
        try{
            con.close();
            System.out.println("Conexão fechada");
        }catch(SQLException e){
            System.out.println("Erro de SQL!\n" + e.getMessage());
        }catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

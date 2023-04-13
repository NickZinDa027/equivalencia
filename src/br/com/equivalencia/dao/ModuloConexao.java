package br.com.equivalencia.dao;
import java.sql.*;
public class ModuloConexao {
 
    //metodo que cria e mantem a conexão com o banco de dados
    public static Connection conector() {
        //chamada o drive de conexão com o banco
        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/equivalencia";
        String user = "root";
        String password = "123456";
        
        //estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
        }
        return null;
    }
}

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection createConexao(){

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_allan","root","1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void closedConexao(){
        try {
            createConexao().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

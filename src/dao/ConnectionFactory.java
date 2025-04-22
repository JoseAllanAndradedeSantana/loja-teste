package dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static HikariDataSource hikariDataSource;

    public ConnectionFactory(){
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/loja_allan");
        hikariConfig.setUsername("root");
        hikariConfig.setPassword("1234");
        hikariConfig.setMinimumIdle(3);
        hikariConfig.setMaximumPoolSize(5);
        hikariDataSource = new HikariDataSource(hikariConfig);
    }

    public static Connection createConexao(){
        try {
            return hikariDataSource.getConnection();
            //return DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_allan","root","1234");
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

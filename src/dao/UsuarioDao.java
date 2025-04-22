package dao;

import domain.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDao {

    private ConnectionFactory connectionFactory;

    public UsuarioDao(ConnectionFactory connectionFactory){
        this.connectionFactory = connectionFactory;
    }

    public void incluir(Usuario usuario){
        try {
            int i = 1;
            String sqlQuery = "INSERT INTO usuario (nome,email,senha) VALUES (? , ?, ? )";
            Connection conexao = connectionFactory.createConexao();
            PreparedStatement preparedStatement = conexao.prepareStatement(sqlQuery);
            preparedStatement.setString(i++,usuario.getNome());
            preparedStatement.setString(i++,usuario.getEmail());
            preparedStatement.setString(i,usuario.getSenha());
            preparedStatement.execute();
            preparedStatement.close();
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar Usuario -> " + e.getMessage());
        }
    }

    public void excluirUsuario(String codigo){
        try{
            int i = 1;
            String sqlQuery = "DELETE FROM usuario WHERE id = ?";
            Connection conexao = connectionFactory.createConexao();
            PreparedStatement preparedStatement = conexao.prepareStatement(sqlQuery);
            preparedStatement.setString(i,codigo);
            preparedStatement.execute();
            preparedStatement.close();
            conexao.close();
        }catch (SQLException e){
            throw new RuntimeException("Error ao excluir usuario : " + e);
        }
    }
}

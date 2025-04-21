package dao;

import domain.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

    public static final boolean STATUS_ATIVO = true;
    private ConnectionFactory connectionFactory;

    public ProdutoDao(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public void salvar(Produto produto){
        try {
            int i = 1;
            StringBuilder sql = new StringBuilder();

            sql
                    .append("INSERT INTO produto (nome,preco,ativo) ")
                    .append("VALUES ( ? ,?, ?) ");

            PreparedStatement ps = connectionFactory.createConexao().prepareStatement(sql.toString());
            ps.setString(i++,produto.getNome());
            ps.setDouble(i++,produto.getPreco());
            ps.setBoolean(i, STATUS_ATIVO);
            ps.execute();
            ps.close();
            connectionFactory.closedConexao();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar Produto -> " + e.getMessage());
        }
    }

    public void excluir(String codigo){
        try {
            int i = 1;
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_allan","root","1234");
            StringBuilder sql = new StringBuilder();

            sql
                    .append("DELETE FROM produto ")
                    .append("WHERE codigo = ? ");

            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setString(i,codigo);
            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Produto> buscarTodosProdutos(){
        List<Produto> produtos = new ArrayList<Produto>();
        try{
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_allan","root","1234");
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT codigo,nome, preco FROM produto");
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                long id = resultSet.getLong("codigo");
                String nomeProduto = resultSet.getString("nome");
                Double preco = resultSet.getDouble("preco");

                Produto produto = new Produto(id,nomeProduto,preco,false);
                produtos.add(produto);
            }
            ps.close();
            conexao.close();
        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
        return produtos;
    }

    public boolean existeProdutoComEsseNome(String nome){
        return true;
    }

    public void atualizar(String codigo,Produto produto){
        try {
            int i = 1;
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_allan","root","1234");
            StringBuilder sql = new StringBuilder();

            sql
                    .append("UPDATE produto ")
                    .append("SET codigo = ?, nome = ? , preco = ?, ativo = ? ")
                    .append("WHERE codigo = ? ");

            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setLong(i++,produto.getCodigo());
            ps.setString(i++, produto.getNome());
            ps.setDouble(i++,produto.getPreco());
            ps.setBoolean(i++,produto.isAtivo());
            ps.setString(i,codigo);
            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    public Produto buscarProdutoPorCodigo(String codigo) {
        Produto produto =null;
        try{
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_allan","root","1234");
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT codigo,nome, preco FROM produto WHERE codigo = ?");
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setString(1,codigo);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                long id = resultSet.getLong("codigo");
                String nomeProduto = resultSet.getString("nome");
                Double preco = resultSet.getDouble("preco");

                produto = new Produto(id,nomeProduto,preco,false);


            }
            ps.close();
            conexao.close();
        }catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        return produto;
    }

    public boolean isProdutoComMesmoNome(Produto produto) throws SQLException {
        String sql = "SELECT nome FROM produto WHERE nome = ? ";
        PreparedStatement ps = connectionFactory.createConexao().prepareStatement(sql);
        ps.setString(1, produto.getNome());
        ResultSet resultSet = ps.executeQuery();
        if(resultSet.next()){
            return true;
        };
        return false;
    }
}

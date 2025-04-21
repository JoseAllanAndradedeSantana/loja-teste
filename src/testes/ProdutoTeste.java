package testes;

import dao.ConnectionFactory;
import dao.ProdutoDao;
import domain.Produto;
import org.junit.Test;
import service.ProdutoValidacaoRegras;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class ProdutoTeste {

    @Test
    public void deveRetornarExceptionQuandoNomeEstiverVazio(){
        Produto produto = new Produto("",50D,false);
        ProdutoValidacaoRegras produtoValidacaoRegras = new ProdutoValidacaoRegras();
        try {
            produtoValidacaoRegras.validacoesProduto(produto);
        }catch (Exception e ){
            assertEquals("O nome do produto é obrigatório.",e.getMessage());
        }

    }

    @Test
    public void deveLancarExceptionQuandoPrecoProdutoNaoEstiverPreenchido(){
        Produto produto = new Produto("teste",null,false);
        ProdutoValidacaoRegras produtoValidacaoRegras = new ProdutoValidacaoRegras();
        try{
            produtoValidacaoRegras.validacoesProduto(produto);
        }catch (Exception e ){
            assertEquals("O preco do produto é obrigatório.",e.getMessage());
        }
    }

    @Test
    public void naoDeveDeixarCadastrarProdutoComMesmoNome() {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        ProdutoDao produtoDao = new ProdutoDao(connectionFactory);
        Produto produto = new Produto("teste service",6D,true);
        ProdutoValidacaoRegras produtoValidacaoRegras = new ProdutoValidacaoRegras(produtoDao);


        try {
            produtoValidacaoRegras.validacoesProduto(produto);
        } catch (Exception e) {
            assertEquals("Produto com este codigo e nome ja existe.", e.getMessage());
        }


    }
}

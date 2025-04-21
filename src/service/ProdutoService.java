package service;

import dao.ProdutoDao;
import domain.Produto;

import java.util.List;

public class ProdutoService {
    private ProdutoDao produtoDao;
    private ProdutoValidacaoRegras produtoValidacaoRegras;

    public ProdutoService(ProdutoDao produtoDao,ProdutoValidacaoRegras produtoValidacaoRegras){
        this.produtoDao = produtoDao;
        this.produtoValidacaoRegras = produtoValidacaoRegras;
    }

    public void salvar(Produto produto){
        try {
            produtoValidacaoRegras.validacoesProduto(produto);
            produtoDao.salvar(produto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Produto> buscarTodos(){
        return produtoDao.buscarTodosProdutos();
    }

    public Produto buscarProdutoPorCodigo(String codigo){
        return produtoDao.buscarProdutoPorCodigo(codigo);
    }

}

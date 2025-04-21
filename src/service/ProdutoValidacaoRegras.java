package service;

import dao.ProdutoDao;
import domain.Produto;

public class ProdutoValidacaoRegras {

    private ProdutoDao produtoDao;

    public ProdutoValidacaoRegras() {
    }
    public ProdutoValidacaoRegras(ProdutoDao produtoDao) {
        this.produtoDao = produtoDao;
    }

    public void validacoesProduto(Produto produto) throws Exception{
            validaPrecoProduto(produto);
            validaNome(produto);
            validaProdutoComMesmoNome(produto);
    }

    private void validaNome(Produto produto) throws Exception {
        if(produto.getNome().isBlank()){
            throw new Exception("O nome do produto é obrigatório.");
        }
    }

    private void validaPrecoProduto(Produto produto) throws Exception{
        if(produto.getPreco() == null || produto.getPreco() <= 0){
            throw new Exception("O preco do produto é obrigatório.");
        }
    }

    private void validaProdutoComMesmoNome(Produto produto) throws Exception{
        boolean isProdutoCadastrado = produtoDao.isProdutoComMesmoNome(produto);

        if(isProdutoCadastrado){
            throw new Exception("Produto com este codigo e nome ja existe.");
        }


    }
}

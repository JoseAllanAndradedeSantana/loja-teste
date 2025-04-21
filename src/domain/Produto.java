package domain;

public class Produto {
    private Long codigo;
    private String nome;
    private Double preco;
    private boolean isAtivo;
    private boolean isExcluido;

    public Produto() {
    }

    public Produto(Long codigo, String nome, Double preco,boolean isAtivo) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.isAtivo = isAtivo;
    }

    public Produto(String nome, Double preco, boolean isAtivo) {
        this.nome = nome;
        this.preco = preco;
        this.isAtivo = isAtivo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean isAtivo() {
        return isAtivo;
    }

    public void setAtivo(boolean ativo) {
        isAtivo = ativo;
    }

    public boolean isExcluido() {
        return isExcluido;
    }

    public void setExcluido(boolean excluido) {
        isExcluido = excluido;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", isAtivo=" + isAtivo +
                ", isExcluido=" + isExcluido +
                '}';
    }
}

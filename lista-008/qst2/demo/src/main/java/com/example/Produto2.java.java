public class Produto2<C, P> {
    private C codigo;
    private String descricao;
    private P preco;
    
    public Produto2(C codigo, String descricao, P preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public C getCodigo() {
        return codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public P getPreco() {
        return preco;
    }
    
    @Override
    public String toString() {
        return "Produto2{" +
               "codigo=" + codigo +
               ", descricao='" + descricao + '\'' +
               ", preco=" + preco +
               '}';
    }
}
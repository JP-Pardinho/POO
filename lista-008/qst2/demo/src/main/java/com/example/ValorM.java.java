import java.math.BigDecimal;

public class ValorM {
    private Object valor;
    
    public ValorM(Double valor) {
        this.valor = valor;
    }
    
    public ValorM(BigDecimal valor) {
        this.valor = valor;
    }
    
    public ValorM(String valor) {
        this.valor = valor;
    }
    
    public Object getValor() {
        return valor;
    }
    
    @Override
    public String toString() {
        return valor.toString();
    }
}
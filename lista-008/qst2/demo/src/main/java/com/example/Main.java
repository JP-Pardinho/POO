import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Codigo<String, Integer> codigo1 = new Codigo<>("IMP", 34);
        Codigo<String, String> codigo2 = new Codigo<>("SEC", "1413");
        
        ValorM preco1 = new ValorM(19.99);
        ValorM preco2 = new ValorM(new BigDecimal("1299.99"));
        ValorM preco3 = new ValorM("Sob Consulta");
        
        Produto2<Codigo<String, Integer>, ValorM> produto1 = 
            new Produto2<>(codigo1, "Impressora", preco1);
        
        Produto2<Codigo<String, String>, ValorM> produto2 = 
            new Produto2<>(codigo2, "Secretária Eletrônica", preco2);
        
        Produto2<String, ValorM> produto3 = 
            new Produto2<>("PROMO001", "Oferta Especial", preco3);
        
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
    }
}

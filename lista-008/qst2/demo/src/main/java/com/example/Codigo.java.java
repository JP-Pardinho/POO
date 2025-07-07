public class Codigo<A, B> {
    private A setor;
    private B numero;
    
    public Codigo(A setor, B numero) {
        this.setor = setor;
        this.numero = numero;
    }
    
    public A getSetor() {
        return setor;
    }
    
    public B getNumero() {
        return numero;
    }
    
    @Override
    public String toString() {
        return setor.toString() + numero.toString();
    }
}
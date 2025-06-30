package lista008;

public class ContatoFax implements Contato {
    public String nome;
    public String numeroFax;

    public ContatoFax(String nome, String numeroFax) {
        this.nome = nome;
        this.numeroFax = numeroFax;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getContato() {
        return numeroFax;
    }

    @Override
    public String getTipo() {
        return "FAX";
    }
}

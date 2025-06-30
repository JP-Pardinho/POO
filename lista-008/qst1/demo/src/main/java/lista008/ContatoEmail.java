package lista008;

public class ContatoEmail implements Contato {
    private String nome;
    private String email;

    public ContatoEmail(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getContato() {
        return email;
    }

    @Override
    public String getTipo() {
        return "Email";
    }
}

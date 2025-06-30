package lista008;

public class ContatoEndereco implements Contato {
    private String nome;
    private String endereco;

    public ContatoEndereco(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getContato() {
        return endereco;
    }

    @Override
    public String getTipo() {
        return "Endereço";
    }
}

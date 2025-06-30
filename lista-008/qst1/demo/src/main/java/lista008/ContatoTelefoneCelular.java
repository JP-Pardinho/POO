package lista008;

public class ContatoTelefoneCelular extends ContatoTelefone {

    public ContatoTelefoneCelular(String nome, String numero) {
        super(nome, numero);
    }

    @Override
    public String getTipo() {
        return "Celular";
    }
}

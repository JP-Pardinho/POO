package lista008;

public class ContatoTelefoneResidencial extends ContatoTelefone {

    public ContatoTelefoneResidencial(String nome, String numero) {
        super(nome, numero);
    }

    @Override
    public String getTipo() {
        return "Residencial";
    }
}

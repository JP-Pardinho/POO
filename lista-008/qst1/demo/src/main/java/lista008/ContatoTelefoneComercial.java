package lista008;

public class ContatoTelefoneComercial extends ContatoTelefone {

    public ContatoTelefoneComercial(String nome, String numero) {
        super(nome, numero);
    }

    @Override
    public String getTipo() {
        return "Comercial";
    }

}

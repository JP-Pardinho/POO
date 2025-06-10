package edu.lista006;

public class Empregado_fixo extends Empregado{
    private double salarioMensal;

    public Empregado_fixo(String nome, String cpf, String setor, double salarioMensal){
        super(nome, cpf, setor);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal(){
        return salarioMensal;
    }

}

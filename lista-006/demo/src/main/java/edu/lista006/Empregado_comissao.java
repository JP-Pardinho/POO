package edu.lista006;

public class Empregado_comissao extends Empregado {
    private double salarioBase;
    private int totalVendas;
    private double percentualComissao;

    public Empregado_comissao(String nome, String cpf, String setor, double salarioBase, int totalVendas, double percentualComissao){
        super(nome, cpf, setor);
        this.salarioBase = salarioBase;
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public int getTotalVendas(){
        return totalVendas;
    }

    public double getPercentualComissao(){
        return percentualComissao;
    }

    public double salarioTotal(double salarioBase, int totalVendas, double percentualComissao){
        double salarioTotal = 0;
        salarioTotal = salarioBase + (totalVendas * (percentualComissao/100));
        return salarioTotal;
    }
}

package edu.lista006;

public class Empregado {
    private String nome;
    private String cpf;
    private String setor;

    public Empregado(){}

    public Empregado(String nome, String cpf, String setor){
        this.nome = nome;
        this.cpf = cpf;
        this.setor = setor;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getSetor(){
        return setor;
    }

}

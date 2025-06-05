package edu.lista5;

import java.time.LocalDate;

public class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;
    private LocalDate dataEmprestimo;

    public Emprestimo(){}

    public Emprestimo(Pessoa pessoa, Livro livro){
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
    }

    public Pessoa getPessoa(){
        return pessoa;
    }

    public Livro getLivro(){
        return livro;
    }

    public LocalDate getDataEmprestimo(){
        return dataEmprestimo;
    }

    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }

    public void setLivro(Livro livro){
        this.livro = livro;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    @Override
    public String toString(){
        return String.format("\nDados do emprestimo:\nPessoa:", pessoa, livro, dataEmprestimo);
    }
}

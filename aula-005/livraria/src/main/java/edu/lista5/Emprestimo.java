package edu.lista5;

import java.time.LocalDate;

public class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;
    private LocalDate dataEmprestimo;

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

    @Override
    public String toString(){
        return String.format("\nDados do emprestimo:\nCliente: " + pessoa + "\nLivro: " + livro + "\nData do emprestimo: " + dataEmprestimo);
    }
}

package edu.lista5;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }
    
    public Boolean getEmprestado(){
        return emprestado;
    }

    public boolean emprestar(){
        return emprestado = true;
    }

    public boolean devolver(){
        return emprestado = false;
    }

    @Override
    public String toString(){
        String mensagem;
        if (emprestado == true) {
            mensagem = "Não";
        } else {
            mensagem = "Sim";
        }
        return String.format("\nDados do livro:\nTitulo: %s\nAutor: %s\nDisponivel p/ emprestimo: %s\n", titulo, autor, mensagem);
    }

}

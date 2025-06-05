package edu.lista5;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado = false;

    public Livro(){}

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

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }

    @Override
    public String toString(){
        return String.format("\nDados do livro:\nTitulo: %s\nAutor: %s\nEmprestado: %s\n", titulo, autor, emprestado);
    }

}

package edu.lista5;

import java.util.*;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    public void addContato(Contato contato){
        contatos.add(contato);
        System.out.println("* Contato criado com sucesso! *");
    }

    public boolean removerContato(String nome){
        for(int i=0; i<contatos.size(); i++){
            if(contatos.get(i).getNome().equalsIgnoreCase(nome)){
                contatos.remove(i);
                return true;
            }
        }
        return false;
    }

    public Contato buscarContato(String nome){
        for(int i=0; i<contatos.size(); i++){
            if(contatos.get(i).getNome().equalsIgnoreCase(nome)){
                return contatos.get(i);
            } 
        }
        return null;
    }

    public void listarContatos(){
        for(int i=0; i<contatos.size(); i++){
            System.out.println("Nome: " + contatos.get(i).getNome());
            System.out.println("Telefone: " + contatos.get(i).getTelefone());
            System.out.println("Email: " + contatos.get(i).getEmail());
        }
    }
}

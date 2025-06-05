package edu.lista5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        Contato contato;
        String nome, telefone, email;
        int op;

        do{
            System.out.println("\n|         Agenda         |");
            System.out.println("(1) Adicionar Contato");
            System.out.println("(2) Remover Contato");
            System.out.println("(3) Buscar Contato");
            System.out.println("(4) Listar Contatos");
            System.out.println("(0) Sair");
            System.out.print("Opção => ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 0:
                    System.out.println("Saindo...\n");
                    break;

                case 1:
                    System.out.println("Insira as informações do contato: ");
                    System.out.print("Nome: ");
                    nome = scan.nextLine();
                    System.out.print("Telefone: ");
                    telefone = scan.nextLine();
                    System.out.print("Email: ");
                    email = scan.nextLine();
                    agenda.addContato(new Contato(nome, telefone, email));
                    break;

                case 2:
                    System.out.println("Remover contato:");
                    System.out.print("Nome: ");
                    nome = scan.nextLine();
                    if (agenda.removerContato(nome)){
                        System.out.println("Contato removido!");
                    } else{
                        System.out.println("Contato não contato não encontrado!");
                    }
                    break;

                case 3:
                    System.out.println("Buscar contato: ");
                    System.out.print("Nome: ");
                    nome = scan.nextLine();
                    contato = agenda.buscarContato(nome);
                    if(contato == null){
                        System.out.println("Contato não encontrado!");
                    } else {
                        contato.toString();
                    }
                    break;

                case 4:
                    System.out.println("Todos os contatos:");
                    agenda.listarContatos();
                    break;

    
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        } while(op != 0);
    }
}
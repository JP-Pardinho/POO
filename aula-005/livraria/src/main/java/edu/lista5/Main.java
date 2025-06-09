package edu.lista5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, cpf, titulo, autor;
        int op;
        
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        
        do {
            System.out.println("\nBem-vindo a Livraria!");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("3 - Realizar emprestimo");
            System.out.println("4 - Devolver livro");
            System.out.println("5 - Listar emprestimos");
            System.out.println("6 - Listar livros");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = scan.nextInt();
            scan.nextLine(); 

            switch (op) {
                case 1:
                    System.out.println("\nCadastrar livro:");
                    System.out.print("Digite o titulo do livro: ");
                    titulo = scan.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    autor = scan.nextLine();
                    livros.add(new Livro(titulo, autor));
                    System.out.println("Livro cadastrado com sucesso!");
                    break;
            
                case 2:
                    System.out.println("\nCadastrar cliente:");
                    System.out.print("Nome: ");
                    nome = scan.nextLine();
                    System.out.print("CPF: ");
                    cpf = scan.nextLine();
                    pessoas.add(new Pessoa(nome, cpf));
                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;

                case 3:
                    System.out.println("\nRealizar emprestimo:");
                    if (pessoas.isEmpty() || livros.isEmpty()) {
                        System.out.println("É necessário ter pelo menos uma pessoa e um livro cadastrado!");
                        break;
                    }
                    
                    System.out.println("\nClientes cadastrados:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    System.out.print("Escolha o cliente pelo número: ");
                    int clienteIndex = scan.nextInt();
                    
                    System.out.println("\nLivros disponíveis:");
                    int count = 0;
                    List<Livro> livrosDisponiveis = new ArrayList<>();
                    for (Livro livro : livros) {
                        if (!livro.getEmprestado()) {
                            System.out.println(count + " - " + livro.getTitulo());
                            livrosDisponiveis.add(livro);
                            count++;
                        }
                    }
                    
                    if (livrosDisponiveis.isEmpty()) {
                        System.out.println("Não há livros disponíveis para empréstimo!");
                        break;
                    }
                    
                    System.out.print("Escolha o livro pelo número: ");
                    int livroIndex = scan.nextInt();
                    scan.nextLine();
                    
                    if (clienteIndex >= 0 && clienteIndex < pessoas.size() && 
                        livroIndex >= 0 && livroIndex < livrosDisponiveis.size()) {
                        Livro livroSelecionado = livrosDisponiveis.get(livroIndex);
                        livroSelecionado.emprestar();
                        Emprestimo novoEmprestimo = new Emprestimo(pessoas.get(clienteIndex), livroSelecionado);
                        emprestimos.add(novoEmprestimo);
                        System.out.println("Empréstimo realizado com sucesso!");
                        System.out.println(novoEmprestimo);
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 4: 
                    System.out.println("\nDevolver livro:");
                    if (emprestimos.isEmpty()) {
                        System.out.println("Não há empréstimos ativos!");
                        break;
                    }
                    
                    System.out.println("\nEmpréstimos ativos:");
                    for (int i = 0; i < emprestimos.size(); i++) {
                        Emprestimo emp = emprestimos.get(i);
                        System.out.println(i + " - " + emp.getLivro().getTitulo() + 
                                           " emprestado para " + emp.getPessoa().getNome());
                    }
                    
                    System.out.print("Escolha o empréstimo para devolução pelo número: ");
                    int empIndex = scan.nextInt();
                    scan.nextLine();
                    
                    if (empIndex >= 0 && empIndex < emprestimos.size()) {
                        Emprestimo emp = emprestimos.get(empIndex);
                        emp.getLivro().devolver();
                        emprestimos.remove(empIndex);
                        System.out.println("Livro devolvido com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                
                case 5:
                    System.out.println("\nLista de empréstimos:");
                    if (emprestimos.isEmpty()) {
                        System.out.println("Não há empréstimos registrados!");
                    } else {
                        for (Emprestimo emp : emprestimos) {
                            System.out.println(emp);
                            System.out.println("---------------------");
                        }
                    }
                    break;
                    
                case 6:
                    System.out.println("\nLista de livros:");
                    if (livros.isEmpty()) {
                        System.out.println("Não há livros cadastrados!");
                    } else {
                        for (Livro livro : livros) {
                            System.out.println(livro);
                            System.out.println("---------------------");
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (op != 0);
        
        scan.close();
    }
}
package lista008;

import java.util.ArrayList;
import java.util.Scanner;

public class AplAgenda {
    private ArrayList<Contato> contatos;
    private Scanner scanner;

    public AplAgenda() {
        contatos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void executar() {
        exibirAjuda();

        while (true) {
            System.out.print("\nDigite um comando (ou '4' para ver os comandos): ");
            int comando = scanner.nextInt();
            scanner.nextLine();
            switch (comando) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    consultarPorIndice();
                    break;
                case 4:
                    exibirAjuda();
                    break;
                case 0:
                    System.out.println("Encerrando a aplicação...");
                    return;
                default:
                    System.out.println("Comando inválido. Digite 'ajuda' para ver os comandos disponíveis.");
            }
        }
    }

    private void adicionarContato() {
        System.out.println("\nTipos de contato disponíveis:");
        System.out.println("1 - Email");
        System.out.println("2 - Endereço");
        System.out.println("3 - Fax");
        System.out.println("4 - Telefone Celular");
        System.out.println("5 - Telefone Comercial");
        System.out.println("6 - Telefone Residencial");
        System.out.print("Escolha o tipo de contato (1-6): ");

        int tipo;
        try {
            tipo = Integer.parseInt(scanner.nextLine());
            if (tipo < 1 || tipo > 6) {
                System.out.println("Opção inválida. Digite um número entre 1 e 6.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número entre 1 e 6.");
            return;
        }

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine().trim();

        System.out.print("Digite a informação de contato: ");
        String info = scanner.nextLine().trim();

        Contato novoContato = null;
        switch (tipo) {
            case 1:
                novoContato = new ContatoEmail(nome, info);
                break;
            case 2:
                novoContato = new ContatoEndereco(nome, info);
                break;
            case 3:
                novoContato = new ContatoFax(nome, info);
                break;
            case 4:
                novoContato = new ContatoTelefoneCelular(nome, info);
                break;
            case 5:
                novoContato = new ContatoTelefoneComercial(nome, info);
                break;
            case 6:
                novoContato = new ContatoTelefoneResidencial(nome, info);
                break;
        }

        contatos.add(novoContato);
        System.out.println("Contato adicionado com sucesso!");
    }

    private void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }

        System.out.println("\nLista de Contatos:");
        for (int i = 0; i < contatos.size(); i++) {
            Contato c = contatos.get(i);
            System.out.printf("%d - Nome: %s | Tipo: %s | Contato: %s%n",
                    i, c.getNome(), c.getTipo(), c.getContato());
        }
    }

    private void consultarPorIndice() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }

        System.out.print("Digite o índice do contato (0 a " + (contatos.size() - 1) + "): ");
        try {
            int indice = Integer.parseInt(scanner.nextLine());
            if (indice < 0 || indice >= contatos.size()) {
                System.out.println("Índice inválido. Deve estar entre 0 e " + (contatos.size() - 1));
                return;
            }

            Contato c = contatos.get(indice);
            System.out.println("\nDetalhes do Contato:");
            System.out.println("Nome: " + c.getNome());
            System.out.println("Tipo: " + c.getTipo());
            System.out.println("Contato: " + c.getContato());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número.");
        }
    }

    private void exibirAjuda() {
        System.out.println("\nComandos disponíveis:");
        System.out.println("1 - Adicionar um novo contato");
        System.out.println("2 - Listar todos os contatos");
        System.out.println("3 - Consultar um contato pelo índice");
        System.out.println("4 - Exibir esta ajuda");
        System.out.println("0 - Sair da aplicação");
    }

    public static void main(String[] args) {
        AplAgenda agenda = new AplAgenda();
        agenda.executar();
    }
}
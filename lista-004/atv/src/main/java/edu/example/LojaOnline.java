package edu.example;

import java.util.*;

public class LojaOnline {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String op = "n";
        String descricao;
        double valor;


        do {
            System.out.print("Deseja cadastrar algum novo produto? (s / n) ");
            op = scan.nextLine();
            if (op.equalsIgnoreCase("s")) {
                System.out.print("\nDigite a descrição do produto: ");
                descricao = scan.nextLine();
                System.out.print("Digite o valor do produto: ");
                valor = scan.nextDouble();
                scan.nextLine();
                pedidos.add(new Pedido(descricao, valor));
                System.out.println("\n" + pedidos.get(pedidos.size() -1).exbirDetalhesDoPedido());
            } else if (op.equalsIgnoreCase("n")) {
                System.out.println("\nSaindo do sistema!");

            } else {
                System.out.println("\nOpção invalida!");    
            }

        }while(!op.equalsIgnoreCase("n"));
        
        System.out.println(Pedido.gerarRelatorioGeral());
    }
}

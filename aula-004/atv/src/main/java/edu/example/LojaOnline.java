package edu.example;

import java.util.*;

public class LojaOnline {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String op = "n";
        String descricao;
        double valor;
        int i;

        do {
            System.out.println("Deseja cadastrar novos produtos? ");
            op = scan.nextLine();
            if (op.equalsIgnoreCase("s")) {
                System.out.println("Digite a descrição do produto: ");
                descricao = scan.nextLine();
                System.out.println("Digite o valor do produto: ");
                valor = scan.nextDouble();
                scan.nextLine();
                pedidos.add(new Pedido(descricao, valor));
                System.out.println(pedidos.get(pedidos.size() -1).exbirDetalhesDoPedido());
            } else if (op.equalsIgnoreCase("n")) {
                System.out.println("Saindo do sistema!");

            } else {
                System.out.println("Opção invalida!");    
            }

        }while(!op.equalsIgnoreCase("n"));

 
    }
}

package edu.example;

public class Pedido {
    private final int IdPedido;
    private String Descricao;
    private double ValorTotal;

    private static int proximoId = 1001;
    private static int totalPedidos = 0;
    private static double valorTotalVendas = 0;

    public Pedido (String descricao, double valorTotal){
        this.IdPedido = proximoId;
        this.Descricao = descricao;
        this.ValorTotal = valorTotal;

        totalPedidos += 1;
        proximoId += 1;
        valorTotalVendas = valorTotalVendas + valorTotal;
    } 

    public String exbirDetalhesDoPedido(){
        return String.format("Obrigado pela preferencia!\nId %d\nDescrição %s\nValor Total: %.2f\n", IdPedido, Descricao, ValorTotal);
    }

    public static int getTotalPedidosRealizados() {
        return totalPedidos;
    }
    
    public static double getValorTotalVendasGeral() {
        return valorTotalVendas;
    }

    public static String gerarRelatorioGeral() {
        return String.format("Total de pedidos: %d\nTotal de vendas R$%.2f\n", totalPedidos, valorTotalVendas);
    }
}



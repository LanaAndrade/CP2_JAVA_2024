package vendas;

import java.util.ArrayList;

public class Venda {

    private int quantidade;
    private double total;
    private Cliente cliente;
    private Produto produto;

    public void realizarVenda(Produto produto, Cliente cliente, int quantidade){

        this.quantidade = quantidade;
        this.cliente = cliente;
        this.produto = produto;

        calcularTotal(this.produto);

        System.out.println("******************************");
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Produto: " + this.produto.getNome());
        System.out.println("Preço Unitário: " + this.produto.getPreco());
        System.out.println("Total: " +this.total);
        System.out.println("******************************");
    }

    public void calcularTotal(Produto produto){
        System.out.println("******************************");
        this.total = this.quantidade * produto.getPreco();
        System.out.println("******************************");
    }

}

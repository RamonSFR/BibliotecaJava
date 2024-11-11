import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;
    private Date dataPedido;
    private double valorTotal;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.dataPedido = new Date();
        this.valorTotal = 0.0;
    }

    public void adicionarLivro(Livro livro, int quantidade) {
        ItemPedido item = new ItemPedido(livro, quantidade);
        itens.add(item);
        calcularValorTotal();
    }

    public void removerLivro(Livro livro) {
        itens.removeIf(item -> item.getLivro().equals(livro));
        calcularValorTotal();
    }

    public double calcularValorTotal() {
        valorTotal = 0.0;
        for (ItemPedido item : itens) {
            valorTotal += item.getValorTotal();
        }
        return valorTotal;
    }

    public void registrarPedido() {
        // fazer registro dos pedidos
        System.out.println("Pedido registrado em: " + dataPedido);
        System.out.println("Total do pedido: " + valorTotal);
    }

    public void aplicarDesconto(double percentualDesconto) {
        for (ItemPedido item : itens) {
            item.aplicarDesconto(percentualDesconto);
        }
        calcularValorTotal();
    }

    public Date getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

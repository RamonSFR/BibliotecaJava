import java.util.Date;

public class ItemPedido {
    private Livro livro;
    private int quantidade;
    private Date dataPedido;
    private double valorTotal;

    public ItemPedido(Livro livro, int quantidade) {
        this.livro = livro;
        this.quantidade = quantidade;
        this.dataPedido = new Date();
        calcularValorTotal();
    }

    public void calcularValorTotal() {
        valorTotal = livro.calcularPrecoComDesconto(0) * quantidade;
    }

    public Livro getLivro() {
        return livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void aplicarDesconto(double percentualDesconto) {
        valorTotal -= valorTotal * percentualDesconto / 100;
    }
}

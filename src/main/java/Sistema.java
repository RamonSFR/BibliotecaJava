import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Cliente> clientes;
    private List<Pedido> pedidos;
    private List<Livro> livros;
    private List<Funcionario> funcionarios;

    public Sistema() {
        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public Livro consultarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.consultarInformacoes().contains(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void processarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void removerPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }

    public List<Pedido> consultarPedidosCliente(Cliente cliente) {
        return pedidos;
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    private boolean validarPedido(Pedido pedido) {
        return true;
    }
}

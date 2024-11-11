import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Cliente> clientes;
    private List<Pedido> pedidos;
    private List<Livro> livros;
    private List<Funcionario> funcionarios;

    public Cliente buscarClientePorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado.");
        return null;
    }

    public List<Pedido> listarPedidosPorCliente(Cliente cliente) {
        List<Pedido> pedidosDoCliente = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            pedidosDoCliente.add(pedido);
        }
        return pedidosDoCliente;
    }
}

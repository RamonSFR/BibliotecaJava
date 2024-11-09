public class Funcionario {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void registrarPedido(Pedido pedido) {

    }

    public void embalarPedido(Pedido pedido) {

    }

    public void atualizarStatusPedido(Pedido pedido, String status) {

    }

    public boolean verificarDisponibilidadeEmpacotamento() {
        // fazer verificação
        return true;
    }
}

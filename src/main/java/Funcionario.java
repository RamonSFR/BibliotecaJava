public class Funcionario {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void registrarPedido(Pedido pedido) {
        System.out.println("Pedido registrado com sucesso pelo funcionário " + nome);
    }

    public void embalarPedido(Pedido pedido) {
        if (verificarDisponibilidadeEmpacotamento()) {
            System.out.println("Pedido embalado com sucesso");
        } else {
            System.out.println("Não está disponível");
        }
    }

    public void atualizarStatusPedido(Pedido pedido, String status) {
        pedido.setStatus(status);
        System.out.println("Status do pedido atualizado para: " + status);
    }

    public boolean verificarDisponibilidadeEmpacotamento() {
        return true;
    }
}

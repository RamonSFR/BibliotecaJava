public class Funcionario {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void registrarPedido(Pedido pedido) {
        System.out.println("Pedido registrada com sucesso pelo fucionario" + nome);
    }

    public void embalarPedido(Pedido pedido) {
        if (verificarDisponibilidadeEmpacotamento()){
            System.out.println("Pedido embalado com sucesso");
        } else {
            System.out.println("Não está disponível");
        }
    }

    public void atualizarStatusPedido(Pedido pedido, String status) {
        pedido.setStatus(status);
        System.out.println("Status do pedido: " + status);
    }

    public boolean verificarDisponibilidadeEmpacotamento() {
        // fazer verificação
        return true;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

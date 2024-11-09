public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String senha;

    public Cliente(String nome, String email, String telefone, String endereco, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.senha = senha;
    }

    public void cadastrar(String nome, String telefone, String endereco, String email, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
    }

    public void realizarPedido(Pedido pedido) {
        // Implementação do pedido
    }

    public void consultarPedidos() {
        // Consultar histórico de pedidos
    }

    public void atualizarCadastro(String nome, String telefone, String endereco, String email, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
    }

    private boolean validarDadosCadastro() {
        // Lógica para validar os dados do cadastro
        return true;
    }
}

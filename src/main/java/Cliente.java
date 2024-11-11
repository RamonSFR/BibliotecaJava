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
        if (validarDadosCadastro(nome, telefone, endereco, email, senha)){
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;
            this.email = email;
            this.senha = senha;
        } else {
            System.out.println("Erro ao cadastrar cliente");
        }
    }

    public void realizarPedido(Pedido pedido) {
        // Implementação do pedido
    }

    public void consultarPedidos() {
        // Consultar histórico de pedidos
    }

    public void atualizarCadastro(String nome, String telefone, String endereco, String email, String senha) {
        if (validarDadosCadastro(nome, telefone, endereco, email, senha)){
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;
            this.email = email;
            this.senha = senha;
        } else {
            System.out.println("Erro ao atualizar cliente");
        }
    }

    private boolean validarDadosCadastro(String nome, String telefone, String endereco, String email, String senha) {
        // Lógica para validar os dados do cadastro
        return nome != null && !nome.isEmpty() &&
                telefone != null && !telefone.isEmpty() &&
                endereco != null && !endereco.isEmpty() &&
                email != null && email.contains("@") &&
                senha != null && senha.length() >= 6;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}

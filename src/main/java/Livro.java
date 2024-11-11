public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private double preco;
    private int anoPublicacao;

    public Livro(String titulo, String autor, String isbn, double preco, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.preco = preco;
        this.anoPublicacao = anoPublicacao;
    }

    public String consultarInformacoes() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn +
                ", Preço: " + preco + ", Ano: " + anoPublicacao;
    }

    public double calcularPrecoComDesconto(double percentualDesconto) {
        return preco - (preco * percentualDesconto / 100);
    }
}

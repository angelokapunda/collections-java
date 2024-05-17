package livros;

public class Livros {

    private String autor;
    private String titulo;
    private int anoPublicacao;

    public Livros(int anoPublicacao, String autor, String titulo) {
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livros[ Título: " + titulo + ", " + "Autor: " + autor + ", " + "Ano de Publicação: " + anoPublicacao;
    }
}

package Catalogo_de_livros;

public class Livro {
    // atributos

    private String autor;
    private String titulo;
    private int anoPublicacao;

    
    public Livro(String autor, String titulo, int anoPublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }


    public String getTitulo() {
        return titulo;
    }


    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro- autor: " + autor + ", titulo: " + titulo + ", ano de publicação: " + anoPublicacao + ".";
    }

    

}

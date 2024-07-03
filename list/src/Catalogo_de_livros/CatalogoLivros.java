package Catalogo_de_livros;
import java.util.ArrayList;
import java.util.List; 

public class CatalogoLivros {

    private List <Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String autor, String titulo, int anoPublicacao){
     livroList.add(new Livro(autor, titulo, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntevaloAnos(int anoInicial, int anoFinal){

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarLivro(String titulo){

       Livro livroPorTitulo = null;

       if(!livroList.isEmpty()){
        for(Livro l : livroList){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = l;
                break;
            }
        }
       }
       return livroPorTitulo;
    }
}

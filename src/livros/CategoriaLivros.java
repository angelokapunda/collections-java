package livros;

import java.util.ArrayList;
import java.util.List;

public class CategoriaLivros {

    private List<Livros> livros;

    public CategoriaLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionaLivros(int anoPublicaacao, String autor, String titulo ) {
        livros.add(new Livros(anoPublicaacao, autor,titulo));
    }

    public List<Livros> pesquisarPorAutor(String autor) {
        List<Livros> livrosPorAutor = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livros l : livros) {
                if (l.getAutor().equalsIgnoreCase(autor) ) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
}

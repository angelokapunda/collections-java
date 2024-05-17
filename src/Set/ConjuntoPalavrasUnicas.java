package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<Palavras> setPalavras ;

    public ConjuntoPalavrasUnicas() {
        this.setPalavras = new HashSet<>();
    }

    public void adicionaPalavra(String palavra) {
        setPalavras.add(new Palavras(palavra));
    }
    public void removePalavra(String palavra) {
        Palavras palavraParaRemover = null;
        for (Palavras p : setPalavras) {
            if (p.getPalavraUnica().equalsIgnoreCase(palavra)) {
                palavraParaRemover = p;
            }
        }
        setPalavras.remove(palavraParaRemover);
    }
    public int contarPalavras() {
        return setPalavras.size();
    }

    public void todasPalavras() {
        System.out.println(setPalavras);
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        System.out.println("Existem " + conjuntoPalavrasUnicas.contarPalavras() + " palavras.");

        conjuntoPalavrasUnicas.adicionaPalavra("Angelo");
        conjuntoPalavrasUnicas.adicionaPalavra("Carlos");
        conjuntoPalavrasUnicas.adicionaPalavra("Kapunda");
        conjuntoPalavrasUnicas.adicionaPalavra("Angelo");
        conjuntoPalavrasUnicas.adicionaPalavra("Pedro");
        System.out.println("Existem " + conjuntoPalavrasUnicas.contarPalavras() + " palavras.");

        conjuntoPalavrasUnicas.removePalavra("Carlos");
        System.out.println("Existem " + conjuntoPalavrasUnicas.contarPalavras() + " palavras.");

        conjuntoPalavrasUnicas.todasPalavras();
    }
}

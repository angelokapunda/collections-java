package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvite {

    private Set<Convidado> setConvidado;

    public ConjuntoConvite() {
        this.setConvidado = new HashSet<>();
    }

    public void adicionaConvidado(String nome, int codigoConvidado) {
        setConvidado.add(new Convidado(codigoConvidado, nome));
    }

    public void removerConvite(int codidoConnvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : setConvidado) {
            if (convidado.getCodigoConvite() == codidoConnvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        setConvidado.remove(convidadoParaRemover);
    }

    public int contagemConvite() {
        return setConvidado.size();
    }

    public void todosConvidados() {
        System.out.println(setConvidado);
    }

    public static void main(String[] args) {
        ConjuntoConvite conjuntoConvite = new ConjuntoConvite();

        System.out.println("Existem " + conjuntoConvite.contagemConvite() + " convites");

        conjuntoConvite.adicionaConvidado("convidado1" ,123 );
        conjuntoConvite.adicionaConvidado("convidado1" ,124 );
        conjuntoConvite.adicionaConvidado("convidado1" ,125 );
        conjuntoConvite.adicionaConvidado("convidado1" ,123 );
        conjuntoConvite.adicionaConvidado("convidado1" ,123 );

        System.out.println("Existem " + conjuntoConvite.contagemConvite() + " convites");

        conjuntoConvite.removerConvite(123);
        System.out.println("Existem " + conjuntoConvite.contagemConvite() + " convites");

        conjuntoConvite.todosConvidados();
    }

}


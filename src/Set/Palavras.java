package Set;

import java.util.Objects;

public class Palavras {

    private String palavraUnica;

    public Palavras(String palavraUnica) {
        this.palavraUnica = palavraUnica;
    }

    public String getPalavraUnica() {
        return palavraUnica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Palavras palavras)) return false;
        return Objects.equals(getPalavraUnica(), palavras.getPalavraUnica());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPalavraUnica());
    }

    @Override
    public String toString() {
        return "Palavras{" +
                "palavraUnica='" + palavraUnica + '\'' +
                '}';
    }
}

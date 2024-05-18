package agenda;

import java.util.Objects;

public class Contacto {

    private String nome;
    private int numero;

    public Contacto(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacto contacto)) return false;
        return Objects.equals(getNome(), contacto.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}

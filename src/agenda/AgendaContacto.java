package agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContacto {

    private Set<Contacto> setContacto;

    public AgendaContacto() {
        this.setContacto = new HashSet<>();
    }

    public void adicionar(String nome, int numero) {
        setContacto.add(new Contacto(nome, numero));
    }

    public void mostraContactos() {
        System.out.println(setContacto);
    }

    public Set<Contacto>  pesquisaPorNome(String nome) {
        Set<Contacto> pesquisaContacto = new HashSet<>();
        for (Contacto c : setContacto) {
            if (c.getNome().startsWith(nome)) {
                pesquisaContacto.add(c);
            }
        }
        return pesquisaContacto;
    }

    public Contacto actualizaContacto(String nome, int novoNumero) {
        Contacto contactoActualizar = null;
        for (Contacto c : setContacto) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contactoActualizar = c;
                break;
            }
        }
        return contactoActualizar;
    }

    public static void main(String[] args) {

        AgendaContacto agendaContacto = new AgendaContacto();

        agendaContacto.mostraContactos();

        agendaContacto.adicionar("Angelo", 222222);
        agendaContacto.adicionar("Angelo", 333333);
        agendaContacto.adicionar("Carlos", 222222);
        agendaContacto.adicionar("Kapunda", 222222);
        agendaContacto.adicionar("Santos", 222222);
        agendaContacto.mostraContactos();

        agendaContacto.actualizaContacto("Carlos", 1010101);
        agendaContacto.mostraContactos();
    }
}

package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContactoMap {

    private Map<String, Integer> agendaContatoMap = new HashMap<>();

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContactos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer retornarNumero = null;
        if (!agendaContatoMap.isEmpty()) {
            retornarNumero = agendaContatoMap.get(nome);
        }
        return retornarNumero;
    }

    public static void main(String[] args) {
        AgendaContactoMap agendaContactoMap = new AgendaContactoMap();

        agendaContactoMap.exibirContactos();

        agendaContactoMap.adicionarContato("Angelo", 111111);
        agendaContactoMap.adicionarContato("Angelo Carlos", 1144511);
        agendaContactoMap.adicionarContato("Kapunda", 124511);
        agendaContactoMap.adicionarContato("Alcides", 118761);
        agendaContactoMap.adicionarContato("Ale", 9576);
        agendaContactoMap.adicionarContato("Ana", 986354);
        agendaContactoMap.adicionarContato("Angelo", 563232);

        agendaContactoMap.exibirContactos();

        agendaContactoMap.removerContato("Angelo");

        agendaContactoMap.exibirContactos();


        System.out.println("O número é " + agendaContactoMap.pesquisarPorNome("Kapunda") );
    }
}

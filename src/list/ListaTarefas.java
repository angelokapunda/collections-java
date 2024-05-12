package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefas(String descricao) {
        List<Tarefa> removeLista = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                removeLista.add(t);
            }
        }
        tarefaList.removeAll(removeLista);
    }

    public int numeroList() {
        return tarefaList.size();
    }

    public void mostrarDescricao() {
        System.out.println(tarefaList);
    }



}

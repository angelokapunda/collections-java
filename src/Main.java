import list.ListaTarefas;

public class Main {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println(" O numero na lista de tarefas é de : " + listaTarefas.numeroList());
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");

        System.out.println(" O numero na lista de tarefas é de : " + listaTarefas.numeroList());

        listaTarefas.removeTarefas("Tarefa 2");

        System.out.println(" O numero na lista de tarefas é de : " + listaTarefas.numeroList());

        listaTarefas.mostrarDescricao();
    }
}
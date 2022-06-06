import java.util.ArrayList;

public class ListaTodo {
    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        int sizeList = this.tarefas.size();
        if (sizeList == 0) {
            this.tarefas.add(tarefa);
        } else {
            for (int i = 0; i < sizeList; i++) {
                if (this.tarefas.get(i).getIdentificador() == tarefa.getIdentificador()) {
                    throw new IllegalArgumentException(String.format("Tarefa com identificador %d ja existente na lista", tarefa.getIdentificador()));
                }
            }
            if (tarefa.getDescricao() != null && !tarefa.getDescricao().isEmpty()) {
                this.tarefas.add(tarefa);
            }
        }

    }


    public boolean marcarTarefaFeita(int identificador) {
        boolean updateTask = false;
        for (Tarefa currentTarefa : this.tarefas) {
            if (currentTarefa.getIdentificador() == identificador) {
                updateTask = true;
                currentTarefa.setEstahFeita(updateTask);
            } else {
                currentTarefa.setEstahFeita(false);
            }
        }
        return updateTask;
    }

    public boolean desfazerTarefa(int identificador) {
        boolean result = false;
        for (Tarefa tarefa : this.tarefas) {
            if (!tarefa.getEstahFeita() && tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(false);
                result = true;
            }

        }
        return result;
    }

    public void desfazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getEstahFeita()) {
                System.out.printf("[X]  Id: %d - Descricao: %s%n", tarefa.getIdentificador(), tarefa.getDescricao());
            } else {
                System.out.printf("[ ]  Id: %d - Descricao: %s%n", tarefa.getIdentificador(), tarefa.getDescricao());
            }
        }
    }
}
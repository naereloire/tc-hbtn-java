import java.util.ArrayList;
import java.util.List;
import atividades.*;
public class Workflow {
  List<Atividade> atividades;

  public Workflow() {
    this.atividades = new ArrayList<>();
  }

  public void registrarAtividade(Atividade atividade) {
    this.atividades.add(atividade);
  }
}

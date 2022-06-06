import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    List<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<CanalNotificacao>();
    }

    public void registrarCanal(CanalNotificacao tipoCanal){
        this.canais.add(tipoCanal);
    }
    public void processar(Video video){
        for(CanalNotificacao canal : this.canais){
            String mensagemTexto = String.format("%s - %s", video.arquivo,video.formato);
            Mensagem mensagem = new Mensagem(mensagemTexto, TipoMensagem.LOG);
            canal.notificar(mensagem);
        }
    }
}
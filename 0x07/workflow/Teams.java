public class Teams implements CanalNotificacao {
    public Teams() {
    }
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.printf("[TEAMS] {%s} - %s\n", mensagem.tipoMensagem,mensagem.texto);
    }
}
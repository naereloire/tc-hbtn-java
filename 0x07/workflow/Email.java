public class Email  implements CanalNotificacao{
    public Email() {
    }
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.printf("[EMAIL] {%s} - %s\n", mensagem.tipoMensagem,mensagem.texto);
    }
}
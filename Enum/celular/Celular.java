
import java.util.ArrayList;

public class Celular {
    private final ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<>();
    }

    public int obterPosicaoContato(String nomeContato) {
        int result = -1;
        if (!this.contatos.isEmpty()) {
            for (int i = 0; i < this.contatos.size(); i++) {
                if (this.contatos.get(i).getNome().equals(nomeContato)) {
                    return i;
                }
            }
        }
        return result;

    }

    private void throwException(String mensagem) throws Exception {
        throw new Exception(mensagem);
    }

    public void adicionarContato(Contato contato) throws Exception {
        String mensagem = "Nao foi possivel adicionar contato. Contato jah existente com esse nome";
        if (this.obterPosicaoContato(contato.getNome()) != -1) {
            this.throwException(mensagem);
        } else {
            this.contatos.add(contato);
        }

    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws Exception {
        String mensagem = "";
        int indexNovo= this.obterPosicaoContato(novoContato.getNome());
        int indexAntigo = this.obterPosicaoContato(contatoAntigo.getNome());
        if (indexAntigo == -1) {
            mensagem = "Nao foi possivel modificar contato. Contato nao existe";
            this.throwException(mensagem);
        } else if (indexNovo != -1 && indexNovo != indexAntigo) {
            mensagem = "Nao foi possivel modificar contato. Contato jah existente com esse nome";
            this.throwException(mensagem);
        } else {
            this.contatos.set(indexNovo, novoContato);
        }
    }

    public void removerContato(Contato contato) throws Exception {
        String mensagem = "Nao foi possivel remover contato. Contato nao existe";
        if (this.obterPosicaoContato(contato.getNome()) == -1) {
            this.throwException(mensagem);
        } else {
            this.contatos.remove(this.obterPosicaoContato(contato.getNome()));
        }
    }


    public void listarContatos() {
        for (Contato contato : this.contatos) {
            System.out.printf("%s -> %s (%s)%n", contato.getNome(), contato.getNúmeroTelefone(), contato.getTipo());
        }
    }
}
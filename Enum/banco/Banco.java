import java.util.ArrayList;

public class Banco {
    private  String nome;
    private  ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String nomeBanco) {
        if (!this.agencias.isEmpty()) {
            for (Agencia agencia : this.agencias) {
                if (agencia.getNome().equals(nomeBanco)) {
                    return agencia;
                }
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nome) {
        Agencia agenciaToAdd = new Agencia(nome);
        if (this.buscarAgencia(nome) == null) {
            this.agencias.add(agenciaToAdd);
            return true;
        }
        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacaoinicial) {
        Agencia agenciaEncontrada = this.buscarAgencia(nomeAgencia);
        if (agenciaEncontrada != null) {
            if (agenciaEncontrada.buscarCliente(nomeCliente) == null) {
                agenciaEncontrada.novoCliente(nomeCliente, valorTransacaoinicial);
            }
            return true;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        Agencia agenciaEncontrada = this.buscarAgencia(nomeAgencia);
        if (agenciaEncontrada == null || agenciaEncontrada.buscarCliente(nomeCliente) == null) {
            return false;
        }
        agenciaEncontrada.adicionarTransacaoCliente(nomeCliente, valorTransacao);
        return true;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacoes) {
        Agencia agenciaEncontrada = this.buscarAgencia(nomeAgencia);
        ArrayList<Cliente> listaDeClientes = agenciaEncontrada.getClientes();
        if (agenciaEncontrada != null) {
            for (int i = 0; i < listaDeClientes.size(); i++) {
                System.out.printf("Cliente: %s [%d]\n", listaDeClientes.get(i).getNome(), i + 1);
                if (imprimeTransacoes) {
                    ArrayList<Double> listaTransacoes = listaDeClientes.get(i).getTransacoes();
                    for (int j = 0; j < listaTransacoes.size(); j++) {
                        System.out.printf("  [%d] valor %.2f\n", j + 1, listaTransacoes.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}

import java.util.ArrayList;

public class Agencia {
    private  String nome;
    private    ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String nomeDoCliente) {
        if (!this.clientes.isEmpty()) {
            for (Cliente cliente : this.clientes) {
                if (cliente.getNome().equals(nomeDoCliente)) {
                    return cliente;
                }
            }

        }
        return null;
    }


    public boolean novoCliente(String nomeCliente, double valorTransacaoInicial) {
        Cliente clienteToAdd = buscarCliente(nomeCliente);
        if (clienteToAdd != null) {
            return false;
        }
        Cliente novoCliente = new Cliente(nomeCliente);
        clientes.add(novoCliente);
        novoCliente.adicionarTransacao(valorTransacaoInicial);

        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacao) {
        Cliente cliente = buscarCliente(nomeCliente);
        if (cliente == null) {
            return false;
        }
        cliente.adicionarTransacao(valorTransacao);
        return true;
    }
}
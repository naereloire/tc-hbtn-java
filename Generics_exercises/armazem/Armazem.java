import java.util.*;

public class Armazem<T> implements Armazenavel<T> {

    private Map<String, T> comida = new TreeMap<>();

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        comida.put(nome, valor);

    }

    @Override
    public T obterDoInventario(String nome) {
        return comida.get(nome);
    }

}
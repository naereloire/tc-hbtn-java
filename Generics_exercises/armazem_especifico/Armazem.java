import java.util.*;

public abstract class Armazem<T> implements Armazenavel<T> {

    private Map<String, T> itensList = new TreeMap<>();

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        itensList.put(nome, valor);

    }

    @Override
    public T obterDoInventario(String nome) {
        return itensList.get(nome);
    }

}
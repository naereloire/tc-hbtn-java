public interface Armazenavel<T> {
    public T obterDoInventario(String nome);
    public void adicionarAoInventario(String nome, T valor);
}
public class Telefone {
    private final String codigoArea;
    private final String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + codigoArea + ") " + numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telefone)) return false;

        Telefone telefone = (Telefone) o;

        if (!codigoArea.equals(telefone.codigoArea)) return false;
        return numero.equals(telefone.numero);
    }
    
    @Override
    public int hashCode() {
        int result = codigoArea.hashCode();
        result = 5 * result + numero.hashCode();
        return result;
    }
}


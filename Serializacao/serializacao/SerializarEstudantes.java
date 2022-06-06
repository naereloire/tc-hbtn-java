import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.err;

public class SerializarEstudantes<T> extends ArrayList<Estudante> {
    private final String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        try (FileOutputStream fout = new FileOutputStream(this.nomeArquivo)) {
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(estudantes);

        } catch (Exception e) {
            err.println("Nao foi possivel serializar");
        }
    }

    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() {
        List<Estudante> est = null;
        try (FileInputStream fin = new FileInputStream(this.nomeArquivo)) {
            ObjectInputStream ois = new ObjectInputStream(fin);
            est = (List<Estudante>) ois.readObject();

        } catch (Exception e) {
            System.out.println("Nao foi possivel desserializar");
        }
        return est;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SerializarEstudantes)) return false;
        if (!super.equals(o)) return false;

        SerializarEstudantes that = (SerializarEstudantes) o;

        return nomeArquivo.equals(that.nomeArquivo);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + nomeArquivo.hashCode();
        return result;
    }
}

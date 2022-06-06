import java.util.List;

public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> inteiros, int numero) {
        int result = 0;
        if (inteiros.contains(numero)) {
            result = inteiros.indexOf(numero);
        } else {
            result = -1;
        }
        return result;
    }

    public static void adicionarNumero(List<Integer> inteiros, int numero) {
        if (ManipularArrayNumeros.buscarPosicaoNumero(inteiros, numero) != -1) {
            throw new IllegalArgumentException("Numero jah contido na lista");
        } else {
            inteiros.add(numero);
        }
    }

    public static void removerNumero(List<Integer> inteiros, int numero) {
        if (ManipularArrayNumeros.buscarPosicaoNumero(inteiros, numero) == -1) {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        } else {
            inteiros.remove(ManipularArrayNumeros.buscarPosicaoNumero(inteiros, numero));
        }
    }

    public static void substituirNumero(List<Integer> inteiros, int numeroSubstituir, int numeroSubstituto) {
        int indexNumb = ManipularArrayNumeros.buscarPosicaoNumero(inteiros, numeroSubstituir);
        if (inteiros.contains(numeroSubstituir)) {

            inteiros.set(indexNumb, numeroSubstituto);
        } else {
            inteiros.add(numeroSubstituto);
        }
    }
}

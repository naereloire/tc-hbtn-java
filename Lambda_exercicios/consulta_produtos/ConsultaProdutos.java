import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro) {
        Stream<Produto> stream = produtos.stream().filter(criterioFiltro::testar);
        List<Produto> result;
        result = stream.collect(Collectors.toList());
        return result;
    }
}


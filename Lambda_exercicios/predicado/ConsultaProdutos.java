import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> CriterioFiltro) {
        Stream<Produto> stream = produtos.stream().filter(CriterioFiltro::test);
        List<Produto> result;
        result = stream.collect(Collectors.toList());
        return result;
    }

}
package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemploComSorted {
    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().populaPessoas();

        // Sorted é usado para fazer ordenações

        Stream<Pessoa> stream = lista.stream().filter(p -> p.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getIdade));

        Stream<Pessoa> stream1 = lista.stream().sorted(Comparator.comparing(Pessoa::getIdade));

        Stream<Pessoa> stream2 = lista.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));
    }
}

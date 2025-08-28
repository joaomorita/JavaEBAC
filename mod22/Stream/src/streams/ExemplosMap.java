package streams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemplosMap {
    public static void main(String[] args) {

        List<Pessoa> listaPessoas = new Pessoa().populaPessoas();

        Stream<Integer> streamComMap = listaPessoas.stream()
                .filter(pessoas -> pessoas.getNacionalidade().equals("Mexico"))
                .map(Pessoa::getIdade);

        // Forma mais rápida para processamento de base de dados maior
        IntStream streamMapToInt = listaPessoas.stream()
                .filter(pessoas -> pessoas.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade);
    }
}

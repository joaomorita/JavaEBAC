package streams;

import java.util.List;
import java.util.stream.Stream;

public class ExemplosLimit {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        Stream<Pessoa> stream = pessoas.stream().limit(2);
    }
}

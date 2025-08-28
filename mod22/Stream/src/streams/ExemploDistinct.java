package streams;

import java.util.List;

public class ExemploDistinct {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream().distinct();
    }
}

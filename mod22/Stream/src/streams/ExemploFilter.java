package streams;

import java.util.List;

public class ExemploFilter {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new Pessoa().populaPessoas();

        // imprime o nome usando forEach
        listaPessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .forEach(pessoa -> System.out.println(pessoa.getNome()));

        // imprime o nome usando map
        listaPessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Mexico"))
                .map(Pessoa::getNome)
                .forEach(System.out::println);

    }
}

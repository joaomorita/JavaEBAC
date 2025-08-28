package streams.operacaoFinal;

import streams.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExemploCollect {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        List<Pessoa> listaBrasileiros = lista.stream()
                .filter(brasileiros -> brasileiros.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList());

        System.out.println("Pegando apenas o nome");
        listaBrasileiros.forEach(nomePessoa -> System.out.println(nomePessoa.getNome()));

        System.out.println("Usando o toString da classe Pessoa para printar tudo");
        listaBrasileiros.forEach(System.out::println);

        System.out.println("*********");
        System.out.println("*********");

        System.out.println("Utilizando a operação final direto na expressão");
        lista.stream()
                .filter(mexicanos -> mexicanos.getNacionalidade().equals("Mexico"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Exemplo ArrayList");

        ArrayList<Pessoa> arrayList = lista.stream()
                .filter(nacionalidade -> nacionalidade.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toCollection(ArrayList::new));

        arrayList.forEach(System.out::println);

        System.out.println("************");
        System.out.println("Exemplo Map");
        System.out.println("************");

        Map<Integer, Pessoa> map = lista.stream()
                .filter(nacionalidade -> nacionalidade.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));

        map.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}

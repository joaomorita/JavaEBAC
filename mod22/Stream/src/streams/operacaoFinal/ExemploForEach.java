package streams.operacaoFinal;

import streams.Pessoa;

import java.util.List;

public class ExemploForEach {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        System.out.println("Todos os nomes");
        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("Filtrando brasileiros");
        lista.stream()
                .filter(brasileiros -> brasileiros.getNacionalidade().equals("Brasil"))
                .forEach(nomes -> System.out.println(nomes.getNome()));

        System.out.println("Usando map para pegar apenas a idade dos brasileiros");
        lista.stream()
                .filter(brasileiros -> brasileiros.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade)
                //.forEach(idade -> System.out.println(idade));
                .forEach(System.out::println);
    }
}

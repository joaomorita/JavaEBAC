package atividadeStream;

// atividiade: - ler do console nome e sexo separado por virgula, a partir dessa lista
// criar uma nova lista contendo apenas mulheres utilizando as expressões lambda e imprimir no console

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Atividade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite nome e sexo separado por traço.");
        List<String> listaPessoas = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            listaPessoas.add(teclado.nextLine());
        }

        System.out.println("Filtrando ... ");

        List<String> listaDeMulheres = filtraMulheres(listaPessoas);

        System.out.println("As mulheres na lista são:");
        listaDeMulheres.forEach(System.out::println);
    }

    public static List<String> filtraMulheres(List<String> lista) {

        Set<String> entradasFeminino = Set.of("feminino", "fem", "mulher", "mul");

        return lista.stream()
                .filter(pessoa -> {
                    String[] partes = pessoa.replaceAll(" ", "").split("-");
                    if (partes.length > 2) return false;
                    String sexo = partes[1].toLowerCase();
                    return entradasFeminino.contains(sexo);
                })
                .map(pessoa -> pessoa.split("-")[0])
                .collect(Collectors.toList());

    }
}

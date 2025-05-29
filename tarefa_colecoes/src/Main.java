import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite nome e sexo da pessoa (Pedro - M, Renata - F): ");
        Scanner sc = new Scanner(System.in);
        String nomeComSexo = sc.nextLine();

        // Divide a string na virgula
        String[] sexos = nomeComSexo.split(",");

        Map<String, String> mapaDeNomes = Arrays.stream(sexos)
                .map(nome -> nome.split("-"))
                .filter(partes -> partes.length == 2)  // Verifica se o tamanho das partes é 2
                .collect(Collectors.toMap(partes -> partes[0], partes -> partes[1]));

        List<String> sexoMasculino = new ArrayList<>();
        List<String> sexoFeminino = new ArrayList<>();

        for (Map.Entry<String, String> entry : mapaDeNomes.entrySet()) {
            String nome = entry.getKey().trim(); // Trim() Remove os espaços em branco
            String sexo = entry.getValue().trim().toUpperCase(); // Deixa o sexo com letra maiuscula

            if (sexo.equals("M")) {
                sexoMasculino.add(nome);
            } else if (sexo.equals("F")) {
                sexoFeminino.add(nome);
            }
        }

        System.out.println("Sexo masculino: ");
        System.out.println(sexoMasculino);
        System.out.println("Sexo feminino: ");
        System.out.println(sexoFeminino);
    }
}
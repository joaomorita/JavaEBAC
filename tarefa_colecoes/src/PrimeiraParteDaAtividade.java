import java.util.*;

public class PrimeiraParteDaAtividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite alguns nomes separados por vírgula (,) ");
        String nomes = sc.nextLine();
        List<String> listaNomes = new ArrayList<>(List.of(nomes.split(",")));

        listaNomes.replaceAll(String::trim);

        Collections.sort(listaNomes);

        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class CadastroPessoas {
    private List<Pessoa> arrayDePessoas = new ArrayList<>();

    public void addPessoas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas você quer adicionar?");
        int qtadPessoas = sc.nextInt();

        for (int i = 0; i < qtadPessoas; i++) {
            System.out.println("Informe o nome: ");
            String nomePessoa = sc.next();
            System.out.println("Informe o sexo: ");
            String sexoPessoa = sc.next();

            Pessoa p = new Pessoa(nomePessoa, sexoPessoa);
            arrayDePessoas.add(p);
        }

    }

    public void separaPorGrupos() {
        Map<Sexo, List<Pessoa>> pessoasPorSexo = arrayDePessoas.stream()
                .filter(p -> p.getSexo() != null)
                .collect(Collectors.groupingBy(Pessoa :: getSexo));

        List<Pessoa> sexoMasculino = pessoasPorSexo.getOrDefault(Sexo.MASCULINO, Collections.emptyList());
        List<Pessoa> sexoFeminino = pessoasPorSexo.getOrDefault(Sexo.FEMININO, Collections.emptyList());

        System.out.println("Pessoas do sexo masculino:");
        sexoMasculino.forEach(p -> System.out.println(p.getNome()));

        System.out.println("\nPessoas do sexo feminino:");
        sexoFeminino.forEach(p -> System.out.println(p.getNome()));
    }
}

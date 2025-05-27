import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        List<Pessoa> sexoMasculino = new ArrayList<>();
        List<Pessoa> sexoFeminino = new ArrayList<>();

        for (Pessoa pessoa : arrayDePessoas) {
            if (pessoa.getSexo().equalsIgnoreCase("masculino") || pessoa.getSexo().equalsIgnoreCase("m")) {
                sexoMasculino.add(pessoa);
            } else if (pessoa.getSexo().equalsIgnoreCase("feminino") || pessoa.getSexo().equalsIgnoreCase("f")) {
                sexoFeminino.add(pessoa);
            }
        }

        System.out.println("Pessoas do sexo masculino:");
        for (Pessoa p : sexoMasculino) {
            System.out.println(p);
        }

        System.out.println("------------------------- || -------------------------");

        System.out.println("Pessoas do sexo feminino:");
        for (Pessoa p : sexoFeminino) {
            System.out.println(p);
        }
    }
}

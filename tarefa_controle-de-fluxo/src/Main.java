import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota 4: ");
        double nota4 = scanner.nextDouble();

        CalculaNota aluno = new CalculaNota(nota1, nota2, nota3, nota4);

        System.out.println("Média Final: " + aluno.calculaMediaFinal());
        System.out.println("Situação: " + aluno.defineAprovacao());
    }
}
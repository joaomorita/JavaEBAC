import java.util.Scanner;

public class CalculaNota {

    double nota1;

    double nota2;

    double nota3;

    double nota4;

    public CalculaNota(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public double calculaMediaFinal() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public String defineAprovacao() {
        double media = calculaMediaFinal();
        if (media < 5) {
            return "Reprovado";
        } else if (media < 7) {
            return "Recuperação";
        } else {
            return "Aprovado";
        }
    }
}

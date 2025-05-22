public class CalculaMedia {
    double nota1;
    double nota2;
    double nota3;
    double nota4;

    public CalculaMedia(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public void mediaFinal() {
        double notaTotal = nota1 + nota2 + nota3 + nota4 ;
        double notaMedia = notaTotal / 4;
        System.out.println("A nota final é: " + notaMedia);
    }
}

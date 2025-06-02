public class Main {
    public static void main(String[] args) {
        Pessoa pf = new PessoaFisica("Pedro", "Silva", "Av Brasil", "123.456.789-10");
        Pessoa pj = new PessoaJuridica("Carlos", "Pereira", "Av Pernambuco", "09391093-0001");

        pf.exibirInfos();
        pj.exibirInfos();
    }
}
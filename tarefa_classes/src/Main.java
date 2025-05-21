public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Ford", "Fiesta",
                "Preto", false, 2019);

        meuCarro.exibirInformacoes();
        meuCarro.acelerar();
        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.exibirInformacoes();
        meuCarro.desligar();
        meuCarro.exibirInformacoes();
    }
}
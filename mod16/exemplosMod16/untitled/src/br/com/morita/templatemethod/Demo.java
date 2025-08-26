package br.com.morita.templatemethod;

public class Demo {
    public static void main(String[] args) {
        Trabalhador bombeiro = new Bombeiro();
        bombeiro.executar();
        Trabalhador policial = new Policial();
        policial.executar();
    }
}

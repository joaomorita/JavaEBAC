package br.com.morita.templatemethod;

public class Bombeiro extends Trabalhador{
    @Override
    protected void trabalhar() {
        System.out.println("Fazendo trabalho de bombeiro.");
    }
}

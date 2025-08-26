package br.com.morita.templatemethod;

public abstract class Trabalhador {

    public void executar() {
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    protected abstract void trabalhar();

    private void voltarParaCasa() {
        System.out.println("Voltando para casa");
    }

    private void irAoTrabalho() {
        System.out.println("Indo para o trabalho");
    }

    private void iniciarRotina() {
        System.out.println("Iniciando Rotina");
    }

    private void levantar() {
        System.out.println("Levantando da cama");
    }
}

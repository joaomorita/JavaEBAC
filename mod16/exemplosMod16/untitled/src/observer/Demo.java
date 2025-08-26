package observer;

public class Demo {
    public static void main(String[] args) {
        Jornalista jor = new Jornalista();
        jor.addObserver(new TV());
        jor.notifyAll("teste");
    }
}

package generics;

public class Honda implements Carro{

    private String modelo;

    public Honda(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getNome() {
        return "Honda " + modelo;
    }
}

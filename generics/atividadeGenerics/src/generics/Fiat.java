package generics;

public class Fiat implements Carro {

    private String modelo;

    public Fiat(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getNome() {
        return "Fiat " + modelo;
    }
}

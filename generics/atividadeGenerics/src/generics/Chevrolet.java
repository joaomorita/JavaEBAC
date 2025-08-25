package generics;

public class Chevrolet implements Carro{

    private String modelo;

    public Chevrolet(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public String getNome() {
        return "Chevrolet " + modelo;
    }
}

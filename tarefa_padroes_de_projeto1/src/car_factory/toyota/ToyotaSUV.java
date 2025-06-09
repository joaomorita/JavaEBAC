package car_factory.toyota;

import car_factory.interfaces.SUV;

public class ToyotaSUV implements SUV {
    String marca = "Toyota";
    private String modelo;
    private String cor;

    public ToyotaSUV(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getTipo(){
        return "SUV";
    }

    @Override
    public void exibirInfos() {
        System.out.println("Carro da marca " +  getMarca() + " - Tipo " + getTipo() + " - Modelo" + getModelo() + " - Cor" + getCor());
    }
}

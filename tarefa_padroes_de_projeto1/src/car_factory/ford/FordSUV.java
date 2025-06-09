package car_factory.ford;

import car_factory.interfaces.SUV;

public class FordSUV implements SUV {
    private String modelo;
    private String cor;
    private String marca = "Ford";

    public FordSUV(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String getTipo() {
        return "SUV";
    }


    @Override
    public void exibirInfos() {
        System.out.println("Carro da marca " +  getMarca() + " - Tipo " + getTipo() + " - Modelo" + getModelo() + " - Cor" + getCor());
    }
}

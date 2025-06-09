package car_factory.ford;

import car_factory.interfaces.Sedan;

public class FordSedan implements Sedan {
    private String modelo;
    private String marca = "Ford";
    private String cor;

    FordSedan(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String getTipo() {
        return "Sedan";
    }


    @Override
    public void exibirInfos() {
        System.out.println("Carro da marca " +  getMarca() + " - Tipo " + getTipo() + " - Modelo" + getModelo() + " - Cor" + getCor());
    }
}

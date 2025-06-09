package car_factory.toyota;

import car_factory.interfaces.Sedan;

public class ToyotaSedam implements Sedan {
    String marca = "Toyota";
    String modelo;
    String cor;

    public ToyotaSedam(String modelo, String cor) {
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

    @Override
    public String getTipo() {
        return "Sedan";
    }


    @Override
    public void exibirInfos() {
        System.out.println("Carro da marca " +  getMarca() + " - Tipo " + getTipo() + " - Modelo" + getModelo() + " - Cor" + getCor());
    }
}

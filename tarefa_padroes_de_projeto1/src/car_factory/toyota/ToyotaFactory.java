package car_factory.toyota;

import car_factory.interfaces.CarFactory;
import car_factory.interfaces.SUV;
import car_factory.interfaces.Sedan;

public class ToyotaFactory implements CarFactory {

    @Override
    public Sedan CriaSedan(String modelo, String cor) {
        return new ToyotaSedam(modelo, cor);
    }

    @Override
    public SUV CriaSUV(String modelo, String cor) {
        return new ToyotaSUV(modelo, cor);
    }
}

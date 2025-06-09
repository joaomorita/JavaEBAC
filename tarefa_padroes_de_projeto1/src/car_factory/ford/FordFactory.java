package car_factory.ford;

import car_factory.interfaces.CarFactory;
import car_factory.interfaces.SUV;
import car_factory.interfaces.Sedan;

public class FordFactory implements CarFactory {
    @Override
    public Sedan CriaSedan(String modelo, String cor) {
        return new FordSedan(modelo, cor);
    }

    @Override
    public SUV CriaSUV(String modelo, String cor) {
        return new FordSUV(modelo, cor);
    }
}

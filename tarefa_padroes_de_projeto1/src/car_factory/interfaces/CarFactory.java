package car_factory.interfaces;

public interface CarFactory {
    Sedan CriaSedan(String modelo, String cor);
    SUV CriaSUV(String modelo, String cor);
}

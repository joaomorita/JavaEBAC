import car_factory.ford.FordFactory;
import car_factory.interfaces.CarFactory;
import car_factory.interfaces.SUV;
import car_factory.interfaces.Sedan;
import car_factory.toyota.ToyotaFactory;


public class Cliente {
    public static void main(String[] args) {
        CarFactory toyota = new ToyotaFactory();
        SUV toyotaSUV = toyota.CriaSUV("SW4", "Preta");
        Sedan sedanToyota = toyota.CriaSedan("Corolla", "Branco");
        toyotaSUV.exibirInfos();
        sedanToyota.exibirInfos();

        System.out.println("-------------- * --------------");

        CarFactory ford = new FordFactory();
        Sedan sedanFord = ford.CriaSedan("Focus", "Prata");
        SUV fordSUV = ford.CriaSUV("Bronco", "Laranja");
        sedanFord.exibirInfos();
        fordSUV.exibirInfos();
    }
}
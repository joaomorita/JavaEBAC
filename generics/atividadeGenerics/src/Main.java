import generics.Chevrolet;
import generics.Fiat;
import generics.Honda;
import generics.ListaDeCarros;

public class Main {
    public static void main(String[] args) {
        ListaDeCarros lista = new ListaDeCarros();

        lista.adicionar(new Honda("City"));
        lista.adicionar(new Honda("Civic"));
        lista.adicionar(new Chevrolet("Onix"));
        lista.adicionar(new Fiat("Uno"));

        lista.listar();
    }
}
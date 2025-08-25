package generics;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros<T extends Carro>{
    private List<T> carros = new ArrayList<>();

    public void adicionar(T carro) {
        carros.add(carro);
    }

    public void listar() {
        for (T carro : carros) {
            System.out.println(carro.getNome());
        }
    }
}

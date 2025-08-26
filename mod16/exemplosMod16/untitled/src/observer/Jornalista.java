package observer;

import java.util.ArrayList;
import java.util.List;

public class Jornalista implements Subject{

    public List<Observer> observers = new ArrayList<>();

    private String titulo;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAll(String titulo) {
        this.titulo = titulo;
        for (Observer o : this.observers) {
            o.update(this);
        }
    }
}

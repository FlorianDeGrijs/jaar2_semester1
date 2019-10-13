package design.pattern.observer;

import java.util.Vector;

public class Database implements Subject{
    private Vector<Observer> observers;
    private String operation;
    private String record;

    public Database() {
        observers = new Vector<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(operation, record);
        }
    }

    public void editRecord(String operation, String record) {
        this.operation = operation;
        this.record = record;
        notifyObservers();
    }
}

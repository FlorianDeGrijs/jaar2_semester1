package design.pattern.observer;

public class Boss implements Observer{
    @Override
    public void update(String operation, String record) {
        System.out.println("Operation for Boss: " + operation + " record: " + record);
    }
}

package design.pattern.observer;

public class Client implements Observer {
    @Override
    public void update(String operation, String record) {
        int num = Integer.parseInt(record)*2;
        System.out.println("Operation for Client: " + operation + " Record: " + num);
    }
}

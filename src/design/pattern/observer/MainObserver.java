package design.pattern.observer;

public class MainObserver {
    public static void main(String[] args) {
        Database database = new Database();
        Observer boss = new Boss();
        Observer client = new Client();
        database.registerObserver(boss);
        database.registerObserver(client);
        database.editRecord("Yeet", "11");
    }
}

package design.pattern.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Database d = Database.getInstance("House");
        String name = d.getName();
        System.out.println(name);
    }
}

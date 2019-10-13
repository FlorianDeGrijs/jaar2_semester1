package design.pattern.singleton;

public class Database {
    private static Database singleDatabase;
    private int record;
    private String name;

    private Database(String name) {
        this.name = name;
        record = 0;
    }

    public void editRecord(String operation) {
        System.out.println("Performing a " + operation +
                " operation on record " + record +
                " in database " + name);
    }

    public String getName() {
        return name;
    }

    public static Database getInstance(String name) {
        if (singleDatabase == null) {
            singleDatabase = new Database(name);
        }
        return singleDatabase;
    }
}

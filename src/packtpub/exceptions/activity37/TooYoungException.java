package packtpub.exceptions.activity37;

public class TooYoungException extends Exception{
    int age;
    String name;

    public TooYoungException(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

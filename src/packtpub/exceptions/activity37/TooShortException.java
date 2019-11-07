package packtpub.exceptions.activity37;

public class TooShortException extends Exception {
    int height;
    String name;

    public TooShortException(int height, String name) {
        this.height = height;
        this.name = name;
    }
}

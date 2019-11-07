package packtpub.exceptions.user_help;

public class NonNumberInListException extends Exception {
    int index;

    public NonNumberInListException(int index, Throwable cause) {
        super(cause);
        this.index = index;
    }
}

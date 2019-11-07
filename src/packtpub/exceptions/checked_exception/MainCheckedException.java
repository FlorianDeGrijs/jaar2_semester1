package packtpub.exceptions.checked_exception;

import java.io.IOException;

public class MainCheckedException {

    private static void myFunction() throws IOException {
        throw new IOException("hello");
    }

    public static void main(String[] args) {
        try {
            myFunction();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

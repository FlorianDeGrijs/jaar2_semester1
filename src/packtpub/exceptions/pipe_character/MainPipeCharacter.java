package packtpub.exceptions.pipe_character;

import java.io.IOException;

public class MainPipeCharacter {

    public static void method1() throws IOException {
        System.out.println(4/0);
    }

    public static void main(String[] args) {
        try {
            System.out.println("line 1");
            method1();
            System.out.println("line 2");
        } catch (IOException|ArithmeticException e) {
            System.out.println("An IOException or a ArithmeticException was thrown. Details below.");
            e.printStackTrace();
        }
    }
}

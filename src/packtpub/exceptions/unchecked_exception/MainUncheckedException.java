package packtpub.exceptions.unchecked_exception;

public class MainUncheckedException {

    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("this is not a number");
        } catch (NumberFormatException e) {
            System.out.println("NO INTEGER");
        }

    }

}

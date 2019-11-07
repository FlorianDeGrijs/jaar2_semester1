package packtpub.exceptions.exc_vs_error;

public class MainExcError {

    public static void main(String[] args) {
        THFunction thFunction = new THFunction();
        thFunction.callThrowingFunctions();
        thFunction.callErrorCodeFunctions();
    }
}

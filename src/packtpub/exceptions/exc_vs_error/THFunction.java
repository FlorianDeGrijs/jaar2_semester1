package packtpub.exceptions.exc_vs_error;

import java.io.IOException;
import java.util.Random;

public class THFunction {

    private Random random = new Random();
    private static final int EC_NONE = 0;
    private static final int EC_IO = 1;
    private static final int EC_INTERRUPTION = 2;

    private void thFunction1() throws IOException {
        System.out.println("thFunction1 start");
        if (this.random.nextInt(10) < 2) {
            throw new IOException("An I/O exception occurred in thFunction1");
        }
        System.out.println("thFunction1 done");
    }

    private void thFunction2() throws IOException, InterruptedException {
        int r = this.random.nextInt(10);
        System.out.println("thFunction2 start");
        if (r < 2) {
            throw new IOException("An I/O exception occurred in thFunction2");
        }
        if (r > 8) {
            throw new InterruptedException("An interruption occurred in thFunction2");
        }
        System.out.println("thFunction2 done");
    }

    private int ecFunction1() {
        System.out.println("ecFunction1 start");
        if (random.nextInt(10) < 2) {
            return EC_IO;
        }
        System.out.println("thFunction1 done");
        return EC_NONE;
    }

    private int ecFunction2() {
        System.out.println("ecFunction2 start");
        int r = random.nextInt(10);
        if (r < 2) {
            return EC_IO;
        }
        if (r > 8) {
            return EC_INTERRUPTION;
        }
        System.out.println("ecFunction2 done");
        return EC_NONE;
    }

    public void callThrowingFunctions() {
        try {
            thFunction1();
            thFunction2();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public void callErrorCodeFunctions() {
        int err = ecFunction1();
        if (err != EC_NONE) {
            if (err == EC_IO) {
                System.out.println("An I/O exception occurred in ecFunction1.");
            }
        }
        err = ecFunction2();
        switch (err) {
            case EC_IO:
                System.out.println("An I/O exception occurred in ecFunction2.");
                break;
            case EC_INTERRUPTION:
                System.out.println("An interruption occurred in ecFunction2.");
                break;
        }
    }
}












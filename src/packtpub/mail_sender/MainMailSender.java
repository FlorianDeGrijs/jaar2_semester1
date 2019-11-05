package packtpub.mail_sender;

import java.util.Random;

public class MainMailSender {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("Sending email to %s...\n", args[0]);
        Thread.sleep(new Random().nextInt(1000));
        System.out.printf("Email sent to %s!\n", args[0]);
    }
}

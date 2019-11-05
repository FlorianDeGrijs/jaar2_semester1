package packtpub.mail_sender;

import packtpub.MainReadingCSV.CSVReader;
import packtpub.MainReadingCSV.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class MainAllMailSender {

    private static Process runningProcess = null;

    private static void sendEmailWhenReady(ArrayDeque<String> queue) throws Exception {
        if (runningProcess != null && runningProcess.isAlive()) {
            System.out.println(".");
            return;
        }

        System.out.print("\nSending email");
        String email = queue.poll();
        String classpath = System.getProperty("java.class.path");
        String[] command = new String[] {"java", "-cp", classpath, "MainMailSender", email};
        runningProcess = Runtime.getRuntime().exec(command);
    }

    public static void main(String[] args) throws Exception {
        ArrayDeque<String> queue = new ArrayDeque<>();
        String file = "resourses\\user.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));
        try (CSVReader reader = new CSVReader(br)) {
            String[] line = null;
            while ((line = reader.readRow()) != null) {
                User user = User.fromValues(line);
                queue.offer(user.email);
                sendEmailWhenReady(queue);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        while (!queue.isEmpty()) {
            sendEmailWhenReady(queue);
            Thread.sleep(100);
        }
    }
}

package packtpub.exceptions.finally_e;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainFinally {

    private static void useTheFile(String s) {
        System.out.println(s);
        throw new RuntimeException("oops");
    }

    public static void main(String[] args) throws IOException {
        String file = "resourses\\input.txt";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            System.out.println("Opened the file");
            useTheFile(br.readLine());
            br.close();
            System.out.println("Closed the file");
        } catch (IOException e) {
            System.out.println("caught an exception while reading the file");
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }
}

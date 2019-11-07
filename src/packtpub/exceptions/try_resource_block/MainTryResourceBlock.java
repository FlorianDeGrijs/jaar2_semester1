package packtpub.exceptions.try_resource_block;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainTryResourceBlock {

    private static void useTheFile(String file) {
        System.out.println(file);
        throw new RuntimeException("oops");
    }

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("resourse\\input.txt"))) {
            System.out.println("openend the file, which will be closed automatically");
            useTheFile(br.readLine());
        } catch (IOException e) {
            System.out.println("caught an I/O exception while reading the file");
            throw new Exception("something is wrong with I/O", e);
        } catch (Exception e) {
            System.out.println("caught an exception while reading the file");
        }
    }
}

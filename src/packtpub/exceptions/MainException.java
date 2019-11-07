package packtpub.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainException {
    public static void main(String[] args) {
        File file = new File("resourses\\input.txt");
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (fileInputStream != null) {


            int data = 0;
            while (data != -1) {
                try {
                    data = fileInputStream.read();
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(data);
            }
        }
    }
}

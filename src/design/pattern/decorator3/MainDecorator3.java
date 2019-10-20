package design.pattern.decorator3;

import java.io.*;

public class MainDecorator3 {
    public static void main(String[] args) throws IOException {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src\\design\\pattern\\decorator3\\test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

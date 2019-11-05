package packtpub.MainReadingCSV.activity;

import packtpub.MainReadingCSV.CSVReader;
import packtpub.MainReadingCSV.UsersLoader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public class MainActivity30 {

    public static void main(String[] args) throws IOException {
        String file = "resourses\\user2.txt";
        BufferedReader br = new BufferedReader(new FileReader(file)) ;

        Hashtable ht = UsersLoader.loadEducationWages(file);
        System.out.println(ht.size());


        /*
        for (Object object : ht.keySet()) {
            String key = (String) object;
            System.out.println(key);
            System.out.println(ht.get(key));
        }
        System.out.println("***************************************");
        int min = Integer.MAX_VALUE;
        int max = 0;
        int avg = 0;
        long total = 0;
        for (Object object : ht.keySet()) {
            String key = (String) object;
            Vector v = (Vector) ht.get(key);
            for (int i = 0; i < v.size(); i++) {
                String str = (String) v.get(i);
                int wage = Integer.parseInt(str.trim());
                total += wage;
                if (wage > max) {
                    max = wage;
                }
                if (wage < min) {
                    min = wage;
                }
            }
            avg = (int) (total / v.size());
            System.out.println(key + "--> MIN: " + min + ", MAX: " + max + ", AVG: " + avg);
        }
         */
    }

}

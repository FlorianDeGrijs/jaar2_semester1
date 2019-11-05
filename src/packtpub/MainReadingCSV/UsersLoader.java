package packtpub.MainReadingCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class UsersLoader {

    public static Set<User> loadUsersIntoTreeSet(String file, Comparator comparator) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        Set<User> tree = new TreeSet<>(comparator);
        try (CSVReader reader = new CSVReader(br)) {
            String[] line = null;
            while ((line = reader.readRow()) != null) {
                tree.add(User.fromValues(line));
            }
        }
        return tree;
    }

    public static Hashtable loadUsersInHashtable(String file) throws IOException {
        Hashtable ht = new Hashtable();
        BufferedReader br = new BufferedReader(new FileReader(file));
        CSVReader reader = new CSVReader(br);
        String[] line;
        while ((line = reader.readRow()) != null) {
            String email = line[2];
            ht.put(email, line);
        }
        return ht;
    }

    public static Vector loadUsersInVector(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        CSVReader reader = new CSVReader(br);
        Vector users = new Vector();
        String[] line = null;
        while ((line = reader.readRow()) != null) {
            users.add(User.fromValues(line));
        }
        return users;
    }

    public static Vector loadWagesInVector(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        CSVReader reader = new CSVReader(br, false);
        Vector wages = new Vector();
        String[] lines = null;
        while ((lines = reader.readRow()) != null) {
            if (lines.length == 15) {
                wages.add(Integer.parseInt(lines[2].trim()));
            }
        }
        reader.close();
        return wages;
    }

    public static Hashtable loadEducationWages(String file) throws IOException {
        Hashtable hashtable = new Hashtable();
        BufferedReader br = new BufferedReader(new FileReader(file));
        CSVReader reader = new CSVReader(br, false);
        String[] data;
        while ((data = reader.readRow()) != null) {
            if (data.length == 15) {
                String education = data[3];
                if (!hashtable.containsKey(education)) {
                    hashtable.put(education, new Vector<>());
                }
                ((Vector) hashtable.get(education)).add(data[2]);
            }
        }
        return hashtable;
    }
}
























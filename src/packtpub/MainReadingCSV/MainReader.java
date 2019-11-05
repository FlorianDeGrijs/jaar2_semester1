package packtpub.MainReadingCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class MainReader {

    private static String convertInputToFile(String input) {
        String file;
        if (input.length() == 0) {
            throw new IllegalArgumentException("Please enter a filename");
        }
        file = "resourses\\" + input + ".txt";
        return file;
    }

    public static void main(String[] args) throws IOException {
        String fileName = "resourses\\user.txt";
        String fileName2 = "resourses\\user2.txt";
        FileReader reader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(reader);

        Scanner input = new Scanner(System.in);
        System.out.println("What is your email?");
        String email = input.nextLine();
        Hashtable table = UsersLoader.loadUsersInHashtable(fileName);
        String[] userInfo = (String[]) table.get(email);
        System.out.println("ID: " + userInfo[0] + ", Name: " + userInfo[1]);

        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Type the name of the file you want us to read: ");
        String line = input.nextLine();
        String fileRead = convertInputToFile(line);
        FileReader reader = new FileReader(fileRead);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("\n********************");
        Vector v = UsersLoader.loadUsersInVector(fileRead);
        readUsers(v);

        Vector users1 = UsersLoader.loadWagesInVector(fileName2);
        System.out.println(users1.size());
        WageCalculator wc = new WageCalculator();
        System.out.println(wc.sum(users1));
        System.out.println(wc.min(users1));
        System.out.println(wc.max(users1));

        while (br.readLine() != null) {
            System.out.println(br.readLine());
        }

        CSVReader csvReader = new CSVReader(new BufferedReader(new FileReader(fileName)));
        System.out.println(Arrays.toString(csvReader.readRow()));
        System.out.println(csvReader.getLineCount());

        User[] users = loadUsers(fileName);
        System.out.println(users.length);

        Vector users = UsersLoader.loadUsersInVector(fileName);
        System.out.println(users.size());
         */

    }

    private static void readUsers(Vector v) {
        for (Object user : v) {
            User u = (User) user;
            System.out.println(u.name + " " + u.email);
        }
    }

    public static User[] loadUsers(String file) throws FileNotFoundException {
        User[] users = new User[0];
        BufferedReader br = new BufferedReader(new FileReader(file));
        try (CSVReader reader = new CSVReader(br)) {
            String[] data = null;
            while ((data = reader.readRow()) != null) {
                User[] newUsers = new User[users.length + 1];
                System.arraycopy(users, 0, newUsers, 0, users.length);
                users = newUsers;
                users[users.length - 1] = User.fromValues(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }
}

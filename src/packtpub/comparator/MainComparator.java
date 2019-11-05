package packtpub.comparator;

import packtpub.MainReadingCSV.User;
import packtpub.MainReadingCSV.UsersLoader;

import java.io.IOException;
import java.util.*;

public class MainComparator {
    public static void main(String[] args) throws IOException {
        String file = "resourses\\user.txt";
        Hashtable<String, String[]> users = UsersLoader.loadUsersInHashtable(file);
        Vector<User> uniqueUsers = new Vector<>();
        for (String key : users.keySet()) {
            String[] str = users.get(key);
            User newUser = User.fromValues(str);
            uniqueUsers.add(newUser);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("How would you like to sort? (id, name or email)");
        String answer = input.nextLine();

        Comparator<User> comparator = null;

        switch (answer) {
            case "id":
                comparator = new IDComparator();
                break;
            case "name":
                comparator = new NameComparator();
                break;
            case "email":
                comparator = new EmailComparator();
                break;
            default:
                System.out.println("Sorry, that command does not exist");
        }
        System.out.printf("Printing users sorted by %s: \n", answer);
        Collections.sort(uniqueUsers, comparator);
        for (User user : uniqueUsers) {
            System.out.println(user.name + ", " + user.email + ", " + user.id);
        }
        /*
        AlphabeticComparator a = new AlphabeticComparator();
        System.out.println(a.compare("A", "B") < 0);
        System.out.println(a.compare("B", "A") > 0);
        System.out.println(a.compare("b", "A") > 0);
        System.out.println(a.compare("A", "a") == 0);
         */
    }
}

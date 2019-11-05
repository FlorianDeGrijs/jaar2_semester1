package packtpub.treeset;

import packtpub.MainReadingCSV.User;
import packtpub.MainReadingCSV.UsersLoader;
import packtpub.comparator.EmailComparator;
import packtpub.comparator.IDComparator;
import packtpub.comparator.NameComparator;

import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) throws IOException {
        String file = "resourses\\user.txt";
        Scanner input = new Scanner(System.in);
        System.out.print("What would you like to sort by? (id,name,email): ");
        String answer = input.nextLine();
        Comparator comparator = null;
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
                System.out.println("Invalid answer.");
        }
        Set<User> users = UsersLoader.loadUsersIntoTreeSet(file, comparator);
        System.out.printf("Sorting by: %s\n", answer);
        for (User user : users) {
            System.out.println(user.id + ", " + user.name + ", " + user.email);
        }
    }
}

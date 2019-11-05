package packtpub.comparator;

import packtpub.MainReadingCSV.User;

import java.util.Comparator;

public class EmailComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        String email1 = user1.email.toLowerCase().trim();
        String email2 = user2.email.toLowerCase().trim();
        return email1.compareTo(email2);
    }
}

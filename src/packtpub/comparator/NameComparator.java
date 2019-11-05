package packtpub.comparator;

import packtpub.MainReadingCSV.User;

import java.util.Comparator;

public class NameComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        String name1 = user1.name.toLowerCase().trim();
        String name2 = user2.name.toLowerCase().trim();
        return name1.compareTo(name2);
    }
}

package packtpub.comparator;

import packtpub.MainReadingCSV.User;

import java.util.Comparator;

public class IDComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        int id1 = user1.id;
        int id2 = user2.id;
        if (id1 > id2) {
            return 1;
        } else if (id1 < id2) {
            return -1;
        } else {
            return 0;
        }
    }
}

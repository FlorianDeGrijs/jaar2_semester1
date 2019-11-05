package packtpub.comparator;

import java.util.Comparator;

public class AlphabeticComparator implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        return s.toLowerCase().compareTo(t1.toLowerCase());
    }
}

package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class MainHackerRank {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "James");
        map.put(2, "Peter");
        map.put(3, "Richard");
        map.put(4, "Emily");
        map.put(5, "Flo");

        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

    }
}

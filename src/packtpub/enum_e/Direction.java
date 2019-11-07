package packtpub.enum_e;

public enum Direction {
    EAST(45), WEST(90), NORTH(180), SOUTH(360);
    int no;

    Direction(int i) {
        no = i;
    }
}

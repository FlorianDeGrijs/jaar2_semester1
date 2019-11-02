package design.pattern.template3;

public class Number implements Comparable{
    private int num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Object o) {
        Number otherNumber = (Number) o;

        if (otherNumber.num < this.num) {
            return 1;
        } else if (otherNumber.num > this.num) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return num + " ";
    }
}

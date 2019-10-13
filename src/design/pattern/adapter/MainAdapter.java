package design.pattern.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        SpeedUnit speedUnit = new Adapter(new Mile());
        speedUnit.speed(7);
        SpeedUnit speedUnit1 = new Kilometer();
        speedUnit1.speed(7);
    }
}

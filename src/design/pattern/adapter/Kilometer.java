package design.pattern.adapter;

public class Kilometer implements SpeedUnit {
    @Override
    public void speed(int speed) {
        System.out.println("KM: " + speed);
    }
}

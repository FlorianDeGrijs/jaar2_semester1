package design.pattern.adapter;

public class Adapter implements SpeedUnit {

    private Mile miles;

    public Adapter(Mile miles) {
        this.miles = miles;
    }

    @Override
    public void speed(int speed) {
        miles.speed(speed);
    }
}

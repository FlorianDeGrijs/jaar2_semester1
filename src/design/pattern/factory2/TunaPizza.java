package design.pattern.factory2;

public class TunaPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Putting Tuna on PIZZA");
    }
}

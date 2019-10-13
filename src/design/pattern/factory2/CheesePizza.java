package design.pattern.factory2;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("PUTTING CHEESE ON PIZZA");
    }
}

package design.pattern.factory2;

public class SalamiPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("PUTTING SALAMI ON ZHE PIZZA");
    }
}

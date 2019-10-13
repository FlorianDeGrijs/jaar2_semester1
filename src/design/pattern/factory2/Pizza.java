package design.pattern.factory2;

public abstract class Pizza {

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking PIZZA");
    }

    public void cut() {
        System.out.println("CUTTING PIZZA");
    }

    public void box() {
        System.out.println("BOXING PIZZA");
    }
}

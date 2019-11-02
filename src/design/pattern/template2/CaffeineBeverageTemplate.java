package design.pattern.template2;

public abstract class CaffeineBeverageTemplate {

    public CaffeineBeverageTemplate() {
    }

    public final void makeDrink() {
        boil();
        brew();
        pour();
        if (customerWantsCondiments()) {
            add();
        }
    }

    public boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void add();

    protected abstract void pour();

    protected abstract void brew();

    private void boil() {
        System.out.println("Boiling water");
    }
}

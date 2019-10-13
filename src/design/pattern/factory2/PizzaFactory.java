package design.pattern.factory2;

public class PizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "Salami":
                pizza = new SalamiPizza();
                break;
            case "Cheese":
                pizza = new CheesePizza();
                break;
            case "Tuna":
                pizza = new TunaPizza();
                break;
        }
        return pizza;
    }
}

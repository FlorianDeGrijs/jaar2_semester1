package design.pattern.decorator2;

public class MainDecorator2 {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
    }
}

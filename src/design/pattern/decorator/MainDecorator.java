package design.pattern.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
        Shape blueCircle = new BlueShapeDecorator(new Circle());
        blueCircle.draw();
    }
}

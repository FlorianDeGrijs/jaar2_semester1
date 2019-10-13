package design.pattern.decorator;

public class BlueShapeDecorator extends ShapeDecorator {
    public BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorderColor(decoratedShape);
    }

    private void setBorderColor(Shape decoratedShape) {
        System.out.println("Border Color: Blue");
    }
}

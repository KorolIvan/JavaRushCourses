package Java_Collections.level_7.lesson_8.task_3.decorators;

import Java_Collections.level_7.lesson_8.task_3.shapes.Shape;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class RedShapeDecorator extends ShapeDecorator {
    private Shape decoratedShape;

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
        this.decoratedShape = decoratedShape;
    }

    private void setBorderColor(Shape shapeDecorator) {
        System.out.println(String.format("Setting border color for %s to red.", shapeDecorator.getClass().getSimpleName()));
    }

    @Override
    public void draw() {
        setBorderColor(decoratedShape);
        super.draw();
    }
}

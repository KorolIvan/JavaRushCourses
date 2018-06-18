package Java_Collections.level_7.lesson_8.task_3.decorators;

import Java_Collections.level_7.lesson_8.task_3.shapes.Shape;

/**
 * @author Ivan Korol on 6/18/2018
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}

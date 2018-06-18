package Java_Collections.level_7.lesson_8.task_3;

import Java_Collections.level_7.lesson_8.task_3.decorators.RedShapeDecorator;
import Java_Collections.level_7.lesson_8.task_3.shapes.Circle;
import Java_Collections.level_7.lesson_8.task_3.shapes.Rectangle;
import Java_Collections.level_7.lesson_8.task_3.shapes.Shape;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class Solution {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Simple circle");
        circle.draw();

        System.out.println("\nApplied RedShapeDecorator to the circle");
        redCircle.draw();

        System.out.println("\nApplied RedShapeDecorator to the rectangle");
        redRectangle.draw();
    }
}

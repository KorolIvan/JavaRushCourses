package Java_Collections.level_8.lesson_10.task_2;

/**
 * @author Ivan Korol on 6/21/2018
 */
public @interface Author {
    String value();

    Position position() default Position.OTHER;
}

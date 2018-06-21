package Java_Collections.level_8.lesson_10.task_2;

/**
 * @author Ivan Korol on 6/21/2018
 */
public @interface Revision {
    int revision();
    Date date();
    Author[] authors() default {};
    String comment() default "";
}

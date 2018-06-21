package Java_Collections.level_8.lesson_10.task_3;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Ivan Korol on 6/21/2018
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Ticket {
   Priority priority() default Priority.MEDIUM;

    String createdBy() default "Amigo";

    String[] tags() default {};

    enum Priority {LOW, MEDIUM, HIGH}
}

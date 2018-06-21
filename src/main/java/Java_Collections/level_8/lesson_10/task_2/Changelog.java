package Java_Collections.level_8.lesson_10.task_2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Ivan Korol on 6/21/2018
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Changelog {
    Revision[] value() default {};
}

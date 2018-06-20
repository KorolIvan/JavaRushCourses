package Java_Collections.level_7.lesson_15.bigparser.query;

import java.util.Set;

/**
 * @author Ivan Korol on 6/20/2018
 */
public interface QLQuery {
    Set<Object> execute(String query);
}

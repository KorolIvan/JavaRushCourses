package Java_Collections.level_5.lesson_10.task_1;

import java.util.List;

/**
 * @author Ivan Korol on 6/14/2018
 */
public abstract class Solution {
    public abstract <T> void one(List<T> destination, List<T> source);

    public abstract <T> void two(List<T> destination, List<? extends T> source);

    public abstract <T> void three(List<? super T> destination, List<T> source);

    public abstract <T> void four(List<? super T> destination, List<? extends T> source);
}

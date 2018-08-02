package java_multithreading.level_6.lesson_2.task_3;

import java.util.Comparator;

/**
 * @author Ivan Korol on 8/2/2018
 */
public class Solution {
    public static void main(String[] args) {

    }

    public static class CustomizedComparator<T> implements Comparator<T> {
        private Comparator<T> [] comparators;

        public CustomizedComparator(Comparator<T>... comparators) {
            this.comparators = comparators;
        }

        @Override
        public int compare(T o1, T o2) {
            int result = 0;
            for (Comparator comparator : comparators) {
                result = comparator.compare(o1, o2);
                if (result != 0) {
                    break;
                }
            }
            return result;
        }
    }
}

package java_multithreading.level_9.lesson_9.task_6;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class Square implements Computable<Integer, Integer> {
    @Override
    public Integer compute(Integer integer) throws InterruptedException {
        int val = integer.intValue();
        return val * val;
    }
}

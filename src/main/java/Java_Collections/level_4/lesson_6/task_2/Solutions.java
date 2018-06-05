package Java_Collections.level_4.lesson_6.task_2;


/**
 * @author Ivan Korol on 6/5/2018
 */
public class Solutions {
    public static void main(String[] args) {
        SoftCache cache = new SoftCache();

        for (long i = 0; i < 20; i++) {
            cache.put(i, new AnyObject(i, null, null));
        }
    }
}

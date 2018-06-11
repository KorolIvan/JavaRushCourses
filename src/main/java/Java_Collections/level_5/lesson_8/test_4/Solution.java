package Java_Collections.level_5.lesson_8.test_4;

/**
 * @author Ivan Korol on 6/11/2018
 */
public class Solution {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Generator<Event> eventGenerator = new Generator<>(Event.class);

        System.out.println(eventGenerator.newInstance().getId());
        System.out.println(eventGenerator.newInstance().getId());
        System.out.println(eventGenerator.newInstance().getId());
    }
}

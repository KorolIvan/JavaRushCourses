package java_core.level_13.lesson_11.Task_12;

import level_13.lesson_11.Task_12.Person;
import level_13.lesson_11.Task_12.RepkaStory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}

package java_multithreading.level_5.lesson_16.refactoring.human;

/**
 * @author Ivan Korol on 7/31/2018
 */
public class Soldier extends Human {

    public Soldier(String name, int age) {
        super(name, age);
    }

    public void live() {
        fight();
    }

    public void fight() {
    }
}

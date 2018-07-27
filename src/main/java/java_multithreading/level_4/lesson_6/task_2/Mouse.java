package java_multithreading.level_4.lesson_6.task_2;

/**
 * @author Ivan Korol on 7/27/2018
 */
/*
обратите внимание, как именно Mouse отличается от Dog
Этот класс - привычный для вас.
*/
public class Mouse implements Pet, Sayable {
    @Override
    public Sayable toSayable(int i) {
        return this;
    }

    @Override
    public String say() {
        return "Мышь пищит.";
    }
}

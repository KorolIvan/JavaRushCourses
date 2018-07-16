package Java_Collections.level_9.lesson_9.task_10;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class LightBulb implements Switchable{
    private boolean on = false;

    public boolean isOn() {
        return on;
    }

    public void turnOff() {
        System.out.println("The light is shining!");
        on = false;
    }

    public void turnOn() {
        System.out.println("The light has been turned off!");
        on = true;
    }
}

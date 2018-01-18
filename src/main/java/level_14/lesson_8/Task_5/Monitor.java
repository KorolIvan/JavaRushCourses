package level_14.lesson_8.Task_5;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Monitor implements CompItem{
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}

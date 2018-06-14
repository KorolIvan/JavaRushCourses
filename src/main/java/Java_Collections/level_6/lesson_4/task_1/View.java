package Java_Collections.level_6.lesson_4.task_1;

/**
 * @author Ivan Korol on 6/14/2018
 */
public class View {
    private static Controller controller = new Controller();
    public void fireEventShowData() {
        System.out.println(controller.onDataListShow());
    }
}

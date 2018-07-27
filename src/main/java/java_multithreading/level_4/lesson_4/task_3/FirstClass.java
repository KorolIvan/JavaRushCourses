package java_multithreading.level_4.lesson_4.task_3;

/**
 * @author Ivan Korol on 7/27/2018
 */
public abstract class FirstClass implements Action {     //first implementation

    protected FirstClass() {
        Solution.countActionObjects++;
    }

    public void someAction() {
        System.out.println("class FirstClass, method someAction");
    }

    public abstract Action getDependantAction();
}

package java_multithreading.level_4.lesson_9.task_1;

/**
 * @author Ivan Korol on 7/27/2018
 */
public class C implements JustAnInterface{
    public C() {
        System.out.print("C");
        B localB = B;
    }
}

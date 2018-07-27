package java_multithreading.level_4.lesson_9.task_1;

/**
 * @author Ivan Korol on 7/27/2018
 */
public interface JustAnInterface {
    public static final B B = new B();

    class B extends C{
        public B() {
            System.out.print("B");
        }
    }
}

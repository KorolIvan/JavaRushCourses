package level_12.lesson_12;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_7 {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Worker implements Businessman {


    }

    public static class Worker {
        public void workHard(){

        }
    }
}

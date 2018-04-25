package java_core.level_12.lesson_12;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_6 {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazy();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human implements Businessman, Secretary, Worker{

        public void workHard() {
        }

        public void workLazy() {
        }
    }
}

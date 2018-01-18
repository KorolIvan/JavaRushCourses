package level_14.lesson_8.Task_3;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public interface Person {
    class User implements Person {
        void live() {
            System.out.println("Usually I just live.");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("Usually I do nothing.");
        }
    }

    class Coder implements Person {
        void coding() {
            System.out.println("Usually I create code.");
        }
    }

    class Proger implements Person {
        void enjoy() {
            System.out.println("Wonderful life!");
        }
    }
}

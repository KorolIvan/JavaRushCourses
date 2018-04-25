package java_core.level_14.lesson_8.Task_3;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public interface Person {
    class User implements level_14.lesson_8.Task_3.Person {
        void live() {
            System.out.println("Usually I just live.");
        }
    }

    class Loser implements level_14.lesson_8.Task_3.Person {
        void doNothing() {
            System.out.println("Usually I do nothing.");
        }
    }

    class Coder implements level_14.lesson_8.Task_3.Person {
        void coding() {
            System.out.println("Usually I create code.");
        }
    }

    class Proger implements level_14.lesson_8.Task_3.Person {
        void enjoy() {
            System.out.println("Wonderful life!");
        }
    }
}

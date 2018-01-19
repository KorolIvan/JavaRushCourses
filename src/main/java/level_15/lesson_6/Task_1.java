package level_15.lesson_6;

import java.io.Serializable;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_1 {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("What do you think about level15.lesson06.task01?"));
        System.out.println(me.askZapp("When will be the next update?"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("I'll be thinking of [%s]", question);
        }
    }

    public static class JuniorJavaDev extends JavaDev {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}

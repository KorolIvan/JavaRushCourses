package level_13.lesson_2;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_1 {
    public static void main(String[] args) throws Exception {
    }

    public interface Drink {
        void askMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcohol extends Drink {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class Beer implements Alcohol{

        @Override
        public void askMore(String message) {

        }

        @Override
        public void sayThankYou() {

        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor() {

        }
    }
}

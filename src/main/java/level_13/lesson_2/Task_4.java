package level_13.lesson_2;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_4 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable{

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}

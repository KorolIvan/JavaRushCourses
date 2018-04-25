package java_core.level_13.lesson_11;

public class Task_1 {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        String NAME = "Submit";

        String onPress(Object o);

    }
}

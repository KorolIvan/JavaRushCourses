package java_core.level_13.lesson_2;

public class Task_7 {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<String> {
        SimpleObject<String> getInstance();
    }

    class StringObject implements SimpleObject //допишите здесь ваш код
    {
        @Override
        public SimpleObject getInstance() {
            return null;
        }
    }
}

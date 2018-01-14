package level_13.lesson_11;

public class Task_7 {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public static class StringObject<T> implements SimpleObject{

        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}

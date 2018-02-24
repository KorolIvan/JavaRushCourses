package level_17.lesson_4.task_5;

public class IMF {
    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        synchronized (IMF.class) {
            if (imf == null) {
                imf = new IMF();
            }

        }
        return imf;
    }

    private IMF() {
    }
}

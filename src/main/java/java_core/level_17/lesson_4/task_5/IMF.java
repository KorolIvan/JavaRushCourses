package java_core.level_17.lesson_4.task_5;

public class IMF {
    private static level_17.lesson_4.task_5.IMF imf;

    public static level_17.lesson_4.task_5.IMF getFund() {
        //add your code here - добавь код тут
        synchronized (level_17.lesson_4.task_5.IMF.class) {
            if (imf == null) {
                imf = new level_17.lesson_4.task_5.IMF();
            }

        }
        return imf;
    }

    private IMF() {
    }
}

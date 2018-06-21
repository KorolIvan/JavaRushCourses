package Java_Collections.level_8.lesson_6.task_2;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class ExceptionFactory {
    public static Throwable creatException(Enum argument) throws Exception {
        if(argument != null) {
            String message = argument.toString();
            message = message.substring(0, 1) + message.substring(1).replaceAll("_", " ").toLowerCase();
            if( argument instanceof ExceptionApplicationMessage) {
                return new Exception(message);
            } else if (argument instanceof ExceptionDBMessage) {
                return new RuntimeException(message);
            } else if (argument instanceof ExceptionUserMessage) {
                return new Error(message);
            }
        }
        return new IllegalArgumentException();
    }
}

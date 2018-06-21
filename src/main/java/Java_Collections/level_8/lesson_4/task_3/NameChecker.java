package Java_Collections.level_8.lesson_4.task_3;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class NameChecker {
    private static final int MAX_NUMBER_OF_CHARACTERS = 100500;
    public static int getNumberOfCharacters(String name) throws Exception {
        if (name == null)
            throw new NameIsNullException();
        else if (name.isEmpty())
            throw new NameIsEmptyException();

        int length = name.length();
        if (length > MAX_NUMBER_OF_CHARACTERS)
            throw new Exception("Слишком длинное имя");
        return length;
    }
}

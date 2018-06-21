package Java_Collections.level_8.lesson_4.task_3;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class Solution {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                System.out.println("Имя содержит " + NameChecker.getNumberOfCharacters(args[0]) + " символов");
            } catch (NameIsNullException e) {
                System.out.println("Ошибка: Имя не задано");
            } catch (NameIsEmptyException e) {
                System.out.println("Ошибка: Имя пустое");
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}

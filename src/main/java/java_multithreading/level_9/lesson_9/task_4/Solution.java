package java_multithreading.level_9.lesson_9.task_4;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class Solution {
    public static void main(String[] args) {
        Game game = new Game();
        printDelimiter();
        game.startCompetition();
        System.out.println("\n\nВСЕ РЕЗУЛЬТАТЫ:");
        game.printAllResults();
        printDelimiter();
        System.out.println("\n\nСПОРТСМЕНЫ С ТАКИМ ЖЕ ИТОГОВЫМ ВРЕМЕНЕМ, КАК У КОНТРОЛЬНОГО СПОРТСМЕНА:");
        game.printSportsmanWithEqualTime();
        printDelimiter();
    }

    private static void printDelimiter() {
        System.out.println("=================================================================================================");
    }
}

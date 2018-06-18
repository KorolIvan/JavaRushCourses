package Java_Collections.level_7.lesson_8.task_2.security;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class SecurityCheckerImpl implements SecurityChecker {
    @Override
    public boolean performSecurityCheck() {
        System.out.println("SECURITY OK!");
        return true;
    }
}

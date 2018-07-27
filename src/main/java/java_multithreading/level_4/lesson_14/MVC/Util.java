package java_multithreading.level_4.lesson_14.MVC;

import java_multithreading.level_4.lesson_14.MVC.bean.User;

/**
 * @author Ivan Korol on 7/27/2018
 */
public final class Util {
    public static final String DELETED_MARKER = " (deleted)";

    public static boolean isUserDeleted(User user) {
        return user.getName().endsWith(DELETED_MARKER);
    }

    public static void markDeleted(User user) {
        if (User.NULL_USER != user && !Util.isUserDeleted(user)) {
            user.setName(user.getName() + DELETED_MARKER);
        }
    }
}

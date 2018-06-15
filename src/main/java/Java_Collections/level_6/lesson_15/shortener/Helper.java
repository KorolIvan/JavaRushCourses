package Java_Collections.level_6.lesson_15.shortener;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * @author Ivan Korol on 6/15/2018
 */
public class Helper {

    public static String generateRandomString() {
        return new BigInteger(130, new SecureRandom()).toString(36);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}

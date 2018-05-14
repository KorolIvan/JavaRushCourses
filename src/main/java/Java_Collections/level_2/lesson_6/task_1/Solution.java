package Java_Collections.level_2.lesson_6.task_1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author Ivan Korol on 5/14/2018
 */
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        String laters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "1234567890";
        StringBuffer passw = new StringBuffer();
        for(int i = 0; i < 4; i++) {
            passw.append(laters.charAt((int)(Math.random()*laters.length())));
        }
        for(int i = 0; i < 2; i++) {
            passw.append(digits.charAt((int)(Math.random()*digits.length())));
        }
        for(int i = 0; i < 2; i++) {
            passw.append(laters.toUpperCase().charAt((int)(Math.random()*laters.length())));
        }
        try {
            outputStream.write(passw.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return outputStream;
    }
}

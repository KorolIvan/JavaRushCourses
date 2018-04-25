package java_core.level_15.lesson_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_2 {
    public static int A;
    public static int B;



    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}

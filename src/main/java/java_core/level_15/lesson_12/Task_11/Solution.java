package java_core.level_15.lesson_12.Task_11;

import level_15.lesson_12.Task_11.Flyable;
import level_15.lesson_12.Task_11.Helicopter;
import level_15.lesson_12.Task_11.Plane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
        //add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = reader.readLine();
            reader.close();
            if (s.equals("helicopter")){
                result = new Helicopter();
            }else if (s.equals("plane")){
                result = new Plane(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        //add your code here - добавьте код тут
    }
}

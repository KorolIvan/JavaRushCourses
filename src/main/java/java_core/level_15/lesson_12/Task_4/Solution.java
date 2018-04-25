package java_core.level_15.lesson_12.Task_4;

import level_15.lesson_12.Task_4.Earth;
import level_15.lesson_12.Task_4.Moon;
import level_15.lesson_12.Task_4.Planet;
import level_15.lesson_12.Task_4.Sun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (s) {
            case "sun" :
                thePlanet = Sun.getInstance();
                break;
            case "moon" :
                thePlanet = Moon.getInstance();
                break;
            case "earth" :
                thePlanet = Earth.getInstance();
                break;
            default:
                thePlanet = null;
                break;
        }
        // implement step #5 here - реализуйте задание №5 тут
    }
}

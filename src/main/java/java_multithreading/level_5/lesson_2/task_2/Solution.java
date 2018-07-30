package java_multithreading.level_5.lesson_2.task_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 7/30/2018
 */
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            //init wheels here
            wheels = new ArrayList<>();
            int wheelCount = 0;
            for (String wheel : loadWheelNamesFromDB()) {
                wheels.add(Wheel.valueOf(wheel));
                wheelCount += 1;
            }
            if (wheelCount != 4)
                throw new Exception();
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}

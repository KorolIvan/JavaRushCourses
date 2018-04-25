package java_core.level_13.lesson_11.Task_2;

import level_13.lesson_11.Task_2.Weather;
import level_13.lesson_11.Task_2.WeatherType;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FROZEN));
    }

    static class Today implements Weather{
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("%s for today", this.getWeatherType());
        }

        @Override
        public String getWeatherType() {
            return type;
        }
    }
}

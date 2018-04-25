package java_core.level_13.lesson_4;

import java.awt.*;

public class Task_3 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal{
        public String getName() {
            return "Fox";
        }
    }
}

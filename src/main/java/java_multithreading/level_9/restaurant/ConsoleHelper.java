package java_multithreading.level_9.restaurant;

import java_multithreading.level_9.restaurant.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return bufferedReader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> listDish = new ArrayList<>();
        String str = "";
        writeMessage("Выберите блюдо:\n" + Dish.allDishesToString());
        while (true) {
            str = readString();
            if (str.equalsIgnoreCase("exit")) {
                break;
            }
            else {
                try {
                    listDish.add(Dish.valueOf(str));
                }
                catch (IllegalArgumentException e) {
                    writeMessage(str + " is not detected");
                }
            }
        }
        return listDish;
    }
}

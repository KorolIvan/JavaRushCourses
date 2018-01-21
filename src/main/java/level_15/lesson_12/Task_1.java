package level_15.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        int forInt = 0;
        //short forShort = 0;
        double forDouble = 0.0;

        //forShort = Short.parseShort(s);
        while (true) {
            s = reader.readLine();
            forInt = Integer.parseInt(s);
            if (s.equals("exit"))
                break;

            if(s.contains(".")){
                forDouble = Double.parseDouble(s);
                print(forDouble);
            }else if(forInt > 0 && forInt <128){
                print(forInt);
            }else if(forInt <= 0 && forInt >= 128){
                print(forInt);
            }else {
                print(s);
            }
        }
        //напиште тут ваш код
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

package level_9.lesson_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true){
                list.add(Integer.parseInt(reader.readLine()));
            }

        }catch (IOException | NumberFormatException e){

            for (int i:
                 list) {
                System.out.print(i + " ");
                
            }
        }
        //напишите тут ваш код
    }
}

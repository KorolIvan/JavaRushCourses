package level_13.lesson_11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Task_11 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream inputStream = new FileInputStream(reader.readLine());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            ArrayList<Integer> numbers = new ArrayList<>();

            while (bufferedReader.ready()) {
                try {
                    int i = Integer.parseInt(bufferedReader.readLine());
                    if (i % 2 == 0){
                        //System.out.println(i);
                        numbers.add(i);
                    }

                }catch (NumberFormatException e){

                }
            }
            Collections.sort(numbers);
            reader.close();
            bufferedReader.close();

            for (Integer s : numbers){
                System.out.println(s);
            }

        }catch (IOException e){

        }
    }
}

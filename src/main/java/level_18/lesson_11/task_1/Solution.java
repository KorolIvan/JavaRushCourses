package level_18.lesson_11.task_1;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        int numbersOfLetters = 0;
        while (reader.ready()){
            int i = reader.read();
            if ((i >= 97 && i <= 122)||(i >= 65 && i <= 90)){
                numbersOfLetters++;
            }
        }
        reader.close();
        System.out.println(numbersOfLetters);
    }
}

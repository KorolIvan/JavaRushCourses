package level_19.lesson_5.task_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ivan Korol on 4/23/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);
        StringBuilder builder = new StringBuilder();
        while(fileReader.ready()) {
            builder.append((char) fileReader.read());
        }
        fileReader.close();
        String text = builder.toString();
        System.out.println(text);
        String[] expWord = text.split("\\W");
        int coutn = 0;
        for(int i = 0; i < expWord.length; i++) {
            if(expWord[i].equalsIgnoreCase("world")){
                coutn++;
            }
        }
        System.out.println(coutn);
    }
}

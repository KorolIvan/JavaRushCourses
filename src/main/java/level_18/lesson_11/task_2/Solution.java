package level_18.lesson_11.task_2;

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int symbol = 0;
        int space = 0;
        if (inputStream.available() > 0){
            symbol = inputStream.available();
            while (inputStream.available()>0) {
                if (inputStream.read() == ' ') {
                    space++;
                }
            }
        }
        inputStream.close();
        System.out.println(String.format("%.2f",(float) space/symbol*100));
    }
}

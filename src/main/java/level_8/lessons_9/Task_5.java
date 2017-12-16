package level_8.lessons_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_5 {
    @Deprecated
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] arr = s.trim().split("\\s++");
        char[] c;
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : arr) {
            c = str.toCharArray();
            c[0] = Character.toUpperCase(c[0]);
            stringBuilder.append(c);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString().trim());

        //напишите тут ваш код
    }
}

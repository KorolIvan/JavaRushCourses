package level_18.lesson_11.task_3;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileOutputStream outputStream = new FileOutputStream(file1);
        FileInputStream inputStream1 = new FileInputStream(file2);
        FileInputStream inputStream2 = new FileInputStream(file3);

        while (inputStream1.available() > 0) {
            outputStream.write(inputStream1.read());
        }
        inputStream1.close();
        while (inputStream2.available() > 0) {
            outputStream.write(inputStream2.read());
        }
        inputStream2.close();
        outputStream.close();
    }
}

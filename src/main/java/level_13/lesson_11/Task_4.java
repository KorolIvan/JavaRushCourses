package level_13.lesson_11;

import java.io.*;

public class Task_4 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        while (true) {
            String data = reader.readLine();
            if (data.equals("exit")){
                writer.write(data);
                break;

            }
            writer.write(data);
            writer.newLine();
        }
        writer.close();
    }
}

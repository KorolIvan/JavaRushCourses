package java_core.level_18.lesson_11.task_5;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file_1 = reader.readLine();
        String file_2 = reader.readLine();
//        String file_1 = "text.txt";
//        String file_2 = "text2.txt";
        BufferedReader reader1 = new BufferedReader(new FileReader(new File(file_1)));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(file_2)));
//        FileInputStream inputStream = new FileInputStream(file_1);
//        FileOutputStream outputStream = new FileOutputStream(file_2);
        String line;
        String[] num;
        while((line = reader1.readLine()) != null){
            //System.out.print(line+" ");
            num = line.split(" ");
            for(String numbers: num) {
                int i = (int)Math.round(Double.parseDouble(numbers));
                System.out.println(i);
                writer.write(i + " ");

            }
        }
        reader.close();
        reader1.close();
        writer.close();
    }
}

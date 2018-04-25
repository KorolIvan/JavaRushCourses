package java_core.level_18.lesson_11.task_7;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(reader.readLine())));
        while (bufferedReader.ready()) {
            String[] id = bufferedReader.readLine().split(" ");
            for (int i = 0; i < id.length; i++){
                if (id[i].equals(args[0])){
                    System.out.print(id[i] + " ");
                    for (int j = i+1; j < id.length; j++) {
                        try{
                            double d = Double.parseDouble(id[j]);
                            System.out.print(id[j] + " " + id[j+1]);
                            break;
                        } catch (Exception e){
                            System.out.print(id[j]+" ");
                        }
                    }
                }

            }
        }
        reader.close();
        bufferedReader.close();
    }
}

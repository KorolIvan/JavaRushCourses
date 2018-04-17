package level_18.temp.task_9;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        while(true) {
            String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
            try {
                FileInputStream inputStream = new FileInputStream(fileName);
                inputStream.close();
            }catch (FileNotFoundException f) {
                System.out.println(fileName);
                break;
            }
        }
    }
}

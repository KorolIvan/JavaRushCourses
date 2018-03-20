package level_18.lesson_5;

import java.io.*;

public class Task_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream=new FileInputStream(reader.readLine());
        FileOutputStream outputStream=new FileOutputStream(reader.readLine());

        int a=inputStream.available();
        byte[] buffer=new byte[(a+1)/2];
        int count=inputStream.read(buffer);

        outputStream.write(buffer,0,count);
        outputStream.close();
        outputStream=new FileOutputStream(reader.readLine());
        buffer=new byte[a/2];
        count=inputStream.read(buffer);
        outputStream.write(buffer,0,count);

        inputStream.close();
        outputStream.close();
    }
}

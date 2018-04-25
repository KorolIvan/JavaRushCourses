package java_core.level_15.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_9 {
    public static void main(String[] args) throws IOException{
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String s = reader.readLine();
        URL url = new URL(reader.readLine());
        //System.out.println(url.getQuery());
        //String val = url.getQuery().replace("&", " ");
        String val = url.getQuery();
        String[] parts = val.split("&");
        String[] result = new String[parts.length];


        for (int i = 0; i < parts.length; i++) {

            if (parts[i].contains("obj")) {
                result[i] = parts[i].substring(0, parts[i].indexOf("="));
                System.out.print(result[i] + " ");
            } else if (parts[i].contains("=")) {
                result[i] = parts[i].substring(0, parts[i].indexOf("="));
                System.out.print(result[i] + " ");

            } else {result[i] = parts[i];
                System.out.print(result[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].contains("obj")) {
                String objResult;
                objResult = parts[i].substring(parts[i].indexOf("=") + 1);

                try {
                    alert(Double.parseDouble(objResult));
                } catch (Exception e) {
                    alert(objResult);
                }
            }
        }
        //reader.close();


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}

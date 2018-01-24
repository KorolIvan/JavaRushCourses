package level_15.lesson_12;

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
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String s = reader.readLine();
        URL url = new URL("http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo");
        System.out.println(url.getQuery());
        String val = url.getQuery().replace("&", " ");
        System.out.println(val);
       String[] s = val.split("= |");
        for (String sr:
             s) {
            System.out.println(sr);
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

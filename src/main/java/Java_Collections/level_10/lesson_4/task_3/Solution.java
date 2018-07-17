package Java_Collections.level_10.lesson_4.task_3;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Ivan Korol on 7/17/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        decodeURLString("hts://www.amrood.com/index.htm?language=en#j2se");
    }

    public static void decodeURLString(String s) throws MalformedURLException {
        try {
            URL url = new URL(s);
            System.out.println(url.getProtocol());
            System.out.println(url.getAuthority());
            System.out.println(url.getFile());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
            System.out.println(url.getPort());
            System.out.println(url.getDefaultPort());
            System.out.println(url.getQuery());
            System.out.println(url.getRef());
        } catch ( MalformedURLException e){
            //System.out.printf("Parameter %s is not a valid URL.", s);
            System.out.println(String.format("Parameter %s is not a valid URL", s));
            //throw new MalformedURLException();
        }

    }
}

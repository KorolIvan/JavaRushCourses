package java_core.level_14.lesson_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_12 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int nod = 0;
        for(int i = 1; i<=Math.min(a, b); i++){
            if(a % i == 0 && b % i == 0) {
                nod = i;
            }
        }
        if (a <= 0 || b <= 0) {
            throw new Exception();
        }
        System.out.println(nod);
    }
}

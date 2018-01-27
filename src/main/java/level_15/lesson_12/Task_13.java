package level_15.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Task_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }


    public static String factorial(int n) {
        //add your code here
        int result = 1;
        int temp = 1;
       if (n < 0)  {
           return "0";
       }
       else if (n == 0) {
           return "1";
       }
       else if (n > 0){
        //BigInteger ret = BigInteger.ONE;
        BigDecimal ret = BigDecimal.ONE;
        for (int i = 1; i <= n; ++i) ret = ret.multiply(BigDecimal.valueOf(i));
        return String.valueOf(ret);
       }

        return "";
    }
}

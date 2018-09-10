package java_multithreading.level_10.lesson_2.task_3;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Ivan Korol on 9/10/2018
 */
public class Solution {
    public static void main(String[] args) {
        try {
            BigDecimal num;
            boolean flag = false;
            for (int i = 2; i < 37; i++) {
                try {
                    num = new BigDecimal(new BigInteger(args[0], i));
                    flag = true;
                    if(flag){
                        System.out.println(i);
                        break;
                    }
                } catch (Exception e) {

                }
            }
            if (!flag) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("incorrect");
        }
    }
}

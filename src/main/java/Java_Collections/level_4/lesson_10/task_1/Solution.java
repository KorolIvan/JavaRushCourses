package Java_Collections.level_4.lesson_10.task_1;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ivan Korol on 6/8/2018
 */
public class Solution {
    private static final Logger logger = LoggerFactory.getLogger(Solution.class);

    private int value1;
    private String value2;
    private Date value3;

    public Solution(int value1, String value2, Date value3) {
        logger.debug("Constructor 1:"+this.value1+" 2: "+this.value2+" 3: "+this.value3);
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public static void main(String[] args) {

    }

    public void calculateAndSetValue3(long value) {
        logger.trace("start calculateAndSetValue3");
        value -= 133;
        if (value > Integer.MAX_VALUE) {
            value1 = (int) (value / Integer.MAX_VALUE);
            logger.debug("New value1:"+value1);
        } else {
            value1 = (int) value;
            logger.debug("New value1:"+value1);
        }
    }

    public void printString() {
        logger.trace ("Start printString");
        if (value2 != null) {
            System.out.println(value2.length());
        }
    }

    public void printDateAsLong() {
        logger.trace ("Start printDateAsLong");
        if (value3 != null) {
            System.out.println(value3.getTime());
        }
    }

    public void divide(int number1, int number2) {
        logger.trace ("Start divide");
        try {
            System.out.println(number1 / number2);
        } catch (ArithmeticException e) {
            logger.error("Some ERROR:"+e);
        }
    }

    public void setValue1(int value1) {
        logger.debug("setValue3: "+value1);
        this.value1 = value1;
    }

    public void setValue2(String value2) {
        logger.debug("setValue3: "+value2);
        this.value2 = value2;
    }

    public void setValue3(Date value3) {
        logger.debug("setValue3: "+value3);
        this.value3 = value3;
    }
}

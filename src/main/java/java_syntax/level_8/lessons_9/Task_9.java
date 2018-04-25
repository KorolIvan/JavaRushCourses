package level_8.lessons_9;

import java.util.Date;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_9 {
    @Deprecated
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    @Deprecated
    public static boolean isDateOdd(String date) {
        boolean dateOdd = true;
        Date curDate = new Date(date);
        Date startDate = new Date();
        startDate.setDate(1);
        startDate.setMonth(0);
        startDate.setYear(curDate.getYear());

        long timeDistance = curDate.getTime() - startDate.getTime();
        long day = 24*60*60*1000;

        int dayCount = (int) (timeDistance/day);
        if(dayCount %2 == 0){
            dateOdd = false;
        }

        return dateOdd;
    }
}

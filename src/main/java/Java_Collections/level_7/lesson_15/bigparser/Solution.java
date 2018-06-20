package Java_Collections.level_7.lesson_15.bigparser;

import java.nio.file.Paths;

/**
 * @author Ivan Korol on 6/18/2018
 */

public class Solution {
    public static void main(String[] args) {
        LogParser logParser = new LogParser(Paths.get("C:\\documents\\javarush\\JavaRushCourses\\src\\main\\java\\Java_Collections\\level_7\\lesson_15\\bigparser\\logs\\"));
        //System.out.println(logParser.getNumberOfUniqueIPs(null, new Date()));
//        System.out.println(logParser.getNumberOfUniqueIPs( new Date(), null));
        System.out.println(logParser.getNumberOfUniqueIPs(null, null));
//        System.out.println(logParser.getNumberOfUniqueIPs(new Date(), new Date()));
    }
}

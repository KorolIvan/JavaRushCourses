package Java_Collections.level_7.lesson_15.bigparser;

import java.nio.file.Paths;

/**
 * @author Ivan Korol on 6/18/2018
 */

public class Solution {
    public static void main(String[] args) {
        LogParser logParser = new LogParser(Paths.get("C:\\documents\\javarush\\JavaRushCourses\\src\\main\\java\\Java_Collections\\level_7\\lesson_15\\bigparser\\logs\\"));
        System.out.println(logParser.execute("get date for event = \"LOGIN\" and date between \"11.12.2013 0:00:00\" and \"07.01.2021 20:22:55\""));
        System.out.println(logParser.execute("get ip for status = \"ERROR\" and date between \"03.11.2014 12:56:22\" and \"29.2.31020 5:4:8\""));
        System.out.println(logParser.execute("get date"));
        System.out.println(logParser.execute("get event"));
        System.out.println(logParser.execute("get status"));
        System.out.println(logParser.execute("get ip"));
    }
}

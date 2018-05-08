package Java_Collections.level_1.lesson_10.task_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

/**
 * @author Ivan Korol on 5/8/2018
 */
public class Solution {
    public static void main(String[] args) {
        String path = "C:\\documents\\javarush\\JavaRushCourses\\src\\main\\java\\Java_Collections\\level_1\\lesson_10\\task_1\\";
        Solution solution = new Solution();
        Properties properties = solution.getProperties(path + "properties.xml");
        properties.list(System.out);

        properties = solution.getProperties(path + "properties.txt");
        properties.list(System.out);

        properties = solution.getProperties(path + "notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {
        Properties properties = new Properties();
        try {

            if (fileName.endsWith(".xml")) {
                properties.loadFromXML(new FileInputStream(fileName));
            }else {
                properties.load(new FileReader(fileName));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}

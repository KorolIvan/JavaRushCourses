package Java_Collections.level_3.lesson_5.task_3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * @author Ivan Korol on 5/24/2018
 */
public class Solution {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
        T result = null;
        ObjectMapper mapper = new ObjectMapper();
        result = mapper.readValue(new FileReader(new File(fileName)), clazz);
        return result;
    }

    public static void main(String[] args) {

    }
}

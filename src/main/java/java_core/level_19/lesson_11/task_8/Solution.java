package java_core.level_19.lesson_11.task_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.singletonList;

/**
 * @author Ivan Korol on 4/26/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while (fileReader.ready()){
            String line = fileReader.readLine();
            StringBuffer buffer = new StringBuffer(line);

            System.out.println(buffer.reverse());
        }
        fileReader.close();
    }
}

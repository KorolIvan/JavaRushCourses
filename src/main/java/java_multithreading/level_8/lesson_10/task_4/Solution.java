package java_multithreading.level_8.lesson_10.task_4;

import java.util.LinkedHashMap;

/**
 * @author Ivan Korol on 8/16/2018
 */
public class Solution {
    public static void main(String[] args) {
        ReadWriteMap<Integer, String> linkedSafeMap = new ReadWriteMap<>(new LinkedHashMap<>());
    }
}

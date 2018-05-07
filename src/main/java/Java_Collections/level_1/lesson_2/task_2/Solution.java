package Java_Collections.level_1.lesson_2.task_2;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author Ivan Korol on 5/7/2018
 */
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        File path = new File(root);
        ArrayList<String> list = new ArrayList<>();
        Queue<File> fileQueue = new PriorityQueue<>();
        Collections.addAll(fileQueue, path.listFiles());
        while (!fileQueue.isEmpty()){
            File currentFile = fileQueue.remove();
            if(currentFile.isDirectory()) {
                Collections.addAll(fileQueue, currentFile.listFiles());
            }else {
                list.add(currentFile.getAbsolutePath());
            }
        }

        return list;
    }

    public static void main(String[] args) throws IOException {
        for(String s: getFileTree("C:\\ProgramData\\McAfee")){
            System.out.println(s);
        }
    }
}

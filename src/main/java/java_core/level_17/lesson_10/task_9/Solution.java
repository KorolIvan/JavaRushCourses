package java_core.level_17.lesson_10.task_9;

import level_17.lesson_10.task_9.CorruptedDataException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        ArrayList<String> fileNames = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file;
        String s;
        String line;
        try {
            for (int i = 0; i < 2; i++) {
                s = reader.readLine();
                fileNames.add(s);
            }

            //printArray(fileNames);

            for(int i = 0; i < fileNames.size(); i++) {
                file = new BufferedReader(new FileReader(new File(fileNames.get(i))));
                while ((line = file.readLine()) != null) {
                    if (i == 0) {
                        allLines.add(line);
                    }else if (i == 1) {
                        forRemoveLines.add(line);
                    }
                }
            }
        } catch(IOException e){

        }

        try {
            new level_17.lesson_10.task_9.Solution().joinData();
        }catch (CorruptedDataException ex) {
            ex.printStackTrace();
        }

    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
            return;
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}

package Java_Collections.level_1.lesson_10.task_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipInputStream;

/**
 * @author Ivan Korol on 5/10/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        String resultFileName = args[0];
        String[] fileNamePart = new String[args.length-1];
        for (int i = 0; i < args.length-1; i++){
            fileNamePart[i] = args[i+1];
        }

        Arrays.sort(fileNamePart);
        List<FileInputStream> fileInputStreamList = new ArrayList<>();
        for (int i = 0; i < args.length-1; i++) {
            fileInputStreamList.add(new FileInputStream(fileNamePart[i]));
        }
        SequenceInputStream sequenceInputStream = new SequenceInputStream(Collections.enumeration(fileInputStreamList));
        ZipInputStream zipInputStream  = new ZipInputStream(sequenceInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream(resultFileName);
        byte[] buffer = new byte[1024*1024];
        while (zipInputStream.getNextEntry() != null) {
            int count;
            while ((count = zipInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, count);
            }
        }
        sequenceInputStream.close();
        zipInputStream.close();
        fileOutputStream.close();
    }
}

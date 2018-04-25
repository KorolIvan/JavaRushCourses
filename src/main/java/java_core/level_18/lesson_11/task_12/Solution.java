package java_core.level_18.lesson_11.task_12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args[0].equals("-c")) {
            String file = new Scanner(System.in).next();
            FileInputStream fis = new FileInputStream(file);
            Scanner idreader = new Scanner(fis);
            ArrayList<Integer> idlist = new ArrayList<>();
            char space = ' ';

            while (idreader.hasNextLine()) {
                String s = idreader.nextLine().substring(0, 8).replace(" ", "");
                int id = Integer.parseInt(s);
                idlist.add(id);
            }
            fis.close();

            FileOutputStream fos = new FileOutputStream(file, true);
            int idmax = Collections.max(idlist);
            if ((Integer.toString(idmax).length()) <= 8) {
                fos.write(System.lineSeparator().getBytes());
                fos.write(Integer.toString(idmax+1).getBytes());
                for (int i=8-Integer.toString(idmax).length(); i>0; i--) {
                    fos.write(space);
                }
            }
            if (args[1].length() <= 30) {
                fos.write(args[1].getBytes());
                for (int i=30-args[1].length(); i>0; i--) {
                    fos.write(space);
                }
            }
            if (args[2].length() <= 8){
                fos.write(args[2].getBytes());
                for (int i=8-args[2].length(); i>0; i--) {
                    fos.write(space);
                }
            }
            if (args[3].length() <= 4){
                fos.write(args[3].getBytes());
                for (int i=4-args[3].length(); i>0; i--) {
                    fos.write(space);
                }
            }
            fos.close();
        }
    }
}

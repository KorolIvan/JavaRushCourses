package java_core.level_18.lesson_11.task_13;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author vanya on 4/19/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        String file = new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileInputStream inputStream = new FileInputStream(file);
        Scanner idReader = new Scanner(inputStream);
        ArrayList<String> lines = new ArrayList<>();

        if(args[0].equals("-u")) {
            String id = args[1];

            StringBuilder newProdName = new StringBuilder();
            StringBuilder newProdPrice = new StringBuilder();
            StringBuilder newProdCount = new StringBuilder();

            while (idReader.hasNext()) {
                String s = idReader.nextLine();
                if(s.equals("0")) break;
                lines.add(s);
            }
            idReader.close();
            inputStream.close();

            for (int i = 0; i < lines.size(); i++){
                String currentId = lines.get(i).substring(0, 8);
                String trimmer = lines.get(i).substring(0, 8).trim();
                if (id.equals(trimmer)) {
                    newProdName.append(args[2]);
                    if (args[2].length() <= 30) {
                        for (int j=30-args[2].length(); j>0; j--) {
                            newProdName.append(" ");
                        }
                    }
                    newProdPrice.append(args[3]);
                    if (args[3].length() <= 8) {
                        for (int j=8-args[3].length(); j>0; j--) {
                            newProdPrice.append(" ");
                        }
                    }
                    newProdCount.append(args[4]);
                    if (args[4].length() <= 4) {
                        for (int j=4-args[4].length(); j>0; j--) {
                            newProdCount.append(" ");
                        }
                    }
                    String newpinfo = currentId + newProdName + newProdPrice + newProdCount;
                    lines.set(i, newpinfo);
                }
            }

            PrintWriter cleaner = new PrintWriter(file);
            cleaner.flush();
            cleaner.close();

            FileOutputStream outputStream = new FileOutputStream(file, true);
            for (String t : lines) {
                outputStream.write(t.getBytes());
                outputStream.write(System.lineSeparator().getBytes());
            }
            outputStream.close();
        }

        if(args[0].equals("-d")) {
            String id = args[1];

            while (idReader.hasNext()) {
                String s = idReader.nextLine();
                if(s.equals("0")) break;
                lines.add(s);
            }
            idReader.close();
            inputStream.close();

            for (int i = 0; i < lines.size(); i++) {
                String trimmer = (lines.get(i).substring(0, 8).trim());
                if (id.equals(trimmer)) {
                    lines.remove(i);
                }
            }

            PrintWriter cleaner = new PrintWriter(file);
            cleaner.flush();
            cleaner.close();

            FileOutputStream outputStream = new FileOutputStream(file, true);
            for (String t : lines) {
                outputStream.write(t.getBytes());
                outputStream.write(System.lineSeparator().getBytes());
            }
            outputStream.close();
        }
    }
}

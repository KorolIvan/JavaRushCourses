package Java_Collections.level_8.lesson_6.task_1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class Solution {
    public void printFile1() throws IOException {
//        FileInputStream fileInputStream = null;
//
//        try {
//            fileInputStream = new FileInputStream("file.txt");
//
//            int data = fileInputStream.read();
//            while (data != -1) {
//                System.out.println(data);
//                data = fileInputStream.read();
//            }
//        } finally {
//            if (fileInputStream != null) {
//                fileInputStream.close();
//            }
//        }

        try(FileInputStream fileInputStream = new FileInputStream("file.txt")) {
            int data = fileInputStream.read();
            while (data != -1) {
                System.out.println(data);
                data = fileInputStream.read();
            }
        }
    }

    public void printFile2() throws IOException {
//        FileInputStream fileInputStream = null;
//        BufferedInputStream bufferedInputStream = null;
//        try {
//            fileInputStream = new FileInputStream("file.txt");
//            bufferedInputStream = new BufferedInputStream(fileInputStream);
//
//
//            int data = bufferedInputStream.read();
//            while (data != -1) {
//                System.out.println(data);
//                data = bufferedInputStream.read();
//            }
//        } finally {
//            if (fileInputStream != null) {
//                fileInputStream.close();
//            }
//
//            if (bufferedInputStream != null) {
//                bufferedInputStream.close();
//            }
//        }

        try (FileInputStream fileInputStream = new FileInputStream("file.txt");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
            int data = bufferedInputStream.read();
            while (data != -1) {
                System.out.println(data);
                data = bufferedInputStream.read();
            }
        }
    }

    public static void main(String[] args) {

    }
}

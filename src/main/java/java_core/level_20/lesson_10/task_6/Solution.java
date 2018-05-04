package java_core.level_20.lesson_10.task_6;

import java.io.*;

/**
 * @author Ivan Korol on 5/4/2018
 */
public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        public void writeObject(ObjectOutputStream outputStream) throws IOException {
            throw new NotSerializableException();
        }

        public void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException{
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) {

    }
}

package java_core.level_20.lesson_10.task_4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivan Korol on 5/4/2018
 */
public class Solution implements Serializable {

    public static void main(String args[]) throws Exception {
        FileOutputStream fileOutput = new FileOutputStream("test.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);

        Solution solution = new Solution();
        outputStream.writeObject(solution);

        fileOutput.close();
        outputStream.close();

        //loading
        FileInputStream fiStream = new FileInputStream("text.txt");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        Solution loadedObject = (Solution) objectStream.readObject();

        fiStream.close();
        objectStream.close();

        //Attention!!
        System.out.println(loadedObject.size());
    }

    private Map<String, String> m = new HashMap<>();

    public Map<String, String> getMap() {
        return m;
    }

    public Solution() {
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
    }

    public int size() {
        return m.size();
    }
}


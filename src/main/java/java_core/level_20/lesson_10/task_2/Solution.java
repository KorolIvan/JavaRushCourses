package java_core.level_20.lesson_10.task_2;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @author Ivan Korol on 5/3/2018
 */
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        A a = null;
        try {
            a = (A) objectStream.readObject();
        } catch (NotSerializableException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return a;
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}

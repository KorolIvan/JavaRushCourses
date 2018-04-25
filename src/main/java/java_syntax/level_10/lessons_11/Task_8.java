package level_10.lessons_11;

import java.util.ArrayList;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_8 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayList = new ArrayList[]{new ArrayList<String>(), new ArrayList<String>()};
        arrayList[0].add("Example1");
        arrayList[1].add("Example2");
        //напишите тут ваш код

        return arrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}

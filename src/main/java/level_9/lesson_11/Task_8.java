package level_9.lesson_11;

import java.util.ArrayList;

public class Task_8 {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{1,2,3,4,5});
        list.add(new int[]{11,22});
        list.add(new int[]{111,222,333,444});
        list.add(new int[]{1111,2222,3333,4444,5555,6666,7777});
        list.add(new int[]{});
        return list;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}

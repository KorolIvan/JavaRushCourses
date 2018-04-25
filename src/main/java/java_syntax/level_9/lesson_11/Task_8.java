package level_9.lesson_11;

import java.util.ArrayList;

public class Task_8 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayList = new ArrayList[2];
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < arrayList.length; i++){
            for(int j = 0; j < 5; j++) {
                arrayList[i].add(String.valueOf(list.add("asd"+j)));
            }
        }
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

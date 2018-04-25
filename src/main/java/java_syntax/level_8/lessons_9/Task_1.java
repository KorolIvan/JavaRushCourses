package level_8.lessons_9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task_1 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //printCats(cats);
        cats.remove(cats.iterator().next());
        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();

        for (int i = 0; i < 3; i++){
            cats.add(new Cat());
        }
        //напишите тут ваш код. step 2 - пункт 2
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat: cats) {
            System.out.println(cat);
        }
        // step 4 - пункт 4
    }

    public static class Cat {

    }
}

package Java_Collections.level_4.lesson_2.task_4;

/**
 * @author Ivan Korol on 5/31/2018
 */
public class Solution {
    public static void main(String[] args) {
        int count = 3;
        moveRing('A', 'B', 'C', count);
    }

    public static void moveRing(char a, char b, char c, int count) {
        //напишите тут ваш код
        if(count == 1) {
            System.out.println(String.format("from %s to %s", a, b));
        }else {
            moveRing(a, c, b, count-1);
            System.out.println(String.format("from %s to %s", a, b));
            moveRing(c,b,a,count-1);
        }
    }
}

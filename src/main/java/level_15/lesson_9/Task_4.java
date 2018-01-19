package level_15.lesson_9;

/**
 * @author by Ivan Korol on 11/8/2017.
 */

public class Task_4 {
    public static int A = 0;

    static{
       if(A == 0){

           throw new NullPointerException();

       }

        //throw an exception here - выбросьте эксепшн тут
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}

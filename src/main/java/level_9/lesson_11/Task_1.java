package level_9.lesson_11;

public class Task_1 {
    public static void main(String[] args) {
        try {
            divisionByZero();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void divisionByZero() {
        int devByZero = 1/0;
        System.out.println(devByZero);
    }
}

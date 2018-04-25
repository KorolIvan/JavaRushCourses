package level_10.lessons_4;

public class Task_6 {
    public static void main(String[] args) {
        short b = 45;
        char c = (short) 'c';
        short s = (short) 1005.22;
        int i = 150000;
        float f = 4.10f;
        double d = 1.256d;
        double result = (f * b) + (i / c) - (d * s) + 562.78d;
        System.out.println("result: " + result);
    }
}

package level_10.lessons_4;

public class Task_3 {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (byte) f;
        int b = (int) (i + f);
        System.out.println(b);
    }
}

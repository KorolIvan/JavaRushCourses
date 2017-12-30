package level_10.lessons_4;

public class Task_7 {
    public static void main(String[] args) {
        long l = 111_1111_111_110L;
        int x = 0b1000_1100_1010;
        double m = 110_987_654_6299.123_34;
        float f = (float) l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);
    }
}

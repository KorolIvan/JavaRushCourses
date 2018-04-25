package level_10.lessons_11;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_7 {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Task_7 solution = new Task_7();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Task_7.D = 5 * D * C;

        Task_7.D = 5;
    }

    public int getA() {
        return A;
    }
}

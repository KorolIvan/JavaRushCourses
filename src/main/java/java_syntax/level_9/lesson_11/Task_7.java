package level_9.lesson_11;

public class Task_7 {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Task_7 room = new Task_7();
        room.A = 5;

        Task_7.D = 5;
    }

    public int getA() {
        return A;
    }
}

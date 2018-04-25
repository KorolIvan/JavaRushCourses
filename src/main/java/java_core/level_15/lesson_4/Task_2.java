package java_core.level_15.lesson_4;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_2 {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(Integer m, int n, String value) {

    }
    public static void printMatrix(Integer m, int n, Object value) {

    }
    public static void printMatrix(int n,Integer m, String value) {

    }
    public static void printMatrix(int n,Integer m, Object value) {

    }
    public static void printMatrix(Integer n,Integer m, String value) {

    }
    public static void printMatrix(Integer n,Integer m, Object value) {

    }
    public static void printMatrix(long m, int n, String value) {

    }
    public static void printMatrix(long m, int n, Object value) {

    }
}

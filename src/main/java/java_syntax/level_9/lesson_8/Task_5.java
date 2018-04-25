package level_9.lesson_8;

public class Task_5 {
    public static void main(String[] args) {
        processExceptions(new Task_5());
    }

    public static void processExceptions(Task_5 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }catch (NullPointerException e){
            printStack(e);
        }catch (IndexOutOfBoundsException e){
            printStack(e);
        }catch (NumberFormatException e) {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

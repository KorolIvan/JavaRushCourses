package level_10.lessons_11;

public class Task_4 {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        //System.out.println(s.length());
        for (int i = 0; i < 40; i++) {
            System.out.println(s);
            s = s.substring(1);
            //System.out.println(s);
        }
                //напишите тут ваш код
    }
}

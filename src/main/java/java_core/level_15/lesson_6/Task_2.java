package java_core.level_15.lesson_6;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_2 {
    public static void main(String[] args) {
        SiamCat simka = new SiamCat("Simka");
        NakedCat nakedSimka = simka.shave();
    }

    public static class NakedCat {
//        public NakedCat() {
//            super();
//        }
    }

    public static class NormalCat extends NakedCat {
        public NormalCat() {
            //super();
        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}

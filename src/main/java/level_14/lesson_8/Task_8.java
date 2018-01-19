package level_14.lesson_8;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_8 {
    public static void main(String[] args) {
        Swimmable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal {
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.swimming();
        }

        private void swimming() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal implements Swimmable{
        @Override
        Swimmable getCurrentAnimal() {
            return null;
        }
    }

    static class Whale extends OceanAnimal implements Swimmable{

        @Override
        Swimmable getCurrentAnimal() {
            return null;
        }
    }

    static class Otter implements Swimmable, Walkable{

        @Override
        public void walk() {

        }

        @Override
        public void swim() {

        }
    }
}

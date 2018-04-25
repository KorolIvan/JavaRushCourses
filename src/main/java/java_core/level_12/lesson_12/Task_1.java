package java_core.level_12.lesson_12;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_1 {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Я - кот";
        }
    }
}

package level_8.lessons_9;

import java.util.HashSet;
import java.util.Set;

public class Task_2 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        for (int i = 0; i < 4; i++){
            result.add(new Cat());
        }
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogs = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            dogs.add(new Dog());
        }
        //напишите тут ваш код
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
        //напишите тут ваш код

    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object pair:
             pets) {
            System.out.println(pair);
        }
    }

    public static class Dog{

    }
    public static class Cat{

    }
}

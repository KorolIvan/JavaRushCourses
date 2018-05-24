package Java_Collections.level_3.lesson_5.task_7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Ivan Korol on 5/24/2018
 */
public class Solution {
    public static void main(String[] args) throws JsonProcessingException {
        Zoo.Dog dog = new Zoo.Dog("doggy");
        Zoo.Cat cat = new Zoo.Cat("catty");
        Zoo zoo = new Zoo();
        zoo.animals.add(dog);
        zoo.animals.add(cat);

        String result = new ObjectMapper().writeValueAsString(zoo);

        System.out.println(result);
    }
}

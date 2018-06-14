package Java_Collections.level_5.lesson_15.fectory.female;

import Java_Collections.level_5.lesson_15.fectory.AbstractFactory;
import Java_Collections.level_5.lesson_15.fectory.Human;

/**
 * @author Ivan Korol on 6/14/2018
 */
public class FemaleFactory implements AbstractFactory {
    public Human getPerson(int age) {
        if(age <= KidGirl.MAX_AGE) {
            return new KidGirl();
        }else if(age > KidGirl.MAX_AGE && age <= TeenGirl.MAX_AGE) {
            return new TeenGirl();
        }
        return new Woman();
    }
}

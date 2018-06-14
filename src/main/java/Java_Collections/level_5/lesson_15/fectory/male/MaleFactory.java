package Java_Collections.level_5.lesson_15.fectory.male;

import Java_Collections.level_5.lesson_15.fectory.AbstractFactory;
import Java_Collections.level_5.lesson_15.fectory.Human;

/**
 * @author Ivan Korol on 6/14/2018
 */
public class MaleFactory implements AbstractFactory {

    public Human getPerson(int age) {
        if(age <= KidBoy.MAX_AGE) {
            return new KidBoy();
        }else if(age > KidBoy.MAX_AGE && age <= TeenBoy.MAX_AGE) {
            return new TeenBoy();
        }
        return new Man();
    }
}

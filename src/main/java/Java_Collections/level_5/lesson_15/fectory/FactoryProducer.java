package Java_Collections.level_5.lesson_15.fectory;

import Java_Collections.level_5.lesson_15.fectory.female.FemaleFactory;
import Java_Collections.level_5.lesson_15.fectory.male.MaleFactory;

/**
 * @author Ivan Korol on 6/14/2018
 */
public class FactoryProducer {
    public static enum HumanFactoryType {
        MALE,
        FEMALE
    }

    public static AbstractFactory getFactory(HumanFactoryType type) {
        if (type.equals(HumanFactoryType.MALE)){
            return new MaleFactory();
        }
        return new FemaleFactory();
    }
}

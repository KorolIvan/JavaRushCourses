package Java_Collections.level_5.lesson_15.fectory;

import Java_Collections.level_5.lesson_15.fectory.male.MaleFactory;

/**
 * @author Ivan Korol on 6/14/2018
 */
public class Solution {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.FEMALE);
        useFactory(factory);

        factory = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.MALE);
        useFactory(factory);
    }

    public static void useFactory(AbstractFactory factory) {
        System.out.println(factory.getPerson(99));
        System.out.println(factory.getPerson(4));
        System.out.println(factory.getPerson(15));
    }
}

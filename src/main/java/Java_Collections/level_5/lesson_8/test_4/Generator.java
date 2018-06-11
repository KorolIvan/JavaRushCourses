package Java_Collections.level_5.lesson_8.test_4;

/**
 * @author Ivan Korol on 6/11/2018
 */
public class Generator<T> {
    Class<T> clazz;

    public Generator(Class<T> clazz) {
        this.clazz = clazz;
    }

    T newInstance() throws IllegalAccessException, InstantiationException {
        return (T) clazz.newInstance();
    }
}

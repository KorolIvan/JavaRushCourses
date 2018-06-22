package Java_Collections.level_8.lesson_15.aggtrgator;

import Java_Collections.level_8.lesson_15.aggtrgator.model.Provider;

import java.util.Arrays;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class Controller {
    private Provider[] providers;

    public Controller(Provider... providers) {
        if(providers.length==0) {
            throw new IllegalArgumentException();
        }
        this.providers = providers;
    }
    @Override
    public String toString() {
        return "Controller{" +
                "providers=" + Arrays.toString(providers) +
                '}';
    }
}

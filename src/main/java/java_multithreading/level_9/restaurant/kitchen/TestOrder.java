package java_multithreading.level_9.restaurant.kitchen;

import java_multithreading.level_9.restaurant.Tablet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Ivan Korol on 9/3/2018
 */
public class TestOrder extends Order {
    public TestOrder(Tablet tablet) throws IOException {
        super(tablet);
    }

    @Override
    protected void initDishes() throws IOException {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        dishes = new ArrayList<>();
        List<Dish> list = new ArrayList<>(Arrays.asList(Dish.values()));
        Collections.shuffle(list);
        int rnd = random.nextInt(list.size());
        for (int i = 0; i < rnd; i++) {
            dishes.add(list.get(i));
        }
    }
}

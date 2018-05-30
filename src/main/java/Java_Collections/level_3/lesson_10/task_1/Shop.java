package Java_Collections.level_3.lesson_10.task_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 5/30/2018
 */
public class Shop {
    public Goods goods;
    public int count;
    public double profit;
    public String[] secretData;

    static class Goods {
        public List<String> names = new ArrayList<>();
    }
}

package java_core.level_14.lesson_6;

import level_14.lesson_6.Country;
import level_14.lesson_6.Hen;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - " + Country.BELARUS + ".Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

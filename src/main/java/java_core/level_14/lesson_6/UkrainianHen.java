package java_core.level_14.lesson_6;



/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - " + Country.UKRAINE + ".Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}

package java_core.level_14.lesson_6;



/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        Hen hen1 = HenFactory.getHen(Country.RUSSIA);
        Hen hen2 = HenFactory.getHen(Country.MOLDOVA);
        Hen hen3 = HenFactory.getHen(Country.UKRAINE);
        hen1.getCountOfEggsPerMonth();
        hen2.getCountOfEggsPerMonth();
        hen3.getCountOfEggsPerMonth();
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
        System.out.println(hen1.getDescription());
        System.out.println(hen2.getDescription());
        System.out.println(hen3.getDescription());
    }

    public static class HenFactory {

        public static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (country.equals(Country.BELARUS)){
                hen = new BelarusianHen();
            }else if (country.equals(Country.MOLDOVA)){
                hen = new MoldovanHen();
            }else if (country.equals(Country.UKRAINE)){
                hen = new UkrainianHen();
            }else if (country.equals(Country.RUSSIA)){
                hen = new RussianHen();
            }
            return hen;
        }
    }

}

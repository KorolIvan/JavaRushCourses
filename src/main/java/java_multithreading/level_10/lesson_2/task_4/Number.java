package java_multithreading.level_10.lesson_2.task_4;

/**
 * @author Ivan Korol on 9/10/2018
 */
public class Number {
    private NumerationSystem numerationSystem;
    private String digit;

    public Number(NumerationSystem numerationSystem, String digit) {
        this.numerationSystem = numerationSystem;
        this.digit = digit;
    }

    public NumerationSystem getNumerationSystem() {
        return numerationSystem;
    }

    public String getDigit() {
        return digit;
    }

    @Override
    public String toString() {
        return "Number{" +
                "numerationSystem=" + numerationSystem +
                ", digit='" + digit + '\'' +
                '}';
    }
}

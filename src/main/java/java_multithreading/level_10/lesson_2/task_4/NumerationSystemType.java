package java_multithreading.level_10.lesson_2.task_4;

/**
 * @author Ivan Korol on 9/10/2018
 */
public enum NumerationSystemType implements NumerationSystem {
    _16,
    _12,
    _10,
    _9,
    _8,
    _7,
    _6,
    _5,
    _4,
    _3,
    _2;

    @Override
    public int getNumerationSystemIntValue() {
        return Integer.parseInt(this.name().substring(1));
    }
}

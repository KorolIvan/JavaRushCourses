package java_multithreading.level_5.lesson_2.task_3;

/**
 * @author Ivan Korol on 7/30/2018
 */
public interface Columnable {
    /**
     * @return полное имя колонки
     */
    String getColumnName();

    /**
     * Возвращает true, если колонка видимая, иначе false
     */
    boolean isShown();

    /**
     * Скрывает колонку - маркирует колонку -1 в массиве realOrder.
     * Сдвигает индексы отображаемых колонок, которые идут после скрытой
     */
    void hide();

    /**
     * Возвращает порядок константы в энуме.
     *
     * @return порядок константы в энуме
     */
    int ordinal();
}

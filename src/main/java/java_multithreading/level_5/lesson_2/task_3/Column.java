package java_multithreading.level_5.lesson_2.task_3;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ivan Korol on 7/30/2018
 */
public enum Column implements Columnable {
    Customer("Customer"),
    BankName("Bank Name"),
    AccountNumber("Account Number"),
    Amount("Available Amount");

    private String columnName;

    private static int[] realOrder;

    private Column(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Задает новый порядок отображения колонок, который хранится в массиве realOrder.
     * realOrder[индекс в энуме] = порядок отображения; -1, если колонка не отображается.
     *
     * @param newOrder новая последовательность колонок, в которой они будут отображаться в таблице
     * @throws IllegalArgumentException при дубликате колонки
     */
    public static void configureColumns(Column... newOrder) {
        realOrder = new int[values().length];
        for (Column column : values()) {
            realOrder[column.ordinal()] = -1;
            boolean isFound = false;

            for (int i = 0; i < newOrder.length; i++) {
                if (column == newOrder[i]) {
                    if (isFound) {
                        throw new IllegalArgumentException("Column '" + column.columnName + "' is already configured.");
                    }
                    realOrder[column.ordinal()] = i;
                    isFound = true;
                }
            }
        }
    }

    /**
     * Вычисляет и возвращает список отображаемых колонок в сконфигурированом порядке (см. метод configureColumns)
     * Используется поле realOrder.
     *
     * @return список колонок
     */
    public static List<Column> getVisibleColumns() {
        List<Column> result = new LinkedList<>();
        for (int i = 0; i < realOrder.length; i++) {
            if(realOrder[i] != -1) {
                result.add(values()[i]);
            }
        }
        result.sort(new Comparator<Column>() {
            @Override
            public int compare(Column o1, Column o2) {
                if (realOrder[o1.ordinal()] > realOrder[o2.ordinal()]) { return 1; }
                if (realOrder[o1.ordinal()] < realOrder[o2.ordinal()]) { return -1; }
                else return 0;
            }
        });
        return result;
    }

    @Override
    public String getColumnName() {
        return columnName;
    }

    @Override
    public boolean isShown() {
        if (realOrder[this.ordinal()] != -1) {
            return true;
        }
        return false;
    }

    @Override
    public void hide() {
        int index = this.ordinal();

        for (int i = 0; i < realOrder.length; i++) {
            if (realOrder[i] > index) {
                realOrder[i]--;
            }
        }
        realOrder[index] = -1;
    }
}
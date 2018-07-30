package java_multithreading.level_5.lesson_2.task_3;

/**
 * @author Ivan Korol on 7/30/2018
 */
public class Solution {
    /**
     * Output:
     * <p/>
     * Available Amount
     * Account Number
     * Bank Name
     * --------------------
     * Available Amount
     * Bank Name
     */
    public static void main(String[] args) {

        Column.configureColumns(Column.Amount, Column.AccountNumber, Column.BankName);

        for (Columnable columnable : Column.getVisibleColumns()) {
            System.out.println(columnable.getColumnName());
        }

        System.out.println("--------------------");
        Column.AccountNumber.hide();

        for (Columnable columnable : Column.getVisibleColumns()) {
            System.out.println(columnable.getColumnName());
        }
    }
}

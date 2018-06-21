package Java_Collections.level_8.lesson_10.task_1;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class Solution {
    public static void main(String[] args) throws IllegalAccessException {
        JavaRushBankAccount account = new JavaRushBankAccount("Mr.Smith");
        System.out.println("Проверка №1:");
        ReflectionAnnotationUtil.check(account);

        System.out.println("Проверка №2:");
        account.setAmount(100);
        ReflectionAnnotationUtil.check(account);

        System.out.println("Проверка №3:");
        ReflectionAnnotationUtil.check(new IncorrectAccount());
/* Ожидаемый вывод:

Проверка №1:
Поле amount в классе JavaRushBankAccount имеет аннотацию LongPositive, но его значение не положительное.
Проверка №2:
Проверка №3:
Поле amountString в классе IncorrectAccount имеет аннотацию LongPositive, но его тип String.

*/
    }
}

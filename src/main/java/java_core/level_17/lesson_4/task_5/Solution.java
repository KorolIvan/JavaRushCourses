package java_core.level_17.lesson_4.task_5;

import level_17.lesson_4.task_5.IMF;

public class Solution {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund == anotherFund );
    }
}

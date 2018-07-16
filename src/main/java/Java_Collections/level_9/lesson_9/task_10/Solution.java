package Java_Collections.level_9.lesson_9.task_10;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class Solution {
    public static void main(String[] args) {
        SecuritySystem securitySystem = new SecuritySystem();
        ElectricPowerSwitch electricPowerSwitch = new ElectricPowerSwitch(securitySystem);

        electricPowerSwitch.press();
        electricPowerSwitch.press();
    }
}


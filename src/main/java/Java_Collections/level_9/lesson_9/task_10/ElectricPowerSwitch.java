package Java_Collections.level_9.lesson_9.task_10;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class ElectricPowerSwitch {
    private Switchable securitySystem;

    public ElectricPowerSwitch(Switchable securitySystem) {
        this.securitySystem = securitySystem;
    }

    public void press() {
        System.out.println("Pressed the power switch.");
        if (securitySystem.isOn()) {
            securitySystem.turnOff();
        } else {
            securitySystem.turnOn();
        }
    }
}

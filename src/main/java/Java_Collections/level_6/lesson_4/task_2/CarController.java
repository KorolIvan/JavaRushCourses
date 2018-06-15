package Java_Collections.level_6.lesson_4.task_2;

/**
 * @author Ivan Korol on 6/15/2018
 */
public class CarController {
    private CarModel model;
    private SpeedometerView view;

    public CarController(CarModel model, SpeedometerView view) {
        this.model = model;
        this.view = view;
    }

    public String getCarBrand() {
        return model.getBrand();
    }

    public String getCarModel() {
        return model.getModel();
    }

    public void setCarSpeed(int speed) {
        model.setSpeed(speed);
    }

    public int getCarSpeed() {
        return model.getSpeed();
    }

    public int getCarMaxSpeed() {
        return model.getMaxSpeed();
    }

    public void updateView() {
        view.printCarDetails(getCarBrand(), getCarModel(), getCarSpeed());
    }

    public void speedUp(int seconds) {
        if (getCarSpeed() < getCarMaxSpeed()) {
            setCarSpeed((int) (getCarSpeed() + (3.5 * seconds)));
        }
        if (getCarSpeed() > getCarMaxSpeed()) {
            setCarSpeed(getCarMaxSpeed());
        }
    }

    public void speedDown(int seconds) {
        if (getCarSpeed() > 0) {
            setCarSpeed(getCarSpeed() - (12*seconds));
        }
        if (getCarSpeed() < 0) {
            setCarSpeed(0);
        }
    }

}

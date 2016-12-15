package logic.Cars;

/**
 * Created by npotocka on 14.12.16.
 */
public class Locomotive extends Car {
    private final String carType = "Locomotive";
    private int power;
    private int range;

    @Override
    public String displayCar() {
        return "*[_____] ***|";
    }

    @Override
    public String getCarType() {
        return this.carType;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getPower() {
        return power;
    }

    public int getRange() {
        return range;
    }
}

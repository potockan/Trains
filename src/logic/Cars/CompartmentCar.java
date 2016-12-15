package logic.Cars;

/**
 * Created by npotocka on 14.12.16.
 */
public class CompartmentCar extends PassengerCar {
    private final String carType = "Compartment Car";

    @Override
    public String displayCar() {
        return "|*** [][][] ***|";
    }

    @Override
    public String getCarType() {
        return this.carType;
    }
}

package logic.Cars;

/**
 * Created by npotocka on 14.12.16.
 */
public class NonCompartmentCar extends PassengerCar{
    private final String carType = "Non Compartment Car";

    @Override
    public String displayCar() {
        return "|*** ___ ***|";
    }

    @Override
    public String getCarType() {
        return this.carType;
    }
}

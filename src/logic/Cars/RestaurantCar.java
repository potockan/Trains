package logic.Cars;

/**
 * Created by npotocka on 13.12.16.
 */
public class RestaurantCar extends PassengerCar{
    private final String carType = "Restaurant Car";

    @Override
    public String displayCar() {
        return "|*** WARS ***|";
    }

    @Override
    public String getCarType() {
        return this.carType;
    }
}

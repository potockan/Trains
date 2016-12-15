package logic.Cars;

/**
 * Created by npotocka on 13.12.16.
 */
public abstract class PassengerCar extends Car {
    private int seatNumber;

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}

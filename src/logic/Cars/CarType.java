package logic.Cars;

/**
 * Created by npotocka on 16.12.16.
 */



public enum CarType {
    LOCOMOTIVE("Locomotive"),
    NON_COMPARTMENT_CAR("Non Compartment Car"),
    COMPARTMENT_CAR("Compartment Car"),
    RESTAURANT_CAR("Restaurant Car");

    private String type;

    private CarType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}





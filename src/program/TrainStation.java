package program;

import logic.Cars.*;
import logic.Trains.Train;
import logic.Trains.TrainValidator;

/**
 * Created by npotocka on 15.12.16.
 */
public class TrainStation {
    public static void main(String[] args){
        Train train = new Train();
        train.addCar(new Locomotive());
        train.addCar(new CompartmentCar());
        train.addCar(new RestaurantCar());
        train.addCar(new NonCompartmentCar());
        train.addCar(new CompartmentCar());
        train.addCar(new NonCompartmentCar());
        System.out.println(train.displayTrain());

        train.swapCars(1,2);
        System.out.println(train.displayTrain());

        TrainValidator validator = new TrainValidator();
        validator.addRestriction("Locomotive", 1, 1);
        validator.addRestriction("Compartment Car", 0, 4);
        validator.addRestriction("Non Compartment Car", 0, 3);
        validator.addRestriction("Restaurant Car", 0, 1);
        System.out.println(validator.validate(train));

        TrainValidator validator2 = new TrainValidator();
        validator2.addRestriction("Locomotive", 1, 1);
        validator2.addRestriction("Compartment Car", 3, 4);
        validator2.addRestriction("Non Compartment Car", 0, 1);
        validator2.addRestriction("Restaurant Car", 0, 1);
        System.out.println(validator2.validate(train));
        System.out.println(validator2.validate1(train));


    }
}

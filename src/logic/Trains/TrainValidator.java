package logic.Trains;
import logic.Cars.Car;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 * Created by npotocka on 15.12.16.
 */
public class TrainValidator {
    Map<String, Restriction> trainRestrictions = new HashMap<>();

    public void addRestriction(String carType, int minCarNumber, int maxCarNumber){
        this.trainRestrictions.put(
                carType,
                new Restriction<Integer>(minCarNumber, maxCarNumber)
        );
    }

    public Map<String, Integer> getTrainComposition(Train train){
        Car[] trainTable = train.getTrainOrder();
        Map<String, Integer> trainComposition = new HashMap<>();
        for(int i = 0; i < trainTable.length; i++){
            String carType = trainTable[i].getCarType().toString();
            trainComposition.put(
                    carType,
                    trainComposition.getOrDefault(carType, 0) + 1
            );

        }
        return trainComposition;
    }

    public boolean validate(Train train){
        Map<String, Integer> trainComposition = this.getTrainComposition(train);
        for(Map.Entry<String, Integer> entry : trainComposition.entrySet()){
            Restriction<Integer> restrictions = this.trainRestrictions.get(entry.getKey());
            if(restrictions.getMin() > entry.getValue() ||
                    restrictions.getMax() < entry.getValue())
                return false;
        }
        return true;
    }

    public Set<String> validate1(Train train) {
        Set<String> restrictionViolation = new HashSet<>();
        Map<String, Integer> trainComposition = this.getTrainComposition(train);
        for (Map.Entry<String, Integer> entry : trainComposition.entrySet()) {
            Restriction<Integer> restrictions = this.trainRestrictions.get(entry.getKey());
            if (restrictions.getMin() > entry.getValue() ||
                    restrictions.getMax() < entry.getValue()) {
                restrictionViolation.add("".format(
                        "%s is %d and should be >= %d and <= %d",
                        entry.getKey(), entry.getValue(),
                        restrictions.getMin(), restrictions.getMax()
                ));
            }
        }
        return restrictionViolation;
    }

}

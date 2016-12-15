package logic.Trains;
import logic.Cars.Car;
import logic.Pairs.Pair;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by npotocka on 15.12.16.
 */
public class TrainValidator {
    Map<String, Pair> trainRestrictions = new HashMap<>();

    public void addRestriction(String carType, int minCarNumber, int maxCarNumber){
        // nie jest potrzebna walidacja,
        // czy jakichs ograniczen na ten typ wagonow juz nie mamy?
        Pair range = new Pair(minCarNumber, maxCarNumber);
        this.trainRestrictions.put(
                carType,
                range
        );
    }

    public Map<String, Integer> getTrainComposition(Train train){
        Car[] trainTable = train.getTrainOrder();
        Map<String, Integer> trainComposition = new HashMap<>();
        for(int i = 0; i < trainTable.length; i++){
            String carType = trainTable[i].getCarType();
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
            Pair restrictions = this.trainRestrictions.get(entry.getKey());
            if(restrictions.getMin() > entry.getValue() ||
                    restrictions.getMax() < entry.getValue())
                return false;
        }
        return true;
    }


}

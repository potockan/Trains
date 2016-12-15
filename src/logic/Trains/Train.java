package logic.Trains;
import logic.Cars.Car;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by npotocka on 14.12.16.
 */
public class Train {
    List<Car> train = new LinkedList<>();

    public void addCar(Car newCar){
        this.train.add(newCar);
    }

    public void removeCar(int i){
        this.train.remove(i);
    }

    public void removeCar(Car car) {
        if (this.train.contains(car)) ;
            this.train.remove(car);
    }

    public void swapCars(int carIndex1, int carIndex2){
        //TODO
        /*if(carIndex1 > carIndex2){
            int k;
            k = carIndex1;
            carIndex1 = carIndex2;
            carIndex2 = k;
        }
        Car futherCar = this.train.get(carIndex2);
        ListIterator<Car> iterator = this.train.listIterator();
        Car carToSwap = new Car; //TODO
        int i = 0;
        while(iterator.hasNext()){
            if(i == carIndex1){
                iterator.add(futherCar);
                carToSwap = iterator.next();
                iterator.remove();
            }
            if(i == carIndex2){
                iterator.add(carToSwap);
                iterator.next();
                iterator.remove();
            }
            iterator.next();
            i++;
        }*/
    }

    public String displayTrain(){
        StringBuilder builder = new StringBuilder();
        for(Car c : this.train){
            builder.append(c.displayCar());
            builder.append("=");
        }
        return builder.toString();
    }

    public Car[] getTrainOrder(){
        Car[] trainTable = new Car[this.train.size()];
        int i = 0;
        for(Car c: this.train){
            trainTable[i] = c;
            i++;
        }
        return trainTable;
    }
}

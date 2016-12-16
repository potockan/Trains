package logic.Trains;
import logic.Cars.Car;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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

    public String displayTrain(){
        StringBuilder builder = new StringBuilder();
        for(Car c : this.train){
            builder.append(c.displayCar());
            builder.append("=");
        }
        return builder.toString();
    }

    public void swapCars(int carIndex1, int carIndex2){
        //TODO
        if(carIndex1 > carIndex2){
            int k;
            k = carIndex1;
            carIndex1 = carIndex2;
            carIndex2 = k;
        }
        Car carToSwap1 = this.train.get(carIndex2);
        ListIterator<Car> iterator1 = this.train.listIterator();
        while(iterator1.hasNext()){
            if(iterator1.nextIndex() == carIndex1){
                iterator1.add(carToSwap1);
                carToSwap1 = iterator1.next();
                iterator1.remove();
            }
            if(iterator1.nextIndex() == carIndex2){
                iterator1.add(carToSwap1);
                iterator1.next();
                iterator1.remove();
            }
            iterator1.next();

        }
        /*ListIterator<Car> iterator = this.train.listIterator();
        Car carToSwap1 = null;
        Car carToSwap2 = null;
        ListIterator<Car> iterator1 = iterator;
        while(iterator.hasNext()){
            System.out.println(this.displayTrain());
            if(iterator.nextIndex() == carIndex1){
                carToSwap1 = iterator.next();
                iterator1 = iterator;
            }
            if(iterator.nextIndex() == carIndex2){
                iterator.add(carToSwap1);
                carToSwap2 = iterator.next();
                iterator.remove();
                iterator1.add(carToSwap2);
            }
            iterator.next();
        }*/
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

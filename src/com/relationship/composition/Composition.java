package com.relationship.composition;

import java.util.ArrayList;
import java.util.List;

public class Composition {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        Car c1 = new Car("BMW",null);
        Car c2 = new Car("Audi",null);
        Car c3 = new Car("Benz",null);

        carList.add(c1);
        carList.add(c2);
        carList.add(c3);

        Car.print(carList);

    }
}
class Engine{
    String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }
}

class Car{
    String carName;
    Engine engine;

    public Car(String carName, Engine engine) {
        this.carName = carName;
        this.engine = new Engine("250CC");
    }

    public static void print(List<Car> carList){
        for (Car c : carList){
            System.out.println(c.carName+" "+c.engine.engineType);
        }
    }
}

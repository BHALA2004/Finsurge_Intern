package com.oops.sealedexample;

sealed public class Vehicle permits Bike,Cycle,Bus {

    public void air(){
        System.out.println("Filled around 10 tyres");
    }
    public void sound(){
        System.out.println("Vehicle Sound");
    }
}
final class Bus extends Vehicle{

    public void sound(){
        System.out.println("Bus Sound");
    }


}



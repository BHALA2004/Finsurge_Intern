package com.oops.sealedexample;

public class SealedMain {
    public static void main(String[] args) {

        //UpCasting()
        Vehicle bike = new Bike();  //child Object acts like parent
        Vehicle cycle = new Cycle();
        Vehicle Bus  = new Bus();

        System.out.println(bike instanceof Vehicle);
        System.out.println(bike instanceof Bike);


        Vehicle vehicle = new Vehicle();
        vehicle.sound();

        System.out.println(vehicle instanceof Vehicle);
        System.out.println(vehicle instanceof Bike);

        bike.sound();


        //Downcating
        if(cycle instanceof Cycle){
            Cycle cycle1 = (Cycle) cycle;
            cycle1.sound();
            cycle1.air();
        }



        System.out.println(bike instanceof Cycle);


    }
}

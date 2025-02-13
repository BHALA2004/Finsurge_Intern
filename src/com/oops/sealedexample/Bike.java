package com.oops.sealedexample;

non-sealed public class Bike extends Vehicle {

    public Bike() {
        super.sound();
    }


    public void bikeAir(){
        System.out.println("Filled around 6 tyres ");
    }


        public void sound()
        {
            System.out.println("Bike Sound");
        }
}
non-sealed class Cycle extends Vehicle {

    public void sound(){
        System.out.println("Cycle Sound");
    }
}



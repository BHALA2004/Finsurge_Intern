package com.Inheritance;

public class Animal {
    public  void sound(){
        System.out.println("Animal Method");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        super.sound();
        System.out.println("Dog Barks");
    }

    public static void eat(){
        System.out.println("Dog eating");
    }
}

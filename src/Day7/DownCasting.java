package Day7;

class Vehicle{
    public void sound(){
        System.out.println("Vehicle");
    }
}
class Car extends Vehicle{
    public void sound(){
        super.sound();
        System.out.println("Car");
    }
}

public class DownCasting {
    public static void main(String[] args) {

        //Manually by developers
        //Parent class reference Variable is assigned to child class reference variable leads to compilation error
        //so explicitly do casting called downcasting
        //use of intstanceof operator it can be done
        Vehicle vehicle = new Car();
        Car car =(Car) vehicle;
        car.sound();
    }
}

package Day7;

class Animal{
    public void sound(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        //Automatic by JVM
        //child class object is referenced to Parent class reference Variable
        Animal dog = new Dog();
        dog.sound();

    }
}

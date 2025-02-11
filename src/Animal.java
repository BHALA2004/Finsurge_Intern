import java.util.Arrays;

public class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }

    public String twoLines(){
        return "Animal.....";
    }

}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog Constructor");
    }

    public String twoLines(){
        return "Dog.....";
    }

    public static void main(String[] args) {
        Animal animal=new Dog();
        System.out.println(animal.twoLines());



    }
}

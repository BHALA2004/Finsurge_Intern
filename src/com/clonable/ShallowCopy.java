package com.clonable;

class Address {
    String city;
    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, String city) {
        this.name = name;
        this.address = new Address(city);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Bob", "New York");
        Person p2 = (Person) p1.clone();  // Cloning

        p2.address.city = "Los Angeles";  // Changing p2's city also affects p1

        System.out.println(p1.name + " - " + p1.address.city);  // ❌ "Los Angeles"
        System.out.println(p2.name + " - " + p2.address.city);
    }
}



package OOP.oop;

import OOP.oop.Animal;

public class Cat extends Animal{
    // 1. Complete your Cat class:
    //    - Add the properties "name" and "age"
    //    - Add a constructor that initializes both properties
    //    - Add a makeSound() method that prints "meow"

    public String name;
    public int age;

    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("meow");
    }
}
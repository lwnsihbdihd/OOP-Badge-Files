package OOP.oop;

import OOP.oop.Animal;

public class Dog extends Animal{
    // 2. Complete your Dog class:
    //    - Add the properties "name" and "age"
    //    - Add a constructor that initializes both properties
    //    - Add a makeSound() method that prints "bark"

    public String name;
    public int age;

    Animal dog = new Animal("Mark", 5);
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("bark");
    }
}
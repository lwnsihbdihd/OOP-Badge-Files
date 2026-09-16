package OOP.oop;

public class Runner {
    public static void main(String[] args) {
        Animal Cat = new Cat("Whiskers", 3);
        Cat.makeSound();

        Animal Dog = new Dog("Bob", 7);
        Dog.makeSound();

        Animal[] animals = {
            new Dog("Mark", 5),
            new Cat("Garfield", 6),
            new Bird("Bill", 2)
        };

        for(int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }

        Animal dog = new Dog("Luna", 8);
        Animal cat = new Cat("Cheddar", 4);

        dog.describe();
        cat.describe();
    }
}

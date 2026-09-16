package OOP.dog; 

public class Dog {
    // 1. Write your properties here. 
    public String name; 
    public int age;
    public String breed;
    public int hunger;
    // add more properties below

    // 2. Fill in the constructor below so that the dog's name is correctly set
    public Dog(String dogName, String dogBreed, int dogAge, int dogHunger) {
        this.name = dogName; 
        // add more initializers below
        this.breed = dogBreed;
        this.age = dogAge;
        this.hunger = dogHunger;
    }

    // 3. Write your methods here. 
    public void bark() {
        // Add print statement to bark!
        System.out.println("Bark");
    }

    public int eat(int hungerLevel) {
        hungerLevel = hunger + 5;
        return hungerLevel;
    }


    
}
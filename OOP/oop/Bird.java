package OOP.oop;

public class Bird extends Animal{
    
    public String name;
    public int age;

    public Bird(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("chirp");
    }
}

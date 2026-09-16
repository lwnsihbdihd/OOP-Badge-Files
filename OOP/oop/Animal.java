package OOP.oop;

public class Animal {
    // 3. Complete your Animal class:
    //    - Look at what properties & methods are shared between Cat.java and Dog.java. Add them in here
    //    - Add a constructor that initializes each property

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return name;
    }

    public int changeAge(int age) {
        
        return age;
    }

    public void makeSound() {
        System.out.println("animal sound");
    }

    public void describe() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
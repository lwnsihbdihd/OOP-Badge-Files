# OOP Inheritance, Abstraction, Encapsulation, and Polymorphism

## Part 1: Create the Animal Classes

### 1. Create the `Cat` class

Complete the `Cat` class so that it has:

- A `name` property
- An `age` property
- A constructor that initializes `name` and `age`
- A `makeSound()` method that prints `"meow"`

### 2. Create the `Dog` class

Complete the `Dog` class so that it has:

- A `name` property
- An `age` property
- A constructor that initializes `name` and `age`
- A `makeSound()` method that prints `"bark"`

At this point, compare your `Cat` and `Dog` classes. Discuss the following with your counselor:

- [ ] Identify which properties are the same.
// The name and age properties are the same.
- [ ] Identify which methods are the same.
// The makeSound() method is the same.
- [ ] Identify any code that is repeated between the `Cat` and `Dog` classes.
// The name and age variables.

---

## Part 2: Inheritance and DRY

### 3. Create the `Animal` class

Create an `Animal` class that contains the properties and functionality shared by both `Cat` and `Dog`.

Move the shared properties and methods into `Animal`.

Add a constructor that initializes the shared properties.

### 4. Make `Cat` and `Dog` inherit from `Animal`

Modify `Cat` and `Dog` so that they inherit from `Animal`. An example is provided as follows:

```java
public class Cat extends Animal {

}
```

Discuss with your counselor:

- [ ] State the keyword used to describe inheritance.
// extends
- [ ] Identify the properties and methods that can now be removed from `Cat` and `Dog`.
// The "this.name = name" and "this.age = age" part of both constructors.
- [ ] Explain the principle of **DRY (Don't Repeat Yourself)** and how inheritance allows you to achieve it.
// DRY is the principle of using methods and inheritance to not rewrite the same lines of code over and over. Inheritance helps with this by allowing you to use the same method across multiple classes, instead of having multiple methods in different classes that do the same thing.

---

## Part 3: Polymorphism

### 5. Use an `Animal` variable

Create an `Animal` variable and use it to store a `Cat` object. (HINT: what should be the type, and what should be the object created?)

Call `makeSound()` using the `Animal` variable.

Repeat this with a `Dog` object.

Notice the following:

- The variable is an `Animal`.
- The object is a `Cat`.
- The correct version of `makeSound()` is still called.

This is an example of **polymorphism**.

Discuss with your counselor:

- [ ] In the context of the above structure, explain the usage of polymorphism and its usefulness.
// Did this in the doc.
- [ ] Discuss an example of a larger program for which polymorphism would be useful, and how.
// In a game, polymorphism can be used to have different enemies use the same attack method from a parent "Enemy" class. This would prevent repeating the same attack method across many classes.

### 6. Add a `Bird` class

Create a `Bird` class that extends `Animal`.

Give `Bird` its own implementation of `makeSound()`.

Then create an array containing a `Cat`, `Dog`, and `Bird`:

```java
Animal[] animals = { /* Cat, Dog, and Bird objects */ };
```

Use a loop to call `makeSound()` on every animal.

Discuss with your counselor:

- [ ] With your counselor, walk through each cycle of the loop and identify what code is being called on each `Animal` object in the array.
// On each 'Animal' object in the array, the makeSound() method is being called for each one.

- [ ] Explain how this demonstrates polymorphism.
// This demonstrates polymorphism by using the makeSound() method from the parent "Animal" class.

---

## Part 4: Abstraction

### 7. Add a `describe()` method

Add a `describe()` method to `Animal` that prints the animal's name and age. Do NOT add `describe()` to `Cat` or `Dog`.

Create a `Cat` and a `Dog` object and call `describe()` on each.

Notice that you can use `describe()` without needing to know exactly how the `Animal` class stores or processes its data.

This is an example of **abstraction**.

Consider how abstraction works together with polymorphism:

- An `Animal` reference allows you to work with many different types of animals.
- You don't need to know the specific implementation of every animal.
- You can call methods defined by `Animal`, while Java handles which implementation should actually run.

Discuss with your counselor:

- [ ] With reference to the code written, identify the functionality / data being abstracted.
// The describe method is being abstracted.
- [ ] Explain how polymorphism relates to abstraction with regard to this example.
// The describe method is declared in the Animal class, while the Cat and Dog classes dont have it, while the Cat and Dog objects can still call the method. The describe method is abstracted by only being only declared in the Animal, with how it works and it functionality being hidden away.

---

## Part 6: Encapsulation

### 8. Make the Animal properties private

Return to the `Animal` class and make `name` and `age` `private`. An example is given below:

```java
private String name;
```

Try to access `name` and `age` directly from `Cat`.

- [ ] Briefly discuss with your counselor: what happens?
// You can't access it.

### 9. Add getters and methods for modifying data

Add `public` getter methods that allow other classes to read the animal's name and age.

Then add a `public` method that allows the animal's age to be changed.

Consider:

- [ ] Describe a scenario where you would want `name` and `age` to be `private`.
// When you are only planning to use those variables within the smae class they are declared in.
- [ ] Describe a scenario/class where you would want to keep interactions to just methods, and prevent direct modification of member variables.
- [ ] Explain how the `public` and `private` keywords help enforce **encapsulation**.

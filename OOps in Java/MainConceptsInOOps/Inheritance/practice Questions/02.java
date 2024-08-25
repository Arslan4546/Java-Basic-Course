// Question 3:

// Can a constructor of a subclass call a constructor of its superclass in Java? How is this achieved, and what happens if you do not explicitly call the superclass constructor?

// Explanation:

// In Java, a subclass constructor can call its superclass constructor using the super() keyword. If you do not explicitly call the superclass constructor, Java will automatically insert a no-argument constructor of the superclass (if available).

// Example:


// class Animal {
//     Animal(String name) {
//         System.out.println("Animal constructor called. Name: " + name);
//     }
// }

// class Dog extends Animal {
//     Dog() {
//         super("Dog"); // Explicit call to superclass constructor
//         System.out.println("Dog constructor called.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         // Outputs:
//         // Animal constructor called. Name: Dog
//         // Dog constructor called.
//     }
// }


// What Happens if super() is Not Explicitly Called:

// Java will automatically call the no-argument constructor of the superclass.
// If the superclass does not have a no-argument constructor, it will result in a compile-time error.





// Question 4:

// What is multiple inheritance in Java, and how does Java handle scenarios where multiple inheritance seems necessary?

// Explanation: Java does not support multiple inheritance with classes due to the "diamond problem," where a class inherits from two classes that have the same method signature, causing ambiguity. However, Java allows multiple inheritance through interfaces.

// Example:


// interface Animal {
//     void eat();
// }

// interface Mammal {
//     void breathe();
// }

// class Dog implements Animal, Mammal {
//     public void eat() {
//         System.out.println("Dog eats");
//     }

//     public void breathe() {
//         System.out.println("Dog breathes");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.eat(); // Outputs: Dog eats
//         dog.breathe(); // Outputs: Dog breathes
//     }
// }
// Scenario Handling:

// Use interfaces to achieve multiple inheritance-like behavior.
// Use composition to combine behaviors from multiple classes.
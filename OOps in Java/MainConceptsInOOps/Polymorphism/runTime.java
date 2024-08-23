// Runtime Polymorphism or dynamic polymorphism or method overriding in Java:

// It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding. Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class. That base function is said to be overridden.

// Example


// Java Program for Method Overriding

// Class 1
// Helper class

// class Parent {

//     // Method of parent class
//     void Print()
//     {

//         // Print statement
//         System.out.println("parent class");
//     }
// }

// // Class 2
// // Helper class
// class subclass1 extends Parent {

//     // Method
//     void Print() { System.out.println("subclass1"); }
// }

// // Class 3
// // Helper class
// class subclass2 extends Parent {

//     // Method
//     void Print()
//     {

//         // Print statement
//         System.out.println("subclass2");
//     }
// }

// // Class 4
// // Main class
// class GFG {

//     // Main driver method
//     public static void main(String[] args)
//     {

//         // Creating object of class 1
//         Parent a;

//         // Now we will be calling print methods
//         // inside main() method

//         a = new subclass1();
//         a.Print();

//         a = new subclass2();
//         a.Print();
//     }
// }

// Output
// subclass1
// subclass2


// Runtime Polymorphism / Method Overriding:

// Runtime polymorphism occurs when the method to be executed is determined at runtime rather than at compile time.
// This happens through method overriding, where a subclass overrides the method of its parent class, allowing the subclass to define its own specific behavior for that method.
// In other words, method overriding is the mechanism by which runtime polymorphism is achieved.

//Example:

// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal myAnimal = new Animal();  // Parent reference and object
//         Animal myDog = new Dog();        // Parent reference, Dog object
//         Animal myCat = new Cat();        // Parent reference, Cat object

//         myAnimal.sound();  // Output: Animal makes a sound
//         myDog.sound();     // Output: Dog barks (runtime polymorphism)
//         myCat.sound();     // Output: Cat meows (runtime polymorphism)
//     }
// }


//Explanation:

// Method Overriding: Both Dog and Cat classes override the sound() method of the Animal class.
// Runtime Polymorphism: The method to be executed (whether it's the sound() method of Animal, Dog, or Cat) is decided at runtime based on the actual object that the reference variable points to. This is what is referred to as runtime polymorphism.
// Thus, runtime polymorphism is essentially method overriding polymorphism, and the terms can be used interchangeably.
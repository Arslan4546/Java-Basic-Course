// 1. How does Java support both compile-time and runtime polymorphism? Explain with code examples.

// Explanation:

// Polymorphism in Java can be categorized into two types:

// Compile-time Polymorphism (Method Overloading): 

// Achieved by method overloading, where multiple methods have the same name but different parameters.

// Runtime Polymorphism (Method Overriding): 

// Achieved through method overriding, where a subclass provides a specific implementation of a method that is already defined in its superclass.


// Example:



// // Compile-time Polymorphism (Method Overloading)
// class Calculator {
//     public int add(int a, int b) {
//         return a + b;
//     }

//     public double add(double a, double b) {
//         return a + b;
//     }
// }

// // Runtime Polymorphism (Method Overriding)
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

// public class Main {
//     public static void main(String[] args) {
//         // Compile-time polymorphism
//         Calculator calc = new Calculator();
//         System.out.println(calc.add(5, 10));  // Output: 15
//         System.out.println(calc.add(5.5, 10.5));  // Output: 16.0

//         // Runtime polymorphism
//         Animal animal = new Dog();
//         animal.sound();  // Output: Dog barks
//     }
// }



// 2. Why is it that method overriding demonstrates polymorphism, but method overloading does not?

// Explanation:

// Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass. It showcases polymorphism because the decision about which method to execute is made at runtime, depending on the object type. Method overloading, on the other hand, is resolved at compile-time based on the method signature.

// Example:


// class Parent {
//     void display() {
//         System.out.println("Parent class display");
//     }
// }

// class Child extends Parent {
//     @Override
//     void display() {
//         System.out.println("Child class display");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Parent obj1 = new Parent();
//         Parent obj2 = new Child();

//         obj1.display();  // Output: Parent class display
//         obj2.display();  // Output: Child class display (runtime polymorphism)
//     }
// }


// In this case, obj2.display() calls the Child class's display() method at runtime, showing runtime polymorphism.
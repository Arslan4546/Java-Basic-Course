// Question 5:

// Explain the role of the final keyword in Java inheritance. How does it affect classes and methods?

// Explanation: 
// The final keyword in Java is used to restrict inheritance. When applied to a class, it prevents that class from being subclassed. When applied to a method, it prevents the method from being overridden by subclasses.

// Example:


// final class Animal {
//     final void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// // The following will cause a compile-time error
// // class Dog extends Animal {} // Error: Cannot inherit from final 'Animal'

// class Bird {
//     final void fly() {
//         System.out.println("Bird flies");
//     }
// }

// class Sparrow extends Bird {
//     // The following will cause a compile-time error
//     // void fly() { // Error: Cannot override the final method from Bird
//     //     System.out.println("Sparrow flies");
//     // }
// }



// Use Case:

// Use final for classes that should not be extended (e.g., utility classes like java.lang.Math).
// Use final for methods that should remain consistent across subclasses.


// Question 6:

// How does Java handle the inheritance of static methods and fields? Can static methods be overridden?

// Explanation: 
// In Java, static methods and fields are inherited, but static methods cannot be overridden. Instead, they can be hidden by declaring a static method with the same signature in the subclass.

// Example:


// class Animal {
//     static void staticMethod() {
//         System.out.println("Static method in Animal");
//     }
// }

// class Dog extends Animal {
//     static void staticMethod() {
//         System.out.println("Static method in Dog");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal.staticMethod(); // Outputs: Static method in Animal
//         Dog.staticMethod(); // Outputs: Static method in Dog

//         Animal animal = new Dog();
//         animal.staticMethod(); // Outputs: Static method in Animal (not overridden)
//     }
// }


// Key Point:

// Static methods belong to the class, not instances, so they can't be overridden in the traditional sense. The method in the subclass hides the method in the superclass.
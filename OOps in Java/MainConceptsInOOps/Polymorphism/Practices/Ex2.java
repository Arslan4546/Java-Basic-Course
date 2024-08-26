// 4. How does polymorphism relate to abstraction in Java? Can you give an example where an interface is used to demonstrate polymorphism?


// Explanation:

// Polymorphism and abstraction are related because interfaces (which are a key aspect of abstraction) allow objects of different classes to be treated in the same way. Polymorphism comes into play when different implementations of interface methods are used at runtime.

// Example:


// interface Vehicle {
//     void start();
// }

// class Car implements Vehicle {
//     @Override
//     public void start() {
//         System.out.println("Car starts with a key");
//     }
// }

// class Motorcycle implements Vehicle {
//     @Override
//     public void start() {
//         System.out.println("Motorcycle starts with a button");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Vehicle vehicle1 = new Car();
//         Vehicle vehicle2 = new Motorcycle();

//         vehicle1.start();  // Output: Car starts with a key
//         vehicle2.start();  // Output: Motorcycle starts with a button
//     }
// }





// 6. What are the limitations of polymorphism in Java when dealing with static methods or fields? Can static methods be overridden in a polymorphic context?
// Explanation:
// Static methods cannot be overridden in Java; they are resolved at compile-time based on the reference type, not the object type. Hence, polymorphism does not apply to static methods or fields.

// Example:

// class Parent {
//     static void display() {
//         System.out.println("Parent's static method");
//     }
// }

// class Child extends Parent {
//     static void display() {
//         System.out.println("Child's static method");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Parent obj = new Child();
//         obj.display();  // Output: Parent's static method
//     }
// }



// Even though obj refers to a Child object, the static method in the Parent class is called because static methods do not exhibit runtime polymorphism.
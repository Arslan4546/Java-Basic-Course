// Example:

// class Parent {
//     int age;

//     // Constructor for Parent class
//     Parent(int age) {
//         this.age = age;
//         System.out.println("Parent class constructor called.");
//     }
// }

// class Child extends Parent {
//     String name;

//     // Constructor for Child class
//     Child(String name, int age) {
//         super(age); // Explicitly calling the Parent class constructor with age
//         this.name = name;
//         System.out.println("Child class constructor called.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Child child = new Child("John", 25);
//         // Output:
//         // Parent class constructor called.
//         // Child class constructor called.
//     }
// }
// Constructor in Inheritance in Java:

// In Java, when a class inherits from another class, constructors play a crucial role in initializing the objects of both the base (parent) class and the derived (child) class. Inheritance allows a child class to inherit fields and methods from its parent class, but constructors are not inherited. However, they still have an essential function in object initialization.

// Key Concepts:

// Calling Parent Class Constructor:

// In Java, when a child class is instantiated, its constructor implicitly calls the parent class's constructor first to ensure that the parent class is initialized properly before the child class adds its own initialization logic.
// By default, the no-argument constructor of the parent class is called automatically at the beginning of the child class constructor. This happens because Java inserts a call to super() (the default constructor of the parent class) at the start of the child class constructor.

// Explicit Call to Parent Constructor:

// If you want to call a specific constructor of the parent class (with arguments), you must explicitly use super() with arguments inside the child class constructor.

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


// In this example:

// The Child class inherits from the Parent class.
// The Child constructor explicitly calls the Parent constructor using super(age), ensuring that the parent class is initialized with the correct data before the child class initialization.


// Rules for Constructors in Java:

// Constructors Are Not Inherited:

// Constructors are not inherited from the parent class to the child class. Each class must define its own constructors.

// Super() Call:

// If a constructor in a child class does not explicitly call a parent class constructor using super(), the Java compiler automatically inserts a call to the parent class's no-argument constructor as the first line of the child class constructor.
// If the parent class does not have a no-argument constructor and the child class does not explicitly call another parent constructor, a compilation error will occur.

// Order of Constructor Execution:

// Constructors are called in the order of inheritance, meaning the parent class constructor is executed first, followed by the child class constructor.

// Super() Must Be First Statement:

// If you use super() to call the parent class constructor, it must be the first statement in the child class constructor.

// No Constructor in Parent Class:

// If a parent class does not define any constructors, the compiler provides a default no-argument constructor. If the parent class defines at least one constructor (with or without arguments), the default constructor is not provided, and the child class must manually call one of the existing constructors in the parent class.

// Multiple Constructors:

// Like any class, a child class can have multiple constructors, each possibly calling different constructors of the parent class via super().





// Example of Constructor Call Without super():

// If the parent class only has a constructor with arguments, and the child class does not explicitly call super(), the code will result in a compilation error.


// class Parent {
//     Parent(int x) {
//         System.out.println("Parent constructor with arg called.");
//     }
// }

// class Child extends Parent {
//     Child() {
//         // No call to super(x); Compilation error will occur
//         System.out.println("Child constructor called.");
//     }
// }


// In this case, a compilation error will occur because the parent class doesn't have a no-argument constructor, and the child class constructor doesn't explicitly call a parent constructor with arguments.

// Summary:

// Constructors are not inherited in Java, but they play an important role in ensuring the proper initialization of objects in an inheritance hierarchy.
// When a child class constructor is invoked, it implicitly or explicitly calls a parent class constructor.
// The super() call is used to invoke a specific parent class constructor and must be the first statement in the child class constructor.






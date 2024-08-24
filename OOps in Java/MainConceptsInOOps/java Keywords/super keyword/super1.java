
// Super Keyword

// The super keyword in Java is used to refer to the immediate parent class object. It is commonly used in three ways:

// Accessing parent class methods: It is used to call methods from the parent class that may be overridden in the child class.
// Accessing parent class constructors: It is used to call the parent class constructor.
// Accessing parent class fields: It is used to refer to parent class fields when they are shadowed by child class fields.

//Example 1: Using super to Call a Parent Class Method

// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }

//     void display() {
//         super.sound();  // Calling parent class method
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.display();  // Output: Animal makes a sound
//     }
// }


// Explanation:

// In this example, the Dog class overrides the sound() method of the Animal class. Inside the display() method in the Dog class, we use super.sound() to invoke the sound() method of the Animal class.



// Example 2: Using super to Call a Parent Class Constructor java

// class Animal {
//     Animal() {
//         System.out.println("Animal constructor is called");
//     }
// }

// class Dog extends Animal {
//     Dog() {
//         super();  // Calling parent class constructor
//         System.out.println("Dog constructor is called");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();  // Output: Animal constructor is called
//                             //         Dog constructor is called
//     }
// }


// Explanation: 

// In this example, the Dog constructor calls the Animal constructor using super(). This is useful when the child class needs to initialize fields or call setup code defined in the parent class.


// Example 3: Using super to Access Parent Class Fields

// class Animal {
//     String name = "Animal";
// }

// class Dog extends Animal {
//     String name = "Dog";

//     void display() {
//         System.out.println("Child class name: " + name);  // Refers to Dog's name
//         System.out.println("Parent class name: " + super.name);  // Refers to Animal's name
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.display();  // Output: Child class name: Dog
//                       //         Parent class name: Animal
//     }
// }


// Explanation: 
// In this example, the Dog class has a field name that shadows the name field in the Animal class. The super.name is used to access the name field of the Animal class, while name without super refers to the Dog class's field.

// Summary:

// super keyword is used to refer to the immediate parent class's methods, constructors, or fields.
// Common Use Cases:
// Access parent class methods when overridden in child classes.
// Invoke parent class constructors from the child class constructor.
// Access parent class fields when they are shadowed by child class fields.






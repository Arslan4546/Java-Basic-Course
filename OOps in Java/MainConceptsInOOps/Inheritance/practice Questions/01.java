
//     int x = 10;

//     void print() {
//         System.out.println("Class A: " + x);
//     }
// }

// class B extends A {
//     int x = 20;

//     void print() {
//         System.out.println("Class B: " + x);
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         A obj = new B();
//         obj.print();// ye call krny sy class B ka method call ho ga 
//         System.out.println(obj.x);//but idhr class A k variable print hoga q k obj class ka reference ka 
//     }
// }



// Question 1:
// How does method overriding work in Java inheritance, and what role does the super keyword play in this context?

// Explanation: Method overriding is a feature in Java where a subclass provides a specific implementation of a method already defined in its superclass. The super keyword is used within the subclass to call the superclass's version of a method.

// Example:


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

//     void callSuperSound() {
//         super.sound();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.sound(); // Outputs: Dog barks
//         dog.callSuperSound(); // Outputs: Animal makes a sound
//     }
// }




// Question 2:
// What is the difference between inheritance and composition in Java, and in what scenarios should each be used?

// Explanation: Inheritance and composition are both design principles used to achieve code reuse, but they serve different purposes. Inheritance is used when there is an "is-a" relationship, whereas composition is used for a "has-a" relationship.

// Example:


// // Inheritance Example
// class Car extends Vehicle { // Car is a Vehicle
//     // Car specific methods and fields
// }

// // Composition Example
// class Car {
//     Engine engine; // Car has an Engine
//     Wheels wheels; // Car has Wheels
// }



// Use Case:

// Inheritance is used when you need to extend the functionality of an existing class.
// Composition is used when you want to combine objects that can exist independently of each other.




// Example of Composition in Java:

// Let's consider an example where we model a Car class. The Car class has an Engine and Wheels. These are examples of composition because a car "has an" engine and "has" wheels.


// // Engine class, which will be a part of Car (Composition)
// class Engine {
//     private String type;

//     Engine(String type) {
//         this.type = type;
//     }

//     public String getType() {
//         return type;
//     }

//     public void start() {
//         System.out.println("Engine is starting...");
//     }
// }

// // Wheels class, which will be a part of Car (Composition)
// class Wheels {
//     private int size;

//     Wheels(int size) {
//         this.size = size;
//     }

//     public int getSize() {
//         return size;
//     }
// }

// // Car class that uses Engine and Wheels (Has-A Relationship)
// class Car {
//     private Engine engine;
//     private Wheels wheels;

//     Car(String engineType, int wheelSize) {
//         this.engine = new Engine(engineType);
//         this.wheels = new Wheels(wheelSize);
//     }

//     public void startCar() {
//         engine.start();
//         System.out.println("Car is starting with " + wheels.getSize() + " inch wheels and " + engine.getType() + " engine.");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         // Creating a Car object which internally creates Engine and Wheels objects
//         Car car = new Car("V8", 18);
//         car.startCar();
//     }
// }
// Explanation:


// Engine class:

// Represents an engine, with a type field and a start() method to simulate starting the engine.

// Wheels class:

// Represents wheels, with a size field.

// Car class:

// The Car class "has-a" relationship with both Engine and Wheels.
// It contains instances of Engine and Wheels as member variables.
// The Car class creates these objects when a Car object is instantiated.
// The startCar() method demonstrates how the Car object interacts with its composed parts (the engine and wheels).

// In main():

// We create a Car object with an Engine type of "V8" and wheels of size 18 inches.
// The startCar() method is called, which starts the engine and prints a message describing the car.



// Output:

// Engine is starting...
// Car is starting with 18 inch wheels and V8 engine.



// method overloading



// Superclass
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

// Main class to test the method overriding
public class TestOverriding {
    public static void main(String[] args) {
        // Create an Animal object
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Calls the method from Animal class

        // Create a Dog object
        Dog myDog = new Dog();
        myDog.sound(); // Calls the overridden method from Dog class

        // Using polymorphism
        Animal myPet = new Dog();
        myPet.sound(); // Calls the overridden method from Dog class
    }
}

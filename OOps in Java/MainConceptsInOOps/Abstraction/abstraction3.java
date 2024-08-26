// Abstract class having constructor, data member and methods

// An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.




//Example of an abstract class that has abstract and non-abstract methods  

//  abstract class Bike{  

//    Bike(){

// System.out.println("bike is created");

// }  
//    abstract void run();  

//    void changeGear(){

// System.out.println("gear changed");

// }  
//  }  
// //Creating a Child class which inherits Abstract class  

//  class Honda extends Bike{ 

//  void run(){
// System.out.println("running safely..");

// }  
//  }  

// //Creating a Test class which calls abstract and non-abstract methods  
//  class TestAbstraction2{  
//  public static void main(String args[]){  
//   Bike obj = new Honda();  
//   obj.run();  
//   obj.changeGear(); 

//  }  
// }  


// output:
// bike is created
// running safely..
// gear changed


// Rule: If there is an abstract method in a class, that class must be abstract.



// class Bike12{  

// abstract void run();  

// }  

// output:
// compile time error



// Rule: If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract.

// Another real scenario of abstract class

// The abstract class can also be used to provide some implementation of the interface. In such case, the end user may not be forced to override all the methods of the interface.


// Java program to illustrate the
// concept of Abstraction


// abstract class Shape {
//     String color;

//     // these are abstract methods
//     abstract double area();
//     public abstract String toString();

//     // abstract class can have the constructor
//     public Shape(String color)
//     {
//         System.out.println("Shape constructor called");
//         this.color = color;
//     }

//     // this is a concrete method
//     public String getColor() { return color; }
// }
// class Circle extends Shape {
//     double radius;

//     public Circle(String color, double radius)
//     {

//         // calling Shape constructor
//         super(color);
//         System.out.println("Circle constructor called");
//         this.radius = radius;
//     }

//     @Override 
    // double area()
//     {
//         return Math.PI * Math.pow(radius, 2);
//     }

//     @Override public String toString()
//     {
//         return "Circle color is " + super.getColor()
//             + "and area is : " + area();
//     }
// }
// class Rectangle extends Shape {

//     double length;
//     double width;

//     public Rectangle(String color, double length,
//                      double width)
//     {
//         // calling Shape constructor
//         super(color);
//         System.out.println("Rectangle constructor called");
//         this.length = length;
//         this.width = width;
//     }

//     @Override double area() { return length * width; }

//     @Override public String toString()
//     {
//         return "Rectangle color is " + super.getColor()
//             + "and area is : " + area();
//     }
// }
// public class Test {
//     public static void main(String[] args)
//     {
//         Shape s1 = new Circle("Red", 2.2);
//         Shape s2 = new Rectangle("Yellow", 2, 4);

//         System.out.println(s1.toString());
//         System.out.println(s2.toString());
//     }
// }

// Output
// Shape constructor called
// Circle constructor called
// Shape constructor called
// Rectangle constructor called
// Circle color is Redand area is : 15.205308443374602
// Rectangle color is Yellowand area is : 8.0



// Example 2:

// Java Program to implement
// Java Abstraction

// Abstract Class declared
// abstract class Animal {
//     private String name;

//     public Animal(String name) { this.name = name; }

//     public abstract void makeSound();

//     public String getName() { return name; }
// }

// Abstracted class
// class Dog extends Animal {
//     public Dog(String name) { super(name); }

//     public void makeSound()
//     {
//         System.out.println(getName() + " barks");
//     }
// }

// Abstracted class
// class Cat extends Animal {
//     public Cat(String name) { super(name); }

//     public void makeSound()
//     {
//         System.out.println(getName() + " meows");
//     }
// }

// Driver Class
// public class AbstractionExample {
//     // Main Function
//     public static void main(String[] args)
//     {
//         Animal myDog = new Dog("Buddy");
//         Animal myCat = new Cat("Fluffy");

//         myDog.makeSound();
//         myCat.makeSound();
//     }
// }

// Output

// Buddy barks
// Fluffy meows

// Explanation of the above Java program:

// This code defines an Animal abstract class with an abstract method makeSound(). The Dog and Cat classes extend Animal and implement the makeSound() method. The main() method creates instances of Dog and Cat and calls the makeSound() method on them. 

// This demonstrates the abstraction concept in Java, where we define a template for a class (in this case Animal), but leave the implementation of certain methods to be defined by subclasses (in this case makeSound()).
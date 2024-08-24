// Understanding the real scenario of Abstract class

// In this example, Shape is the abstract class, and its implementation is provided by the Rectangle and Circle classes.

// Mostly, we don't know about the implementation class (which is hidden to the end user), and an object of the implementation class is provided by the factory method.

// A factory method is a method that returns the instance of the class. We will learn about the factory method later.


// In this example, if you create the instance of Rectangle class, draw() method of Rectangle class will be invoked.



// abstract class Shape{  

// abstract void draw(); 

// }  


// //In real scenario, implementation is provided by others i.e. unknown by end user  

// class Rectangle extends Shape{  

// void draw(){

//     System.out.println("drawing rectangle");

// }  
// }  

// class Circle1 extends Shape{  
 
// void draw(){
    
//     System.out.println("drawing circle");

// }  
// }  

// //In real scenario, method is called by programmer or user  

// class TestAbstraction1{  

// public static void main(String args[]){  

// Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
// s.draw();  

// }  
// }  


// // OutPut:
// // drawing circle


// Another example of Abstract class in java



// abstract class Bank{  

// abstract int getRateOfInterest(); 

// }    
// class SBI extends Bank{   

// int getRateOfInterest(){

//     return 7;
// }    
// }    
// class PNB extends Bank{  

// int getRateOfInterest(){

//     return 8;

// }    
// }    
    
// class TestBank{    
// public static void main(String args[]){  

// Bank b;  
// b=new SBI(); 

// System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %"); 

// b=new PNB();  

// System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");  

// }}    


// Output:
// Rate of Interest is: 7 %
// Rate of Interest is: 8 %



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

//     @Override double area()
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
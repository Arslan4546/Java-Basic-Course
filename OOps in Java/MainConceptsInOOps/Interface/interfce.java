// Interface
// Interfaces are another method of implementing abstraction in Java. The key difference is that, by using interfaces, we can achieve 100% abstraction in Java classes. In Java or any other language, interfaces include both methods and variables but lack a method body. Apart from abstraction, interfaces can also be used to implement interfaces in Java.

// Implementation:
// To implement an interface we use the keyword “implements” with class.


// Define an interface named Shape
// interface Shape {
//     double calculateArea(); // Abstract method for
//                             // calculating the area
// }

// // Implement the interface in a class named Circle
// class Circle implements Shape {
//     private double radius;

//     // Constructor for Circle
//     public Circle(double radius) { this.radius = radius; }

//     // Implementing the abstract method from the Shape
//     // interface
//     public double calculateArea()
//     {
//         return Math.PI * radius * radius;
//     }
// }

// // Implement the interface in a class named Rectangle
// class Rectangle implements Shape {
//     private double length;
//     private double width;

//     // Constructor for Rectangle
//     public Rectangle(double length, double width)
//     {
//         this.length = length;
//         this.width = width;
//     }

//     // Implementing the abstract method from the Shape
//     // interface
//     public double calculateArea() { return length * width; }
// }

// // Main class to test the program
// public class Main {
//     public static void main(String[] args)
//     {
//         // Creating instances of Circle and Rectangle
//         Circle myCircle = new Circle(5.0);
//         Rectangle myRectangle = new Rectangle(4.0, 6.0);

//         // Calculating and printing the areas
//         System.out.println("Area of Circle: "
//                            + myCircle.calculateArea());
//         System.out.println("Area of Rectangle: "
//                            + myRectangle.calculateArea());
//     }
// }

// Output
// Area of Circle: 78.53981633974483
// Area of Rectangle: 24.0

//Advantages of Abstraction:

// Here are some advantages of abstraction:

// It reduces the complexity of viewing things.
// Avoids code duplication and increases reusability.
// Helps to increase the security of an application or program as only essential details are provided to the user.
// It improves the maintainability of the application. 
// It improves the modularity of the application. 
// The enhancement will become very easy because without affecting end-users we can able to perform any type of changes in our internal system. 
// Improves code reusability and maintainability.
// Hides implementation details and exposes only relevant information.
// Provides a clear and simple interface to the user.
// Increases security by preventing access to internal class details.
// Supports modularity, as complex systems can be divided into smaller and more manageable parts.
// Abstraction provides a way to hide the complexity of implementation details from the user, making it easier to understand and use.
// Abstraction allows for flexibility in the implementation of a program, as changes to the underlying implementation details can be made without affecting the user-facing interface.
// Abstraction enables modularity and separation of concerns, making code more maintainable and easier to debug.



// Disadvantages of Abstraction in Java:
// Here are the main disadvantages of abstraction in Java:

// Abstraction can make it more difficult to understand how the system works.
// It can lead to increased complexity, especially if not used properly.
// This may limit the flexibility of the implementation.
// Abstraction can add unnecessary complexity to code if not used appropriately, leading to increased development time and effort.
// Abstraction can make it harder to debug and understand code, particularly for those unfamiliar with the abstraction layers and implementation details.
// Overuse of abstraction can result in decreased performance due to the additional layers of code and indirection.

// Also Read:
// Interfaces in Java
// Abstract classes in Java
// Difference between abstract class and interface
// abstract keyword in Java
// When a parent class has a parameterized constructor and the child class has its own constructor (either parameterized or not), but the parent class constructor is not explicitly called using super(), the code will not compile. This is because Java expects the child class to explicitly call one of the parent class's constructors if none is provided by default.

// class A {

//     int x;

//     // Parameterized constructor
//     A(int x) {
//         this.x = x;
//         System.out.println("Constructor of Class A with x = " + x);
//     }
// }

// class B extends A {
//     // Parameterized constructor in child class
//     B(int y) {
//         // No explicit call to super(y); this leads to a compilation error
//         System.out.println("Constructor of Class B with y = " + y);
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         B obj = new B(10);  // Trying to create an instance of class B
//     }
// }





//Solution:


// To solve this problem, you must explicitly call the parent class's parameterized constructor using super(y) inside the child class constructor. Here’s how you can fix the code:


// class A {
//     int x;

//     // Parameterized constructor
//     A(int x) {
//         this.x = x;
//         System.out.println("Constructor of Class A with x = " + x);
//     }
// }

// class B extends A {
//     // Parameterized constructor in child class
//     B(int y) {
//         super(y);  // Explicitly calling the parent class constructor with an argument
//         System.out.println("Constructor of Class B with y = " + y);
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         B obj = new B(10);  // Creating an instance of class B
//     }
// }


// Explanation of the Solution:


// super(y):

// Inside the constructor of class B, we explicitly call the parent class's constructor with the argument y. This ensures that the parent class is properly initialized before the child class continues with its own initialization.






// In Java, you can create a program where both the parent class and the child class have multiple constructors, and the constructors can call each other using the this() keyword (for calling constructors within the same class) and super() keyword (for calling constructors of the parent class).

// Here's an example:


// // Parent class
// class Parent {
//     int x;
//     String name;

//     // Constructor 1
//     public Parent() {
//         this(0, "Default");
//         System.out.println("Parent's no-argument constructor called");
//     }

//     // Constructor 2
//     public Parent(int x) {
//         this(x, "Unknown");
//         System.out.println("Parent's constructor with one argument called");
//     }

//     // Constructor 3
//     public Parent(int x, String name) {
//         this.x = x;
//         this.name = name;
//         System.out.println("Parent's constructor with two arguments called");
//     }
// }

// // Child class
// class Child extends Parent {
//     int y;

//     // Constructor 1
//     public Child() {
//         super();  // Calls Parent's no-argument constructor
//         this.y = 0;
//         System.out.println("Child's no-argument constructor called");
//     }

//     // Constructor 2
//     public Child(int y) {
//         super(y);  // Calls Parent's constructor with one argument
//         this.y = y;
//         System.out.println("Child's constructor with one argument called");
//     }

//     // Constructor 3
//     public Child(int x, int y) {
//         super(x, "ChildName");  // Calls Parent's constructor with two arguments
//         this.y = y;
//         System.out.println("Child's constructor with two arguments called");
//     }
// }

// // Main class to test the constructors
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Creating Child object with no arguments:");
//         Child child1 = new Child();  // Calls Child's no-argument constructor

//         System.out.println("\nCreating Child object with one argument:");
//         Child child2 = new Child(10);  // Calls Child's constructor with one argument

//         System.out.println("\nCreating Child object with two arguments:");
//         Child child3 = new Child(5, 20);  // Calls Child's constructor with two arguments
//     }
// }
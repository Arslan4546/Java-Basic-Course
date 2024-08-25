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
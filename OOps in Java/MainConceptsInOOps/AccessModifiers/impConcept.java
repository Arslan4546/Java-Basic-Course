//Topic: A class cannot be private or protected except nested class


// In Java, you cannot declare a top-level class as private or protected. These access modifiers are not allowed for top-level classes because they need to be accessible to the JVM and other classes within the package. However, nested or inner classes can be declared as private or protected within another class.



// Top-level class (must be public or package-private, can't be private or protected)
// public class OuterClass {

// //     // A private nested class
//     private class PrivateNestedClass {
//         public void display() {
//             System.out.println("This is a private nested class!");
//         }
//     }

//     // A protected nested class
//     protected class ProtectedNestedClass {
//         public void display() {
//             System.out.println("This is a protected nested class!");
//         }
//     }

//     // A public method in the outer class that can access the private nested class
//     public void accessPrivateNestedClass() {
//         PrivateNestedClass privateClass = new PrivateNestedClass();
//         privateClass.display();
//     }

//     // A public method in the outer class that can access the protected nested class
//     public void accessProtectedNestedClass() {
//         ProtectedNestedClass protectedClass = new ProtectedNestedClass();
//         protectedClass.display();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // We can access the private nested class indirectly via a method in the outer class
//         OuterClass outer = new OuterClass();
//         outer.accessPrivateNestedClass();  // Output: This is a private nested class!
        
//         // We can access the protected nested class via the outer class's method
//         outer.accessProtectedNestedClass();  // Output: This is a protected nested class!
        
//         // We cannot directly instantiate the private or protected nested classes outside the outer class
//         // OuterClass.PrivateNestedClass privateClass = outer.new PrivateNestedClass(); // Error: Cannot be accessed
//         // OuterClass.ProtectedNestedClass protectedClass = outer.new ProtectedNestedClass(); // Error: Cannot be accessed
//     }
// }

// Explanation:

// Top-level class (OuterClass): This class is public and can be accessed from anywhere.

// Nested classes (PrivateNestedClass and ProtectedNestedClass): These are inner classes that are declared as private and protected, respectively.

// The private nested class can only be accessed within the outer class (OuterClass), meaning it cannot be instantiated directly in other classes (like Main).

// The protected nested class can be accessed within the outer class and also by any subclass or class within the same package.

// This example demonstrates that only nested classes can have the private or protected access modifiers, while top-level classes cannot.







// Compile-Time Polymorphism or static polymorphism or method overloading in Java:

// It is also known as static polymorphism. This type of polymorphism is achieved by function overloading or operator overloading. 

// Note: But Java doesn’t support the Operator Overloading.



// Method Overloading:
// When there are multiple functions with the same name but different parameters then these functions are said to be overloaded. Functions can be overloaded by changes in the number of arguments or/and a change in the type of arguments.

//Example 1:


// Java Program for Method overloading
// By using Different Types of Arguments 

// Class 1
// Helper class
// class Helper {

//     // Method with 2 integer parameters
//     static int Multiply(int a, int b)
//     {
//         // Returns product of integer numbers
//         return a * b;
//     }

//     // Method 2
//     // With same name but with 2 double parameters
//     static double Multiply(double a, double b)
//     {
//         // Returns product of double numbers
//         return a * b;
//     }
// }

// // Class 2
// // Main class
// class GFG {
//     // Main driver method
//     public static void main(String[] args)
//     {
//         // Calling method by passing
//         // input as in arguments
//         System.out.println(Helper.Multiply(2, 4));
//         System.out.println(Helper.Multiply(5.5, 6.3));
//     }
// }

// Output
// 8
// 34.65


//Example 2:


// Java program for Method Overloading
// by Using Different Numbers of Arguments

// Class 1
// Helper class
// class Helper {

//     // Method 1
//     // Multiplication of 2 numbers
//     static int Multiply(int a, int b)
//     {

//         // Return product
//         return a * b;
//     }

//     // Method 2
//     // // Multiplication of 3 numbers
//     static int Multiply(int a, int b, int c)
//     {

//         // Return product
//         return a * b * c;
//     }
// }

// // Class 2
// // Main class
// class GFG {

//     // Main driver method
//     public static void main(String[] args)
//     {

//         // Calling method by passing
//         // input as in arguments
//         System.out.println(Helper.Multiply(2, 4));
//         System.out.println(Helper.Multiply(2, 7, 3));
//     }
// }

// Output
// 8
// 42





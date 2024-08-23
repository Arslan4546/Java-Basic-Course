// Use protected for variables that should be accessible within the class and its subclasses: If you want to allow access to a variable from within the class and its subclasses, use the protected access modifier. This is less restrictive than private and provides some level of inheritance.




// Protected Access modifer

// The protected access modifier is accessible within package and outside the package but through inheritance only.
// The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.

// It provides more accessibility than the default modifer.

// Example of protected access modifier

// In this example, we have created the two packages pack and mypack. The A class of pack package is public, so can be accessed from outside the package. But msg method of this package is declared as protected, so it can be accessed from outside the class only through inheritance.


//save by A.java  
// package pack;  
// public class A{  
// protected void msg(){System.out.println("Hello");}  
// }  
// //save by B.java  
// package mypack;  
// import pack.*;  
  
// class B extends A{  
//   public static void main(String args[]){  
//    B obj = new B();  
//    obj.msg();  
//   }  
// }  

// Output:Hello

//iss mai ye hai k pkg k ander or bahir dono jaga acccessible but inheritance hona lazmi hai

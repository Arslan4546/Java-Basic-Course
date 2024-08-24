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



// Simple example of private access modifier

// In this example, we have created two classes A and Simple. A class contains private data member and private method. We are accessing these private members from outside the class, so there is a compile-time error.

// class A{  
//     private int data=40; 

//     private void msg(){
//         System.out.println("Hello java");
//     }  
//     }  
      
//     public class Simple{  
//      public static void main(String args[]){  
//        A obj=new A();  
//        System.out.println(obj.data);//Compile Time Error  
//        obj.msg();//Compile Time Error  
//        }  
//     }  


    //Role of Private Constructor

// If you make any class constructor private, you cannot create the instance of that class from outside the class. For example:

// class A{  

// private A(){}
// //private constructor  


// void msg(){

//     System.out.println("Hello java");
// }  
// }  
// public class Simple{  
//  public static void main(String args[]){  

//    A obj=new A();//Compile Time Error 

//  }  
// }  


//Note: A class cannot be private or protected except nested class

//hum private variable or private method ko same class mai he access kr skty hain kissi dosri class mai access ni kr skty 




//Another example


//When variables and methods are declared private, they cannot be accessed outside of the class. For example,

// class Data {
//     // private variable
//     private String name;
// }

// public class Main {
//     public static void main(String[] main){

//         // create an object of Data
//         Data d = new Data();

//         // access private variable and field from another class
//         d.name = "Programiz";
//     }
// }

// In the above example, we have declared a private variable named name. When we run the program, we will get the following error:

// Main.java:18: error: name has private access in Data
//         d.name = "Programiz";
//          ^

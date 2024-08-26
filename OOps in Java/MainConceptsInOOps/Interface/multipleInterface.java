// common example 

// interface  A {
//     void  Disp();
// }
// interface  B {
//     void  show();
// }

// class Arslan implements  A, B {


//     public void show(){
//         System.out.println("Implementing Both A and B Show");
//     }
//     public void Disp(){
//         System.out.println("Implementing Both A and B Disp");
//     }
//     public static void main(String[] args) {
//         Arslan main = new Arslan();
//         main.show();
//         main.Disp();
//     }
// }

// Example
// interface FirstInterface {
//   public void myMethod(); // interface method
// }

// interface SecondInterface {
//   public void myOtherMethod(); // interface method
// }

// class DemoClass implements FirstInterface, SecondInterface {
//   public void myMethod() {
//     System.out.println("Some text..");
//   }
//   public void myOtherMethod() {
//     System.out.println("Some other text...");
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     DemoClass myObj = new DemoClass();
//     myObj.myMethod();
//     myObj.myOtherMethod();
//   }
// }
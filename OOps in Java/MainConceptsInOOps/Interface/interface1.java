
// import java.util.Scanner;

// // COmmon example of implementing interface

// interface  Client{

//     void  input();//this method is by-default public and abstract
//     void output();//this method is also by-default public and abstract
// }

// class  Arslan implements  Client{
//  String name;
//  double salary;

//  public void input(){

//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the name of the employee: ");
//     name = sc.nextLine();
//     System.out.println("Enter the salary of the employee: ");
//     salary = sc.nextDouble();

//  }

//  public void output(){

//     System.out.println("Name is: " + name + " salary is: " + salary);

//  }



// }


// class  Main{

//     public static void main(String[] args) {
//         Client c = new Arslan();
//         c.input();
//         c.output();

// }
// }




// Note: If you are beginner to java, learn interface first and skip this example.


// interface A{  
// void a();  //public + abstract
// void b();  
// void c();  
// void d();  
// }  
  
// abstract class B implements A{  
// public void c(){System.out.println("I am c");}  
// }  
  
// class M extends B{  
// public void a(){System.out.println("I am a");}  
// public void b(){System.out.println("I am b");}  
// public void d(){System.out.println("I am d");}  
// }  
  
// class Test5{  
// public static void main(String args[]){  
// A a=new M();  
// a.a();  
// a.b();  
// a.c();  
// a.d();  
// }}  

// Output:
// I am a
// I am b
// I am c
// I am d
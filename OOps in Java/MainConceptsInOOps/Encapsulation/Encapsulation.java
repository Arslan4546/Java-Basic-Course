
import java.rmi.StubNotFoundException;

  //this is a simple program to explain Encapsulation conecept through getter and setter 
  
  
//   class  Encapsulation {

    
//     private int  empId;//thats means data hiding

//     public void SetEmpId(int emp1){ // setter 

//         empId = emp1;
//     }
//     public int getEmpId(){ // getter 
//         return  empId;
//     }

// }

// class  Data{

//     public static void main(String[] args) {
//         Encapsulation emp = new Encapsulation();
//         emp.SetEmpId(2);
//         System.out.println(emp.getEmpId());
//     }
// }



// another example


//   public class Person {
//     private String name; // private = restricted access
  
//     // Getter
//     public String getName() {
//       return name;
//     }
  
//     // Setter
//     public void setName(String newName) {
//       this.name = newName;
//     }
//   }

//   public class Main {
//     public static void main(String[] args) {
//       Person myObj = new Person();
//       myObj.name = "John";  // error
//       System.out.println(myObj.name); // error 
//     }
//   }

  //the above throws an error

//   public class Main {
//     public static void main(String[] args) {
//       Person myObj = new Person();
//       myObj.setName("John"); // Set the value of the name variable to "John"
//       System.out.println(myObj.getName());
//     }
//   }
  
  // but this will not show an error because this is perfact way to view and modifly the private variables in the class   



// Another Example 

// small balanceanking System

  // class  MainClass {

  //   public static void main(String[] args) {
  //     BankAccount bankAccount = new BankAccount();
  //     bankAccount.deposit(1000);
  //     System.out.println(bankAccount.getBalance());
  //     bankAccount.withdraw(500);
  //     System.out.println(bankAccount.getBalance());
  //   }
  // }
  
  //   class BankAccount {
  //     private double balance;
  
  //     public double getBalance() {
  //         return balance;
  //     }
  
  //     public void deposit(double amount) {
  //         if (amount > 0) {
  //             balance += amount;
  //         }
  //     }
  
  //     public void withdraw(double amount) {
  //         if (amount > 0 && amount <= balance) {
  //             balance -= amount;
  //         } else {
  //             System.out.println("Insufficient balance");
  //         }
  //     }
  // }





  // Another program

  // simply setting roll no in the getter and setter

  // class Person {

  //  private  int age;

  //   int getAge(){

  //     return  age;
  //   }
  //   public void setAge(int age){

  //     if (age>0) {
  //       this.age= age;
        
  //     }
  //   }


  // }

  // class Student extends  Person {

  //   @Override 
  //   public void setAge(int age){

  //     if (age>=5) {

  //       super.setAge(age);

  //     }


  //   }
  // }

  // class  MainTest{
  //         public static void main(String[] args) {
  //           Student student = new Student();
  //           student.setAge(2);
  //           System.out.println(student.getAge());
  //           student.setAge(10);
  //           System.out.println(student.getAge());

  //         }

  // }
  
  
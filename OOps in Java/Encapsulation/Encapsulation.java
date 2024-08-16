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


// public class Person {
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
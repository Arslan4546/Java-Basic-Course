// Constructor Overloading in Java
// In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.

// Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.

// Example of Constructor Overloading
//Java program to overload constructors  

// class Student5{  

//     int id;  
//     String name;  
//     int age;  

//     //creating two arg constructor  
//     Student5(int i,String n){  

//     id = i;  
//     name = n;  

//     }  
//     //creating three arg constructor  
//     Student5(int i,String n,int a){  

//     id = i;  
//     name = n;  
//     age=a;  

//     }  

//     void display(){
        
//         System.out.println(id+" "+name+" "+age);
    
//     }  
   
//     public static void main(String args[]){  

//     Student5 s1 = new Student5(111,"Karan");  

//     Student5 s2 = new Student5(222,"Aryan",25);  

//     s1.display();  
//     s2.display();  

//    }  
// }  


// Output:

// 111 Karan 0
// 222 Aryan 25



//Another Example 



// public class student {

//     int rollNo;
//     String name;
//     double fee;

//     student(){
//         this.rollNo=123;
//         this.name="Ali";
//         this.fee=2000.00;
//     }

//      student(int rollNo, String name, double fee) {
//         this.rollNo = rollNo;
//         this.name = name;
//         this.fee = fee;
//     }
//      student( String name, double fee) {
        
//         this.name = name;
//         this.fee = fee;
//     }
//      student(int rollNo, String name) {
//         this.rollNo = rollNo;
//         this.name = name;
//     }


//     this is the built-in method in java to return any string value
//     @Override
//     public String toString() {
        
//         return "name : "+this.name+" Roll Number :"+this.rollNo+"  Fee : "+this.fee;

//     }


//     public static void main(String[] args) {
//         student s =new student(123,"Arslan",12);
//         System.out.println(s);
        
//     }
   

    
    
// }

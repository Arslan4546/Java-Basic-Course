// class Copy {
//     int a;
//     String b;

//     // Default constructor
//     Copy() {
//         this.a = 10;
//         this.b = "Arslan is the best Student Ever";
//         System.out.println(a + " " + b);
//     }

//     // Copy constructor
//     Copy(Copy ref) {
//         this.a = ref.a;
//         this.b = ref.b;
//         System.out.println(a + " " + b);
//     }
// }

// class C {
//     public static void main(String[] args) {
//         Copy obj = new Copy();    // Calls the default constructor
//         Copy obj1 = new Copy(obj); // Calls the copy constructor
//     }
// }




// Another Example



// Java Copy Constructor:

// There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.


// There are many ways to copy the values of one object into another in Java. They are:

// 1. By constructor
// 2. By assigning the values of one object into another
// 3. By clone() method of Object class

//In this example, we are going to copy the values of one object into another using Java constructor.

//Java program to initialize the values from one object to another object.


// class Student{  
//     int id;  
//     String name;  
//     //constructor to initialize integer and string  
//     Student(int i,String n){  
//     id = i;  
//     name = n;  
//     }  
//     //constructor to initialize another object  
//     Student(Student s){  
//     id = s.id;  
//     name =s.name;  
//     }  
//     void display(){
        
//         System.out.println(id+" "+name);
//     }  
   
//     public static void main(String args[]){  
//     Student s1 = new Student(111,"Karan");  
//     Student s2 = new Student(s1);  
//     s1.display();  
//     s2.display();  
//    }  
// }  

// Output:

// 111 Karan
// 111 Karan

// This program uses data shadowing where the local parameter name hides the instance variable name, and object reference passing to access the fields of an object passed as a parameter to the method.


// class dataShadow{

//     String name = "Arslan";
  
//     void  OutPut(String name , dataShadow n){

//         System.out.println(name);
//         System.out.println(n.name);
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         dataShadow a = new dataShadow();
//         a.OutPut("Rizwan", a);
//     }
// }


class dataShadow{

    String name = "Arslan";
  
    void  OutPut(String name){// local variable

        System.out.println(name);
   
    }
}

class Test{
    public static void main(String[] args) {
        dataShadow a = new dataShadow();
        a.OutPut("Rizwan");
    }
}















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




//create constructor of a class and declare & initialize a variable into that and access it by creating object of that class and print it 
// Create a Main class
public class Main {
    int x;  // Create a class attribute
  
    // Create a class constructor for the Main class
    public Main() {
      x = 5;  // Set the initial value for the class attribute x
    }
  
    public static void main(String[] args) {
      Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
      System.out.println(myObj.x); // Print the value of x
    }
  }
  




//parameterized constructor

  //Constructors can also take parameters, which is used to initialize attributes.

//The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:
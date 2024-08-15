import java.util.Scanner;

public class functionex {

    // public static void findFactorial(int n) {
    //     // Removed the input prompt from here
        
    //     if (n <= 0) {
    //         System.out.println("Factorial is not defined for non-positive integers.");
    //         return;
    //     }

    //     int factorial = 1;
    //     for (int i = n; i >= 1; i--) {
    //         factorial = factorial * i;
    //     }
    //     System.out.println("The factorial of your number is: " + factorial);
    // }
  public  static  int sum(int a , int b ){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input prompt moved here
        System.out.println("Enter your first Number:");
        int number1 = sc.nextInt();
        System.out.println("Enter your second Number:");
        int number2 = sc.nextInt();
      //  findFactorial(number);
      int result = sum(number1,number2);
           System.out.println("The sum of two numbe is:" + result);
        // Close the scanner
        sc.close();
    }
}


import java.util.Scanner;

class  conditionalOperators{

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your Marks here: ");
     int marks = sc.nextInt(); 

      boolean isPassed = (marks<30) ?  false : true;

      System.out.println("According to your marks your result is : "+ isPassed);

    }
}
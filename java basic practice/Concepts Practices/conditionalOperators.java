import java.util.Scanner;  // Import the Scanner class to read input

class conditionalOperators {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their marks
        System.out.println("Enter your Marks here: ");
        
        // Read the user's input and store it in the 'marks' variable
        int marks = sc.nextInt(); 

        // Use a ternary operator to check if the marks are less than 30
        // If marks are less than 30, set isPassed to false, otherwise set it to true
        boolean isPassed = (marks < 30) ? false : true;

        // Display the result based on the user's marks
        System.out.println("According to your marks your result is: " + isPassed);
    }
}

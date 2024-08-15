import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        // Prompt the user to enter the number of columns
        System.out.println("Enter the number of cols: ");
        int cols = sc.nextInt();

        // Declare and initialize a 2D array with the specified number of rows and columns
        int arra[][] = new int[rows][cols];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arra[i][j] = sc.nextInt();  // Read each element of the array
            }
        }

        // Display the array that the user entered
        System.out.println("The array you entered is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arra[i][j] + " ");  // Print each element of the array
            }
            System.out.println();  // Move to the next line after each row
        }

        // Prompt the user to enter the number they want to find in the array
        System.out.println("Enter the number you want to find index: ");
        int x = sc.nextInt();

        // Search for the number in the array and print its index if found
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arra[i][j] == x) {  // If the number is found
                    System.out.println("The index of the number is: " + "(" + i + "," + j + ")");
                }
            }
        }
    }
}

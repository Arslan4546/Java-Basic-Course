import java.util.Scanner;

public class SingleArray {  // Class name should start with an uppercase letter by convention

    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter the length of the array
        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();  // Store the length of the array
        
        // Create an array of the specified size
        int arr[] = new int[size];
        
        // Take input for each element of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();  // Store each input in the array
        }
        
        // Ask the user to enter the number they want to find the index of
        System.out.println("Enter the number you want to find the index of: ");
        int x = sc.nextInt();  // Store the number to be searched
        
        // Iterate through the array to find the index of the number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {  // If the number is found
                System.out.println("The index of your number is: " + i);  // Print the index
            }
        }
        
        sc.close();  // Close the scanner to prevent resource leaks
    }
}

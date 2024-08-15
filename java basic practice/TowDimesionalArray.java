
import java.util.Scanner;

public class TowDimesionalArray {
   
    public static void main(String[] args) {

        
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols: ");
         int cols = sc.nextInt();
         int arra[][] = new  int[rows][cols];
        System.out.println("Enter the elements of array: ");
for (int i = 0; i <rows; i++) {

    for (int j = 0; j <cols; j++) {

        arra[i][j] = sc.nextInt();
       
              
          }
   
}
System.out.println("The array you entered is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arra[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }

System.out.println("Enter the number you want find index: ");
int x = sc.nextInt();

for (int i = 0; i <rows; i++) {

    for (int j = 0; j <cols; j++) {
if (arra[i][j]==x) {

    System.out.println("Your Index of this Number is : " + "(" + i + "," + j+  ")");
    
}


          }
         
         
}



    }
}

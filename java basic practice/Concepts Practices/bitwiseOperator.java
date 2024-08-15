public class bitwiseOperator {
   public static void main(String[] args) {
      // Initialize two integer variables
      int a = 3, b = 6;

      // Perform bitwise AND operation between 'a' and 'b'
      System.out.println("AND " + (a & b)); // Output: 2 (binary 0010)

      // Perform bitwise OR operation between 'a' and 'b'
      System.out.println("OR " + (a | b)); // Output: 7 (binary 0111)

      // Perform bitwise XOR operation between 'a' and 'b'
      System.out.println("XOR " + (a ^ b)); // Output: 5 (binary 0101)

      // Perform bitwise complement operation on 'a'
      System.out.println("Compliment " + (~a)); // Output: -4 (binary ...11111100)
   }
}

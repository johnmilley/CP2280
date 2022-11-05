// Exercise 2.25 Solution: OddEven.java
// Program that determines if a number is odd or even.
import java.util.Scanner;

public class OddEven {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter integer: "); // prompt for input
      int number = input.nextInt(); // read number

      if (number % 2 == 0) {
         System.out.println("Number is even");
      }

      if (number % 2 != 0) {
         System.out.println("Number is odd");
      }
   } // end main
} // end class OddEven


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

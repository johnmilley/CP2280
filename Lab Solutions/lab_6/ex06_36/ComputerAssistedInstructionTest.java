// Exercise 6.36 Solution: ComputerAssistedInstructionTest.java
// Test application for class Multiply
import java.util.Scanner;

public class ComputerAssistedInstructionTest {
   public static void main(String[] args) {
      ComputerAssistedInstruction application = new ComputerAssistedInstruction();
      Scanner input = new Scanner(System.in);

      application.createQuestion(); // display the first question

      System.out.print("Enter your answer (-1 to exit): ");
      int guess = input.nextInt();

      while (guess != -1) {
         application.checkResponse(guess);
         
         System.out.print("Enter your answer (-1 to exit): ");
         guess = input.nextInt();
      }
   }  
}


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

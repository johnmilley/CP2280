// Exercise 5.16 Solution: Graphs.java
// Program prints 5 histograms with lengths determined by user.
import java.util.Scanner;

public class Graphs {
   // draws 5 histograms
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter number: ");
      int number1 = input.nextInt();
      System.out.print("Enter number: ");
      int number2 = input.nextInt(); 
      System.out.print("Enter number: ");
      int number3 = input.nextInt();
      System.out.print("Enter number: ");
      int number4 = input.nextInt(); 
      System.out.print("Enter number: ");
      int number5 = input.nextInt(); 

      int value = 0; // number of stars to print

      // print histograms
      for (int counter = 1; counter <= 5; counter++) {
         switch (counter) {
            case 1:
               value = number1;
               break; 
            case 2:
               value = number2;
               break;
            case 3:
               value = number3;
               break;
            case 4:
               value = number4;
               break; 
            case 5:
               value = number5;
               break; 
         } 

         for (int j = 1; j <= value; j++) {
            System.out.print("*");
         }
         
         System.out.println();         
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

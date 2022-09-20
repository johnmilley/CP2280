// Fig. 2.1: Welcome1.java
// Text-printing program.
import java.util.Scanner;

public class Week2Chapter2 {
    // main method begins execution of Java application
    public static void main(String[] args) {

      // Print statements
      System.out.print("Welcome to Java Programming!");
      System.out.println("Welcome to Java Programming!");
      System.out.println("Welcome to Java Programming!");
      System.out.printf("This is a %s string.", "formatted");

      // We must explicity declare the data type we are assigning to a variable 
      byte mySmallNumber = 10;
      int myNum = 5;               // Integer (whole number)
      float myFloatNum = 5.99f;    // Floating point number
      double myDouble = 5.99;      // Double (!!use this for most decimals!!)
      char myLetter = 'D';         // Character (single quotes used only for characters)
      boolean myBool = true;       // Boolean
      String myText = "Hello";     // String

      System.out.println(myDouble);

      // Getting User Input (Scanner)
      // 1. import java.util.Scanner (imports go at the top of the file)
      // 2. Create Scanner object
      // 3. Write a prompt using System.out.print
      // 4. Use appropriate method of Scanner (nextLine(), nextInt(), etc.) to
      //      get data from user and store in a variable.
   
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String firstName = input.nextLine();
      System.out.print("Enter your age: ");
      int age = input.nextInt();
      input.close();

      /*** Formatting Codes ***/
      // %c character
      // %d decimal (integer) number (base 10)
      // %e exponential floating-point number
      // %f floating-point number
      // %i integer (base 10)
      // %n newline
      // %o octal number (base 8)
      // %s String
      // %u unsigned decimal (integer) number
      // %x number in hexadecimal (base 16)
      // %t formats date/time
      // %% print a percent sign
      // \% print a percent sign

      System.out.printf("%s is %d years old.%n%n%n", firstName, age);

    } // end method main
 } // end class Welcome1
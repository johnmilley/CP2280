/* Exercise 4.21: Largest Int */

import java.util.Scanner;


public class EX421 {
    public static void main(String[] args) {

        System.out.println("---- Largest ----\n");
        
        Scanner input = new Scanner(System.in);
        
        int counter = 0;
        int number = 0;
        int largest = 0;

        while (counter < 10) {
            System.out.print("Number of units sold: ");
            number = input.nextInt();    

            if (number > largest) {
                largest = number;
            }

            counter++;
        }
        
        System.out.printf("%nMost units sold: %d%n", largest);
        
        System.out.println("\n---- End Output ----\n");
    }
}
/* Exercise 4.17: KM per Litre */

import java.util.Scanner;

public class EX417 {
    public static void main(String[] args) {
        System.out.println("---- Exercise 4.17 ----\n");
        
        Scanner input = new Scanner(System.in);

        // initialize totals
        int totalKM = 0;
        int totalLitres = 0;

        System.out.print("\nEnter km (Enter -1 to exit): ");
        int km = input.nextInt();
        
        while (km != -1) {
            System.out.print("\nEnter litres: ");
            int litres = input.nextInt();
            
            totalKM += km;
            totalLitres += litres;
            
            double kmPerLitre = (double) km / litres;
            System.out.printf("%nKilometres per liter: %.2f", kmPerLitre);
            
            double totalKMPerLitre = (double) totalKM / totalLitres;
            System.out.printf("%nTotal kilometres per liter: %.2f%n", totalKMPerLitre);
            
            System.out.print("\nEnter km (Enter -1 to exit): ");
            km = input.nextInt();
        }
    
        System.out.println("\n---- End Output ----\n");

    }
}
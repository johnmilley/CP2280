public class InvoiceTest {
    public static void main(String[] args) {
        
        System.out.println("---- InvoiceTest1 ----\n");
        
        Invoice i1 = new Invoice("132421AB", "PS5 Disc Console", 23, 699.99);

        System.out.println("Part Number: " + i1.getPartNumber());
        System.out.println("Part Description: " + i1.getPartDesc());
        System.out.println("Quantity: " + i1.getQuantity());
        System.out.printf("Price Per Item: $%.2f%n", i1.getPricePerItem());
        System.out.printf("Invoice: $%.2f",i1.getInvoiceAmount());

        System.out.println("\n---- End Output ----\n");
        
        System.out.println("---- InvoiceTest2 ----\n");
        
        Invoice i2 = new Invoice("2515161", "The Last of Us: Part I (PS5)", -10, 79.99);

        System.out.println("Part Number: " + i2.getPartNumber());
        System.out.println("Part Description: " + i2.getPartDesc());
        System.out.println("Quantity: " + i2.getQuantity());
        System.out.printf("Price Per Item: $%.2f%n", i2.getPricePerItem());
        System.out.printf("Invoice: $%.2f", i2.getInvoiceAmount());

        System.out.println("\n---- End Output ---\n");

    }
}

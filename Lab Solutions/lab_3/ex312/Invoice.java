// 3.12(InvoiceClass)CreateaclasscalledInvoicethatahardware store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of information as instance variables—a part number (type String), a part description (type String), a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item),
  
// then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.

public class Invoice {

    /* Instance Variables */
    private String partNumber;
    private String partDesc;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDesc, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDesc = partDesc;

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            quantity = 0;
        }

        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    /* Methods */

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
    
    // Getters and Setters
    
    public double getPricePerItem() {
        return pricePerItem;
    }
    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantiy) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            quantity = 0;
        }
    }
    
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    
    public String getPartDesc() {
        return partDesc;
    }
    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }
}
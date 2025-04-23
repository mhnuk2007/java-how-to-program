package chapter3.exercises;

/*
    3.12 (Invoice Class) Create a class called Invoice that a hardware store might use
    to represent an invoice for an item sold at the store. An Invoice should include four
    pieces of information as instance variables—a part number (type String), a part description
    (type String), a quantity of the item being purchased (type int) and a price per item
    (double). Your class should have a constructor that initializes the four instance
    variables. Provide a set and a get method for each instance variable. In addition,
    provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
    multiplies the quantity by the price per item), then returns the amount as a double
    value. If the quantity is not positive, it should be set to 0. If the price per item
    is not positive, it should be set to 0.0. Write a test app named InvoiceTest that
    demonstrates class Invoice’s capabilities.
 */
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor to initialize instance variables
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);           // Validated via setter
        setPricePerItem(pricePerItem);   // Validated via setter
    }

    // Setter and Getter for partNumber
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    // Setter and Getter for partDescription
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    // Setter and Getter for quantity with validation
    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter and Getter for pricePerItem with validation
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem > 0.0) ? pricePerItem : 0.0;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // Method to calculate and return total invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

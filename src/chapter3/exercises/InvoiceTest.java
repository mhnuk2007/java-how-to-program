package chapter3.exercises;

/**
 * Test class for Invoice.
 */
public class InvoiceTest {
    public static void main(String[] args) {

        // Creating Invoice object with sample data
        Invoice invoice1 = new Invoice("P001", "Hammer", 3, 19.99);

        // Display invoice details
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Part Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per Item: $" + invoice1.getPricePerItem());
        System.out.println("Total Invoice Amount: $" + invoice1.getInvoiceAmount());

        System.out.println("\n--- Testing with invalid values ---");
        // Test with invalid quantity and price
        invoice1.setQuantity(-5);
        invoice1.setPricePerItem(-10.0);

        System.out.println("Updated Quantity: " + invoice1.getQuantity());
        System.out.println("Updated Price per Item: $" + invoice1.getPricePerItem());
        System.out.println("Updated Total Invoice Amount: $" + invoice1.getInvoiceAmount());
    }
}

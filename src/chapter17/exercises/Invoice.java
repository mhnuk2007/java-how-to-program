package chapter17.exercises;
/*
Exercise: 17.11
Given an array of Invoice objects with fields: part number, part description, quantity, and price:
    a. How can you sort the invoices by part description using streams and lambdas?
    b. How can you sort the invoices by price?
    c. How can you map each invoice to its part description and quantity, then sort by quantity?
    d. How can you map each invoice to its part description and invoice value (quantity × price), then sort by invoice value?
    e. How can you filter the results from part (4) to show only invoice values between $200 and $500?
 */

public class Invoice {
    private int partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(int partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public int getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // For easy display
    @Override
    public String toString() {
        return String.format("%-5d %-20s %5d %10.2f", 
                partNumber, partDescription, quantity, price);
    }
}

package chapter10.exercises.AccountsPayable_10_16;

public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public String getPartNumber() { return partNumber; }
    public String getPartDescription() { return partDescription; }

    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Quantity must be >= 0");
        this.quantity = quantity;
    }

    public int getQuantity() { return quantity; }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0.0) throw new IllegalArgumentException("Price must be >= 0");
        this.pricePerItem = pricePerItem;
    }

    public double getPricePerItem() { return pricePerItem; }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }

    @Override
    public String toString() {
        return String.format("Invoice:%nPart #: %s (%s)%nQuantity: %d%nPrice per item: $%.2f",
                getPartNumber(), getPartDescription(), getQuantity(), getPricePerItem());
    }
}

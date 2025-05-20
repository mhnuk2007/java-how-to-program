package chapter10.exercises.payablehierarchy;

public class CommissionEmployee extends Employee {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    public CommissionEmployee(String firstName, String lastName, String ssn, Date birthDate,
                              double sales, double rate) {
        super(firstName, lastName, ssn, birthDate);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales) {
        if (sales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = sales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        if (rate <= 0.0 || rate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = rate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double getPaymentAmount() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("commission employee: %s%ngross sales: $%.2f; commission rate: %.2f",
                super.toString(), getGrossSales(), getCommissionRate());
    }
}

package chapter10.exercises.AccountsPayable_10_16;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate) {
        super(firstName, lastName, ssn);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales) {
        if (sales < 0.0) throw new IllegalArgumentException("Sales must be >= 0");
        this.grossSales = sales;
    }

    public void setCommissionRate(double rate) {
        if (rate <= 0.0 || rate >= 1.0) throw new IllegalArgumentException("Rate must be > 0 and < 1");
        this.commissionRate = rate;
    }

    public double getGrossSales() { return grossSales; }
    public double getCommissionRate() { return commissionRate; }

    @Override
    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString() {
        return String.format("Commission Employee: %s%nGross Sales: $%.2f; Commission Rate: %.2f", 
                super.toString(), getGrossSales(), getCommissionRate());
    }
}

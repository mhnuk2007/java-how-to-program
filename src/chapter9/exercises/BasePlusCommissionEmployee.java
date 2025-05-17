package chapter9.exercises;
/*
Exercise: 9.3 (Using Composition Rather Than Inheritance) Many programs written with inheritance
could be written with composition instead, and vice versa. Rewrite class BasePlusCommissionEmployee (Fig. 9.11) of the CommissionEmployee–BasePlusCommissionEmployee hierarchy to use
composition rather than inheritance.
 */

public class BasePlusCommissionEmployee {
    private CommissionEmployee commissionEmployee;
    private double baseSalary; // base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {
        commissionEmployee = new CommissionEmployee(firstName, lastName,
                socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return baseSalary + commissionEmployee.earnings();
    }

    public String getFirstName() {
        return commissionEmployee.getFirstName();
    }

    public String getLastName() {
        return commissionEmployee.getLastName();
    }

    public String getSocialSecurityNumber() {
        return commissionEmployee.getSocialSecurityNumber();
    }

    public double getGrossSales() {
        return commissionEmployee.getGrossSales();
    }

    public void setGrossSales(double grossSales) {
        commissionEmployee.setGrossSales(grossSales);
    }

    public double getCommissionRate() {
        return commissionEmployee.getCommissionRate();
    }

    public void setCommissionRate(double commissionRate) {
        commissionEmployee.setCommissionRate(commissionRate);
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                commissionEmployee.toString(), "base salary", getBaseSalary());
    }
}

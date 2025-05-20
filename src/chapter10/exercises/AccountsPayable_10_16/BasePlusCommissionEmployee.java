package chapter10.exercises.AccountsPayable_10_16;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn,
                                      double sales, double rate, double salary) {
        super(firstName, lastName, ssn, sales, rate);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double salary) {
        if (salary < 0.0) throw new IllegalArgumentException("Base salary must be >= 0");
        this.baseSalary = salary;
    }

    public double getBaseSalary() { return baseSalary; }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("Base-Salaried %s%nBase Salary: $%.2f", 
                super.toString(), getBaseSalary());
    }
}

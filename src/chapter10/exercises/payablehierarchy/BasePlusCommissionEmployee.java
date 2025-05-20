package chapter10.exercises.payablehierarchy;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, Date birthDate,
                                      double sales, double rate, double salary) {
        super(firstName, lastName, ssn, birthDate, sales, rate);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double salary) {
        if (salary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double getPaymentAmount() {
        return getBaseSalary() + super.getPaymentAmount();
    }

    @Override
    public String toString() {
        return String.format("base-salaried commission employee: %s%nbase salary: $%.2f",
                super.toString(), getBaseSalary());
    }
}

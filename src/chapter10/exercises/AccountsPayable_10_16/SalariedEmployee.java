package chapter10.exercises.AccountsPayable_10_16;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        setWeeklySalary(weeklySalary);
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) throw new IllegalArgumentException("Salary must be >= 0");
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() { return weeklySalary; }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("Salaried Employee: %s%nWeekly Salary: $%.2f", super.toString(), getWeeklySalary());
    }
}

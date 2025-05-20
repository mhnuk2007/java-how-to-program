package chapter10.exercises.payablehierarchy;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, Date birthDate, double salary) {
        super(firstName, lastName, ssn, birthDate);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        if (salary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        weeklySalary = salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s%nweekly salary: $%.2f",
                super.toString(), getWeeklySalary());
    }
}

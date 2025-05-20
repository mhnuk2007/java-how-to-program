package chapter10.exercises.payablehierarchy;

public class HourlyEmployee extends Employee {
    private double wage;  // wage per hour
    private double hours; // hours worked for the week

    public HourlyEmployee(String firstName, String lastName, String ssn, Date birthDate,
                          double wage, double hours) {
        super(firstName, lastName, ssn, birthDate);
        setWage(wage);
        setHours(hours);
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)) {
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        }
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double getPaymentAmount() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%nhourly wage: $%.2f; hours worked: %.2f",
                super.toString(), getWage(), getHours());
    }
}

package chapter10.exercises.AccountsPayable_10_16;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);
        setWage(wage);
        setHours(hours);
    }

    public void setWage(double wage) {
        if (wage < 0.0) throw new IllegalArgumentException("Wage must be >= 0");
        this.wage = wage;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) throw new IllegalArgumentException("Hours must be 0-168");
        this.hours = hours;
    }

    public double getWage() { return wage; }
    public double getHours() { return hours; }

    @Override
    public double earnings() {
        return hours <= 40 ? wage * hours : 40 * wage + (hours - 40) * wage * 1.5;
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: %s%nHourly Wage: $%.2f; Hours Worked: %.2f", 
                super.toString(), getWage(), getHours());
    }
}

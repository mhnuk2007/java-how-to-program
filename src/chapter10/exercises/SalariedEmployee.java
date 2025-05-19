package chapter10.exercises;
/*
Exercise: 10.12 (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include private instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an employee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
Create an array of Employee variables to store references to the various employee objects. In a loop,
calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
payroll amount if the current month is the one in which the Employee’s birthday occurs.
 */


public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName,
                            String socialSecurityNumber, Date birthDate, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        this.weeklySalary = weeklySalary;
    }

    // set salary
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
        this.weeklySalary = weeklySalary;
    }

    // return salary
    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() { return weeklySalary; }

    // return String representation of SalariedEmployee object
    @Override
    public String toString()
    {
        return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}

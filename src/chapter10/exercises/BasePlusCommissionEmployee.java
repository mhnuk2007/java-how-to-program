package chapter10.exercises;
/*
Exercise: 10.12 (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include private instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an employee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
Create an array of Employee variables to store references to the various employee objects. In a loop,
calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
payroll amount if the current month is the one in which the Employee’s birthday occurs.
 */

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week

    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, Date birthDate,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, birthDate, grossSales, commissionRate);
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

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("base-salaried %s%nbase salary: $%,.2f",
                super.toString(), getBaseSalary());
    }
}

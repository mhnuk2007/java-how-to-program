package chapter9.exercises;
/*
9.15 (Creating a New Subclass of Employee) Other types of Employees might include SalariedEmployees who get paid a fixed weekly salary, PieceWorkers who get paid by the number of pieces
they produce or HourlyEmployees who get paid an hourly wage with time-and-a-half—1.5 times the
hourly wage—for hours worked over 40 hours.
Create class HourlyEmployee that inherits from class Employee (Exercise 9.14) and has
instance variable hours (a double) that represents the hours worked, instance variable wage (a double) that represents the wages per hour, a constructor that takes as arguments a first name, a last
name, a social security number, an hourly wage and the number of hours worked, set and get methods for manipulating the hours and wage, an earnings method to calculate an HourlyEmployee’s
earnings based on the hours worked and a toString method that returns the HourlyEmployee’s
String representation. Method setWage should ensure that wage is nonnegative, and setHours
should ensure that the value of hours is between 0 and 168 (the total number of hours in a week).
Use class HourlyEmployee in a test program that’s similar to the one in Fig. 9.5.
 */

public class HourlyEmployee_9_15 extends Employee_9_14 {
    private double wage;  // wage per hour
    private double hours; // hours worked for the week

    public HourlyEmployee_9_15(String firstName, String lastName,
                               String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
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
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must be between 0.0 and 168.0");
        }
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public double earnings() {
        if (hours <= 40)
            return wage * hours;
        else
            return 40 * wage + (hours - 40) * wage * 1.5;
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%.2f; %s: %.2f",
                super.toString(), "hourly wage", getWage(), "hours worked", getHours());
    }
}

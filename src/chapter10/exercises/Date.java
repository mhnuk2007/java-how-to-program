package chapter10.exercises;
/*
Exercise: 10.12 (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include private instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an employee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
Create an array of Employee variables to store references to the various employee objects. In a loop,
calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
payroll amount if the current month is the one in which the Employee’s birthday occurs.
 */

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("Month must be 1–12");
        if (day <= 0 || day > 31)
            throw new IllegalArgumentException("Day must be 1–31");
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() { return month; }
    public int getDay() { return day; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}

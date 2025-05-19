package chapter10.exercises;
/*
Exercise: 10.12 (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include private instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an employee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
Create an array of Employee variables to store references to the various employee objects. In a loop,
calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
payroll amount if the current month is the one in which the Employee’s birthday occurs.
 */

import java.util.Calendar;

public class PayrollTest {
    public static void main(String[] args) {
        // Current month (1–12)
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;

        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("John", "Smith", "111-11-1111",
                new Date(5, 15, 1990), 800.00);

        employees[1] = new HourlyEmployee("Karen", "Price", "222-22-2222",
                new Date(6, 20, 1985), 16.75, 40);

        employees[2] = new CommissionEmployee("Sue", "Jones", "333-33-3333",
                new Date(5, 10, 1992), 10000, 0.06);

        employees[3] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",
                new Date(12, 25, 1980), 5000, 0.04, 300);

        System.out.printf("Payroll Processing for Month %d:%n%n", currentMonth);

        for (Employee emp : employees) {
            System.out.println(emp); // calls toString

            double earnings = emp.earnings();
            if (emp.getBirthDate().getMonth() == currentMonth) {
                System.out.println("Happy Birthday! Bonus added: $100.00");
                earnings += 100.00;
            }

            System.out.printf("Earned: $%,.2f%n%n", earnings);
        }
    }
}

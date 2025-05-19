package chapter10.exercises;
/*
Exercise: 10.14 (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include an
additional Employee subclass PieceWorker that represents an employee whose pay is based on the
number of pieces of merchandise produced. Class PieceWorker should contain private instance
variables wage (to store the employee’s wage per piece) and pieces (to store the number of pieces
produced). Provide a concrete implementation of method earnings in class PieceWorker that calculates the employee’s earnings by multiplying the number of pieces produced by the wage per
piece. Create an array of Employee variables to store references to objects of each concrete class in
the new Employee hierarchy. For each Employee, display its String representation and earnings. */

import java.util.Calendar;

public class PayrollTestModified {
    public static void main(String[] args) {
        // Current month (1–12)
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;

        Employee[] employees = new Employee[5];

        employees[0] = new SalariedEmployee("John", "Smith", "111-11-1111",
                new Date(5, 15, 1990), 800.00);

        employees[1] = new HourlyEmployee("Karen", "Price", "222-22-2222",
                new Date(6, 20, 1985), 16.75, 40);

        employees[2] = new CommissionEmployee("Sue", "Jones", "333-33-3333",
                new Date(5, 10, 1992), 10000, 0.06);

        employees[3] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",
                new Date(12, 25, 1980), 5000, 0.04, 300);

        employees[4] = new PieceWorker("Alice", "Cooper", "555-55-5555",
                new Date(5, 19, 1988), 25.0, 150); // New employee

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

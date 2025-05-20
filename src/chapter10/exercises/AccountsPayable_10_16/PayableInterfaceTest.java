package chapter10.exercises.AccountsPayable_10_16;
/*
Exercise: 10.16 (Accounts Payable System Modification) It’s possible to include the functionality of the payroll application (Figs. 10.4–10.9) in the accounts payable application without modifying Employee
subclasses SalariedEmployee, HourlyEmployee, CommissionEmployee or BasePlusCommissionEmployee. To do so, you can modify class Employee (Fig. 10.4) to implement interface Payable and
declare method getPaymentAmount to invoke method earnings. Method getPaymentAmount would
then be inherited by the subclasses in the Employee hierarchy. When getPaymentAmount is called for
a particular subclass object, it polymorphically invokes the appropriate earnings method for that
subclass. Reimplement Exercise 10.15 using the original Employee hierarchy from the payroll application of Figs. 10.4–10.9. Modify class Employee as described in this exercise, and do not modify any
of class Employee’s subclasses.
 */

public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[] {
            new Invoice("01234", "Seat", 2, 375.00),
            new Invoice("56789", "Tire", 4, 79.95),
            new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
            new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40),
            new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06),
            new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300)
        };

        System.out.println("Invoices and Employees processed polymorphically:\n");

        for (Payable currentPayable : payableObjects) {
            System.out.println(currentPayable);
            System.out.printf("Payment Due: $%.2f%n%n", currentPayable.getPaymentAmount());
        }
    }
}

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

public interface Payable {
    double getPaymentAmount(); // calculate payment
}

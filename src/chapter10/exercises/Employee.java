package chapter10.exercises;
/*
Exercise: 10.12 (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include private instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an employee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
Create an array of Employee variables to store references to the various employee objects. In a loop,
calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
payroll amount if the current month is the one in which the Employee’s birthday occurs.
 */

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;

    public Employee(String firstName, String lastName,
                    String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }
    public Date getBirthDate() { return birthDate; }

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s%nbirth date: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
    }

    // abstract method must be overridden by concrete subclasses
    public abstract double earnings(); // no implementation here
}

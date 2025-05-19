package chapter10.examples;
// Fig. 10.13: Employee.java
// Employee abstract superclass that implements Payable.

public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    } // end constructor

    // return first name
    public String getFirstName() {
        return firstName;
    }

    // return last name
    public String getLastName() {
        return lastName;
    }

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // return String representation of Employee object
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    public double earnings() { // added to avoid errors
        return 0.0;
    }

    // Note: We do not implement Payable method getPaymentAmount here so
    // this class must be declared abstract to avoid a compilation error.
} // end abstract class Employee

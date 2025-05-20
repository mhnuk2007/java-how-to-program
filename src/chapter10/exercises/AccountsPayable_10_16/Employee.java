package chapter10.exercises.AccountsPayable_10_16;

public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }

    public abstract double earnings(); // abstract

    @Override
    public double getPaymentAmount() {
        return earnings(); // now part of Payable
    }

    @Override
    public String toString() {
        return String.format("%s %s%nSSN: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}

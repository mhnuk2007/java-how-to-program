package chapter10.exercises.payablehierarchy;

public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;

    public Employee(String firstName, String lastName, String ssn, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
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

    // Now abstract method uses Payable interface method name
    @Override
    public abstract double getPaymentAmount();
}

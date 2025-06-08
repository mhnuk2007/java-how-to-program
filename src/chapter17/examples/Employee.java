package chapter17.examples;
// Fig. 17.9: Employee.java
// Employee class.

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private String department;

    // constructor
    public Employee(String firstName, String lastName, double salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    // set firstname
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // get firstname
    public String getFirstName() {
        return firstName;
    }

    // set lastname
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // get lastname
    public String getLastName() {
        return lastName;
    }

    // set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // get salary
    public double getSalary() {
        return salary;
    }

    // set department
    public void setDepartment(String department) {
        this.department = department;
    }

    // get department
    public String getDepartment() {
        return department;
    }

    // return Employee's first and last name combined
    public String getName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    // return a String containing the Employee's information
    @Override
    public String toString() {
        return String.format("%-8s %-8s %8.2f %s",
                getFirstName(), getLastName(), getSalary(), getDepartment());
    } // end method toString
} // end class Employee

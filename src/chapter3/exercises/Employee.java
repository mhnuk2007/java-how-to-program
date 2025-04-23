package chapter3.exercises;
/*
    3.13 (Employee Class) Create a class called Employee that includes three instance
    variables—a first name (type String), a last name (type String) and a monthly salary
    (double). Provide a constructor that initializes the three instance variables. Provide
    a set and a get method for each instance variable. If the monthly salary is not positive,
    do not set its value. Write a test app named EmployeeTest that demonstrates class Employee’s
    capabilities. Create two Employee objects and display each object’s yearly salary.
    Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to raise salary by a given percentage
    public void raiseSalary(double percent) {
        if (percent > 0) {
            monthlySalary += monthlySalary * percent / 100;
        }
    }
}

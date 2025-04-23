package chapter3.exercises;

// Test application for Employee class
public class EmployeeTest {
    public static void main(String[] args) {

        // Creating two Employee objects
        Employee emp1 = new Employee("Sunny", "Chauhan", 4000.0);
        Employee emp2 = new Employee("Honey", "Chauhan", 3000.0);

        // Display yearly salaries
        System.out.printf("%s %s yearly salary: $%.2f%n",
                emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());

        System.out.printf("%s %s yearly salary: $%.2f%n",
                emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());

        // Give 10% raise
        emp1.raiseSalary(10);
        emp2.raiseSalary(10);

        // Display yearly salaries after raise
        System.out.println("\nAfter 10% raise:");
        System.out.printf("%s %s yearly salary: $%.2f%n",
                emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());

        System.out.printf("%s %s yearly salary: $%.2f%n",
                emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
    }
}

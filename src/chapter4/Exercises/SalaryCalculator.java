package chapter4.Exercises;
/*
    4.20 (Salary Calculator) Develop a Java application that determines the gross pay for
    each of three employees. The company pays straight time for the first 40 hours worked
    by each employee and time and a half for all hours worked in excess of 40.
    You’re given a list of the employees, their number of hours worked last week and their
    hourly rates. Your program should input this information for each employee, then
    determine and display the employee’s gross pay. Use class Scanner to input the data.

 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grossPay, hoursWorked, rate, overTimeHours, overTimePay;
        int employeeCount = 1;

        while (employeeCount <= 3) {
            System.out.println("Employee Number: " + employeeCount);
            System.out.print("Enter hours worked: ");
            hoursWorked = input.nextDouble();

            System.out.print("Enter hourly rate: ");
            rate = input.nextDouble();

            if (hoursWorked <= 40) {
                grossPay = hoursWorked * rate;
            } else {
                overTimeHours = hoursWorked - 40;
                overTimePay = overTimeHours * (rate * 1.5);
                grossPay = 40 * rate + overTimePay;
            }
            System.out.printf("Gross pay: $%.2f%n", grossPay);
            employeeCount++;
        }
        input.close();
    }
}

package chapter4.Exercises;
/*
    4.37 (Factorial) The factorial of a nonnegative integer n is written as n!
    (pronounced “n factorial”) and is defined as follows
    n! = n · (n – 1) · (n – 2) · … · 1 (for values of n greater than or equal to 1) and
    n! = 1 (for n = 0)
    For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
        c) Write an application that computes the value of e^x by using the following formula.
        Allow the user to enter the number of terms to calculate.
                e^x = 1 + x/1! + x^2/2! + x^3/3! + … + x^n/n!
                (for values of n greater than or equal to 1)
 */


import java.util.Scanner;

public class CalculateExponential {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms to calculate: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive number of terms.");
            return;
        }
        System.out.println("Enter the value of x:");
        double x = input.nextDouble();
        double result = 1.0;
        double factorial = 1.0;
        double term = 1.0;
        int i = 1;
        while (i <= n) {
            term *= x / i;
            factorial *= i;
            result += term / factorial;
            i++;
        }
        System.out.println("The value of e^" + x + " is: " + result);
    }
}

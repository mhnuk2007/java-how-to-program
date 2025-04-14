package chapter4.Exercises;
/*
    4.37 (Factorial) The factorial of a nonnegative integer n is written as n!
    (pronounced “n factorial”) and is defined as follows
    n! = n · (n – 1) · (n – 2) · … · 1 (for values of n greater than or equal to 1) and
    n! = 1 (for n = 0)
    For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
        b) Write an application that estimates the value of the mathematical constant
        e by using the following formula. Allow the user to enter the number of terms
        to calculate.
 */

import java.util.Scanner;

public class CalculateEularConstant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms to calculate: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer");
            return;
        }

        double factorial = 1.0;
        double e = 1;
        int i = 1;
        while (i<=n){
            factorial *= i;
            e += 1/factorial;
            i++;
        }
        System.out.println("The value of e upto " + n + " terms is: " + e);
    }
}

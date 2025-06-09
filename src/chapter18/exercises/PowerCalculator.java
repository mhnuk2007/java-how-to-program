package chapter18.exercises;
/*
Exercise 18.9:
Write a recursive method power(base, exponent) to compute and return the value of
base^exponent using the relation:
base^exponent = base * base^(exponent - 1)
Assume the exponent is an integer ≥ 1. Also, create a program that takes user input
for base and exponent and displays the result.
 */

import java.util.Scanner;

public class PowerCalculator {

    // Recursive method to calculate base^exponent
    public static int power(int base, int exponent) {
        if (exponent == 1) {
            return base; // Base case
        } else {
            return base * power(base, exponent - 1); // Recursive step
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter base: ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent (>= 1): ");
        int exponent = scanner.nextInt();

        // Check for valid exponent
        if (exponent < 1) {
            System.out.println("Exponent must be greater than or equal to 1.");
        } else {
            int result = power(base, exponent);
            System.out.println(base + "^" + exponent + " = " + result);
        }

        scanner.close();
    }
}

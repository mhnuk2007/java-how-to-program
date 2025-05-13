package chapter6.exercises;

/*
    6.14 (Exponentiation) Write a method integerPower(base, exponent) that returns the
    value of base^exponent.
    For example, integerPower(3, 4) calculates 3^4 (or 3 * 3 * 3 * 3).
    Assume that exponent is a positive, nonzero integer and that base is an integer.
    Use a for or while statement to control the calculation.
    Do not use any Math class methods.
    Incorporate this method into an application that reads integer values for base and exponent
    and performs the calculation with the integerPower method.
 */

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner to get user input
        System.out.print("Enter the base: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        System.out.printf("%d^%d = %d%n", base, exponent, integerPower(base, exponent));
    }

    // Method to calculate base raised to the power of exponent
    public static int integerPower(int base, int exponent) {
        int result = 1;

        while (exponent > 0) {
            result *= base;
            exponent--;
        }

        return result;
    }
}

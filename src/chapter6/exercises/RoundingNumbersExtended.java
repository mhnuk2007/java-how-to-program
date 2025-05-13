package chapter6.exercises;
/*
    6.10 (Rounding Numbers) To round numbers to specific decimal places, use a statement
    like y = Math.floor(x * 10 + 0.5) / 10;
    which rounds x to the tenths position (i.e., the first position to the right of the
    decimal point), or y = Math.floor(x * 100 + 0.5) / 100;
    which rounds x to the hundredths position (i.e., the second position to the right of
    the decimal point).
    Write an application that defines four methods for rounding a number x in various ways:
    a) roundToInteger(number)
    b) roundToTenths(number)
    c) roundToHundredths(number)
    d) roundToThousandths(number)
    For each value read, your program should display the original value, the number
    rounded to the nearest integer, the number rounded to the nearest tenth, the number
    rounded to the nearest hundredth and the number rounded to the nearest thousandth.
 */

import java.util.Scanner;

public class RoundingNumbersExtended {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number(upto 5 decimal places): ");
        double number = input.nextDouble();

        System.out.printf("Original number: %.5f%n", number);
        System.out.printf("Rounded to nearest integer: %.0f%n", roundToInteger(number));
        System.out.printf("Rounded to nearest tenth: %.1f%n", roundToTenths(number));
        System.out.printf("Rounded to nearest hundredth: %.2f%n", roundToHundredths(number));
        System.out.printf("Rounded to nearest thousandth: %.3f%n", roundToThousandths(number));
    }

    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}
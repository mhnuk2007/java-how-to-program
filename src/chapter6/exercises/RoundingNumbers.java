package chapter6.exercises;
/*
    6.106.9 (Rounding Numbers) Math.floor can be used to round values to the nearest integer
    —e.g., y = Math.floor(x + 0.5); will round the number x to the nearest integer and
    assign the result to y. Write an application that reads double values and uses the
    preceding statement to round each of the numbers to the nearest integer. For each
    number processed, display both the original number and the rounded number.
 */

public class RoundingNumbers {
    public static void main(String[] args) {
        double num1 = 1.2;
        double num2 = 1.5;
        double num3 = 1.8;
        double num4 = 2.1;
        double num5 = 2.5;
        double num6 = 2.8;
        double num7 = -1.2;
        double num8 = -1.5;
        double num9 = -1.8;


        System.out.printf("Original number: %.1f, Rounded number: %.1f%n", num1, Math.floor(num1 + 0.5));
        System.out.printf("Original number: %.1f, Rounded number: %.1f%n", num2, Math.floor(num2 + 0.5));
        System.out.printf("Original number: %.1f, Rounded number: %.1f%n", num3, Math.floor(num3 + 0.5));
        System.out.printf("Original number: %.1f, Rounded number: %.1f%n", num4, Math.floor(num4 + 0.5));
        System.out.printf("Original number: %.1f, Rounded number: %.1f%n", num5, Math.floor(num5 + 0.5));
        System.out.printf("Original number: %.1f, Rounded number: %.1f%n", num6, Math.floor(num6 + 0.5));
        System.out.printf("Original number: %.1f, Rounded number: %.1f%n", num7, Math.floor(num7 + 0.5));
        System.out.printf("Original number: %.1f, Rounded number: %.1f%n", num8, Math.floor(num8 + 0.5));
        System.out.printf("Original number: %.1f, Rounded number: %.1f%n", num9, Math.floor(num9 + 0.5));
    }
}


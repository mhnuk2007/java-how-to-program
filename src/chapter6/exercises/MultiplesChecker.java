package chapter6.exercises;

/*
    6.16 (Multiples) Write a method isMultiple that determines, for a pair of integers,
    whether the second integer is a multiple of the first. The method should take two
    integer arguments and return true if the second is a multiple of the first and false
    otherwise. [Hint: Use the remainder operator.]
    Incorporate this method into an application that inputs a series of pairs of integers
    (one pair at a time) and determines whether the second value in each pair is a
    multiple of the first.
 */

import java.util.Scanner;

public class MultiplesChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two integers (enter 0 as the first integer to exit).");
            System.out.print("First integer: ");
            int num1 = input.nextInt();

            if (num1 == 0) {
                System.out.println("Exiting program.");
                break;
            }

            System.out.print("Second integer: ");
            int num2 = input.nextInt();

            System.out.println(
                    isMultiple(num1, num2)
                            ? num2 + " is a multiple of " + num1
                            : num2 + " is NOT a multiple of " + num1
            );
            System.out.println(); // Empty line for better readability
        }

        input.close();
    }

    // Method to determine if second integer is a multiple of the first
    public static boolean isMultiple(int num1, int num2) {
        return num2 % num1 == 0;
    }
}

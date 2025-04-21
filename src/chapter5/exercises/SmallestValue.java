package chapter5.exercises;
/*
    5.11 (Find the Smallest Value) Write an application that finds the smallest of
    several integers. Assume that the first value read specifies the number of values
    to input from the user.
 */

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of values to be input: ");
        int numValues = input.nextInt();

        if (numValues <= 0) {
            System.out.println("Number of values must be positive.");
            return;
        }
        System.out.printf("Now, enter %d integers:%n", numValues);

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numValues; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int value = input.nextInt();
            if (value < smallest) {
                smallest = value;
            }
        }

        System.out.println("The smallest value is: " + smallest);

    }
}

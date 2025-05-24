package chapter14.exercises;

import java.util.Scanner;

/*
Exercise 14.4 (Comparing Portions of Strings)
Write an application that uses String method regionMatches to compare two strings input by the user.
The application should input the number of characters to be compared and the starting index of the comparison.
The application should state whether the strings are equal, ignoring case.
*/

public class StringRegionCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input first string
        System.out.print("Enter first string: ");
        String firstString = input.nextLine();

        // Input second string
        System.out.print("Enter second string: ");
        String secondString = input.nextLine();

        // Input starting index for comparison
        System.out.print("Enter starting index for comparison: ");
        int startIndex = input.nextInt();

        // Input number of characters to compare
        System.out.print("Enter number of characters to compare: ");
        int numChars = input.nextInt();

        // Compare portions of the strings ignoring case
        boolean match = firstString.regionMatches(true, startIndex, secondString, startIndex, numChars);

        // Display result
        if (match) {
            System.out.println("The specified portions of the strings are equal (case ignored).");
        } else {
            System.out.println("The specified portions of the strings are NOT equal.");
        }

        input.close();
    }
}

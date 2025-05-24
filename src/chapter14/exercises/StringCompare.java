package chapter14.exercises;
/*
Exercise: 14.3 (Comparing Strings) Write an application that uses String method compareTo to compare
two strings input by the user. Output whether the first string is less than, equal to or greater than
the second.
 */
import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter first string: ");
        String firstString = input.nextLine();

        System.out.print("Enter second string: ");
        String secondString = input.nextLine();

        // Compare the strings
        int result = firstString.compareTo(secondString);

        // Display the result
        if (result < 0) {
            System.out.printf("\"%s\" is less than \"%s\"%n", firstString, secondString);
        } else if (result == 0) {
            System.out.printf("\"%s\" is equal to \"%s\"%n", firstString, secondString);
        } else {
            System.out.printf("\"%s\" is greater than \"%s\"%n", firstString, secondString);
        }

        input.close();
    }
}

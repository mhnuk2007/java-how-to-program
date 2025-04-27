package Chapter6.exercises;

/*
    6.26 (Reversing Digits) Write a method that takes an integer value and returns the
    number with its digits reversed. For example, given the number 7631, the method should
    return 1367. Incorporate the method into an application that reads a value from the
    user and displays the result.
 */

import java.util.Scanner;

public class ReversingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt(); // Read the number from the user

        // Call reverseDigits method and display the reversed number
        System.out.println("Reversed number: " + reverseDigits(number));

        input.close(); // Close the Scanner
    }

    // Method to reverse the digits of a given number
    public static int reverseDigits(int number) {
        int reversed = 0; // Variable to store the reversed number

        // Loop until all digits are processed
        while (number > 0) {
            int digit = number % 10;       // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number /= 10;                  // Remove the last digit from the original number
        }

        return reversed; // Return the final reversed number
    }
}

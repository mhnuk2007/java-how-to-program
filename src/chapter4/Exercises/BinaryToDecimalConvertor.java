package chapter4.Exercises;
/*
    4.31 (Printing the Decimal Equivalent of a Binary Number) Write an application that
    inputs an integer containing only 0s and 1s (i.e., a binary integer) and prints its
    decimal equivalent. [Hint: Use the remainder and division operators to pick off the
    binary number’s digits one at a time, from right to left. In the decimal number system,
    the rightmost digit has a positional value of 1 and the next digit to the left a
    positional value of 10, then 100, then 1000, and so on. The decimal number 234 can be
    interpreted as 4 * 1 + 3 * 10 + 2 * 100. In the binary number system, the rightmost
    digit has a positional value of 1, the next digit to the left a positional value of 2,
    then 4, then 8, and so on.
    The decimal equivalent of binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8,
    or 1 + 0 + 4 + 8 or, 13.]
 */
import java.util.Scanner;

public class BinaryToDecimalConvertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a binary number (e.g., 1101)
        System.out.print("Enter a binary number (only 0s and 1s): ");
        int binary = input.nextInt();

        int originalBinary = binary; // Save original for output
        int decimal = 0;             // Store the converted decimal value
        int power = 1;               // 2^0 initially

        while (binary > 0) {
            int digit = binary % 10; // Get rightmost digit
            binary = binary / 10;    // Remove rightmost digit
            decimal += digit * power; // Add digit * corresponding power of 2
            power *= 2;               // Move to next power of 2
        }

        // Output result
        System.out.println("The decimal equivalent of " + originalBinary + " is " + decimal + ".");
    }
}

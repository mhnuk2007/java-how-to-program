package chapter14.exercises;
/*
Exercise: 14.15 (Converting int Values to Characters) Write an application that inputs an integer code for
a character and displays the corresponding character. Modify this application so that it generates all
possible three-digit codes in the range from 000 to 255 and attempts to print the corresponding
characters.
 */

import java.util.Scanner;

public class IntToCharConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Convert user-input integer to character
        System.out.print("Enter an integer (0–255): ");
        int code = scanner.nextInt();

        if (code >= 0 && code <= 255) {
            char character = (char) code;
            System.out.printf("The character for code %03d is: '%c'%n", code, character);
        } else {
            System.out.println("Invalid input. Enter a value between 0 and 255.");
        }

        System.out.println("\nAll character codes from 000 to 255:");

        // Part 2: Display all possible character codes from 0 to 255
        for (int i = 0; i <= 255; i++) {
            char ch = (char) i;
            System.out.printf("%03d -> %c%n", i, ch);
        }

        scanner.close();
    }
}

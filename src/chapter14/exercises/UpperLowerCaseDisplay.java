package chapter14.exercises;
/*
Exercise: 14.10 (Displaying Strings in Uppercase and Lowercase) Write an application that inputs a line of
text and outputs the text twice—once in all uppercase letters and once in all lowercase letters.
 */

import java.util.Scanner;

public class UpperLowerCaseDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a line of text: ");
        String inputText = scanner.nextLine();

        // Convert and display the text
        System.out.println("Uppercase: " + inputText.toUpperCase());
        System.out.println("Lowercase: " + inputText.toLowerCase());

        scanner.close();
    }
}

package chapter14.exercises;
/*
Exercise: 14.12 (Searching Strings) Write an application based on the application in Exercise 14.11 that
inputs a line of text and uses String method indexOf to determine the total number of occurrences
of each letter of the alphabet in the text. Uppercase and lowercase letters should be counted together.
Store the totals for each letter in an array, and print the values in tabular format after the totals have
been determined.

 */

import java.util.Scanner;

public class AlphabetSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a line of text
        System.out.print("Enter a line of text: ");
        String text = input.nextLine().toLowerCase(); // Case-insensitive

        // Array to count each letter
        int[] letterCount = new int[26];

        // Count each letter
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount[ch - 'a']++;
            }
        }

        // Display the counts in tabular format
        System.out.println("\nLetter\tCount");
        for (int i = 0; i < 26; i++) {
            System.out.printf("%c\t%d%n", (char) ('a' + i), letterCount[i]);
        }

        input.close();
    }
}

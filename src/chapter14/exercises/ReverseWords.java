package chapter14.exercises;
/*
14.9 (Displaying a Sentence with Its Words Reversed) Write an application that inputs a line of
text, tokenizes the line with String method split and outputs the tokens in reverse order. Use space
characters as delimiters.
 */

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words (tokens) using space as delimiter
        String[] words = sentence.split(" ");

        // Display words in reverse order
        System.out.println("Reversed sentence:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        System.out.println(); // For newline
        scanner.close();
    }
}

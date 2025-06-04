package chapter16.exercises;
/*
16.20 (Sorting Words with a TreeSet) Write a program that uses a String method split to
tokenize a line of text input by the user and places each token in a TreeSet. Print the
elements of the TreeSet. [Note: This should cause the elements to be printed in
ascending sorted order.]
 */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortedWordsTreeSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        // Tokenize using split() - split on whitespace or punctuation
        String[] tokens = input.split("[\\s.,!?;:\"()]+");

        // Add to TreeSet for sorting and uniqueness
        Set<String> words = new TreeSet<>();

        for (String word : tokens) {
            if (!word.isEmpty()) {
                words.add(word.toLowerCase()); // optional: normalize to lowercase
            }
        }

        // Output
        System.out.println("\nSorted unique words:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}

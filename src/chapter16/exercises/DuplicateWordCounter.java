package chapter16.exercises;
/*
16.16 (Counting Duplicate Words) Write a program that determines and prints the number of
duplicate words in a sentence. Treat uppercase and lowercase letters the same. Ignore punctuation
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Remove punctuation and convert to lowercase
        input = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split into words
        String[] words = input.split("\\s+");

        // Use a map to count occurrences
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Count how many words occurred more than once
        int duplicateCount = 0;
        System.out.println("\nDuplicate words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateCount++;
                System.out.printf("%s -> %d times%n", entry.getKey(), entry.getValue());
            }
        }

        System.out.printf("%nTotal number of duplicate words: %d%n", duplicateCount);
    }
}

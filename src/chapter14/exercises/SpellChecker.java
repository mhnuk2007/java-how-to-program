package chapter14.exercises;
/*
Exercise 14.24 (A Spelling Checker) and then implement a basic Java version that:
    Takes a list of correct words (wordList) from the user or a predefined list.
    Checks if an input word is spelled correctly.
    If not correct, tries to find similar words by:
    Checking all single adjacent letter transpositions (e.g., "defualt" → "default").
    Checking for double letter removal (e.g., "hanndy" → "handy").
 */

import java.util.*;

public class SpellChecker {

    private static List<String> wordList = new ArrayList<>();

    public static void main(String[] args) {
        // Sample dictionary words (normally, this would be read from a file or user input)
        wordList = Arrays.asList("default", "handy", "birthday", "example", "hello", "world");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check spelling: ");
        String inputWord = scanner.nextLine().toLowerCase();

        if (wordList.contains(inputWord)) {
            System.out.println("Word is spelled correctly.");
        } else {
            System.out.println("Word is not spelled correctly.");
            boolean suggestionFound = false;

            // Check single adjacent transpositions
            for (String suggestion : generateTranspositions(inputWord)) {
                if (wordList.contains(suggestion)) {
                    System.out.println("Did you mean \"" + suggestion + "\"?");
                    suggestionFound = true;
                }
            }

            // Check removing one of each double letter
            for (String suggestion : generateDoubleLetterRemovals(inputWord)) {
                if (wordList.contains(suggestion)) {
                    System.out.println("Did you mean \"" + suggestion + "\"?");
                    suggestionFound = true;
                }
            }

            if (!suggestionFound) {
                System.out.println("No suggestions found.");
            }
        }

        scanner.close();
    }

    // Generate all strings by swapping each adjacent pair of letters once
    private static List<String> generateTranspositions(String word) {
        List<String> transpositions = new ArrayList<>();
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            char[] copy = chars.clone();
            // Swap adjacent chars
            char temp = copy[i];
            copy[i] = copy[i + 1];
            copy[i + 1] = temp;

            transpositions.add(new String(copy));
        }

        return transpositions;
    }

    // Generate all strings by removing one of each double letter occurrence
    private static List<String> generateDoubleLetterRemovals(String word) {
        List<String> results = new ArrayList<>();

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                // Remove one of the double letters
                String removedOnce = word.substring(0, i) + word.substring(i + 1);
                results.add(removedOnce);
            }
        }

        return results;
    }
}

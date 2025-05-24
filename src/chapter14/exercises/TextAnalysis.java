package chapter14.exercises;
/*
Exercise 14.18 – Text Analysis
Write Java applications to perform the following text analyses:

(a) Read a line of text from the keyboard and print a table showing the number of occurrences
of each letter (a–z) in the text (case-insensitive).

(b) Read a line of text and print a table showing the number of words of each length
(e.g., one-letter words, two-letter words, etc.).

(c) Read a line of text and print a table showing the number of occurrences of each
unique word, preserving the order in which the words appear.
 */
import java.util.*;

public class TextAnalysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        System.out.println("\nChoose analysis type:");
        System.out.println("1. Letter Frequency (a–z)");
        System.out.println("2. Word Length Count");
        System.out.println("3. Word Frequency");
        int choice = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        switch (choice) {
            case 1:
                letterFrequency(input);
                break;
            case 2:
                wordLengthCount(input);
                break;
            case 3:
                wordFrequency(input);
                break;
            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }

    // 14.18(a) - Count letter frequencies
    private static void letterFrequency(String text) {
        int[] counts = new int[26]; // a-z

        for (char c : text.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            }
        }

        System.out.println("\nLetter Frequencies:");
        for (int i = 0; i < 26; i++) {
            System.out.printf("%c: %d\n", (char) ('a' + i), counts[i]);
        }
    }

    // 14.18(b) - Word length counts
    private static void wordLengthCount(String text) {
        String[] words = text.split("\\s+");
        int[] lengthCounts = new int[21]; // support word lengths up to 20

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z']", ""); // remove punctuation
            int len = word.length();
            if (len > 0 && len < lengthCounts.length) {
                lengthCounts[len]++;
            }
        }

        System.out.println("\nWord Length Counts:");
        for (int i = 1; i < lengthCounts.length; i++) {
            if (lengthCounts[i] > 0) {
                System.out.printf("Length %d: %d\n", i, lengthCounts[i]);
            }
        }
    }

    // 14.18(c) - Word frequency using arrays only
    private static void wordFrequency(String text) {
        String[] words = text.toLowerCase().split("\\s+");
        String[] seenWords = new String[words.length];
        int[] counts = new int[words.length];
        int uniqueIndex = 0;

        for (String word : words) {
            word = word.replaceAll("[^a-z']", "");
            if (word.isEmpty()) continue;

            int foundIndex = -1;
            for (int i = 0; i < uniqueIndex; i++) {
                if (seenWords[i].equals(word)) {
                    foundIndex = i;
                    break;
                }
            }

            if (foundIndex == -1) {
                seenWords[uniqueIndex] = word;
                counts[uniqueIndex] = 1;
                uniqueIndex++;
            } else {
                counts[foundIndex]++;
            }
        }

        System.out.println("\nWord Frequencies:");
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.printf("%s: %d\n", seenWords[i], counts[i]);
        }
    }
}
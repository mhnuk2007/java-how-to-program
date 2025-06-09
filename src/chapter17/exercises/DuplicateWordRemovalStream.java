package chapter17.exercises;
/*
Exercise 17.12:
(Duplicate Word Removal) Write a program that inputs a sentence from the user (assume
no punctuation), then determines and displays the unique words in alphabetical order.
Treat uppercase and lowercase letters the same.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DuplicateWordRemovalStream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Step 1: Input a sentence (no punctuation)
        System.out.println("Enter a sentence (no punctuation):");
        String sentence = input.nextLine();

        List<String> uniqueWords = Arrays.stream(sentence.split("\\s+"))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Unique words in alphabetical order:");
        uniqueWords.forEach(System.out::println);

        input.close();
    }
}

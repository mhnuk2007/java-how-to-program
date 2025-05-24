package chapter14.exercises;
/*
Exercise: 14.7 (Pig Latin) Write an application that encodes English-language phrases into pig Latin. Pig
Latin is a form of coded language. There are many different ways to form pig Latin phrases. For
simplicity, use the following algorithm:
To form a pig Latin phrase from an English-language phrase, tokenize the phrase into words
with String method split. To translate each English word into a pig Latin word, place the first
letter of the English word at the end of the word and add the letters “ay.” Thus, the word “jump”
becomes “umpjay,” the word “the” becomes “hetay,” and the word “computer” becomes “omputercay.” Blanks between words remain as blanks. Assume the following: The English phrase consists of
words separated by blanks, there are no punctuation marks and all words have two or more letters.
Method printLatinWord should display each word. Each token is passed to method printLatinWord to print the pig Latin word. Enable the user to input the sentence. Keep a running display of
all the converted sentences in a text area.
 */

import java.util.Scanner;

public class PigLatinConverter {

    // Converts and prints one word in Pig Latin
    public static String convertToPigLatin(String word) {
        if (word.length() < 2) return word; // Skip short words for safety
        String pigLatin = word.substring(1) + word.charAt(0) + "ay";
        return pigLatin;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder allSentences = new StringBuilder();  // To store all converted sentences

        while (true) {
            System.out.print("Enter a sentence (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Split the sentence into words
            String[] words = input.split(" ");
            StringBuilder pigLatinSentence = new StringBuilder();

            // Convert each word
            for (String word : words) {
                String pigWord = convertToPigLatin(word);
                pigLatinSentence.append(pigWord).append(" ");
            }

            // Store and display the Pig Latin sentence
            String converted = pigLatinSentence.toString().trim();
            allSentences.append(converted).append("\n");
            System.out.println("Pig Latin: " + converted);
            System.out.println("All Converted Sentences:\n" + allSentences);
        }

        scanner.close();
    }
}

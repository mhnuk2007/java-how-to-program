package chapter14.examples;

import java.util.Scanner;

public class RegexSplitExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence with various whitespaces and punctuation:");
        String sentence = scanner.nextLine();

        // Split by any non-word character (anything other than letters, digits, and underscore)
        String[] tokens = sentence.split("\\W+");

        System.out.printf("Number of tokens: %d%nTokens are:%n", tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

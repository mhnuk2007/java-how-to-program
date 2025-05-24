package chapter14.exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ThreeLetterStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 5-letter word: ");
        String word = input.nextLine();

        // Validate input length
        if (word.length() != 5) {
            System.out.println("Please enter exactly 5 letters.");
            input.close();
            return;
        }

        // Convert to lowercase for uniformity
        word = word.toLowerCase();

        Set<String> combinations = new HashSet<>();

        // Generate all possible 3-letter combinations (permutations without repetition)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    // Avoid using the same index twice
                    if (i != j && j != k && i != k) {
                        String threeLetter = "" + word.charAt(i) + word.charAt(j) + word.charAt(k);
                        combinations.add(threeLetter);
                    }
                }
            }
        }

        System.out.println("Possible 3-letter strings from the word '" + word + "':");
        for (String s : combinations) {
            System.out.println(s);
        }

        input.close();
    }
}

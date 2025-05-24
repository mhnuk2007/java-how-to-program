package chapter14.examples;// Fig. 14.18: TokenTest.java
// StringTokenizer object used to tokenize strings.
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenTest {
    // execute application
    public static void main(String[] args) {
        // get sentence
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter");
        String sentence = scanner.nextLine();

        // process user sentence using split() method
        String[] tokens = sentence.split(" ");  // split on spaces

        System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }

        // Alternatively, using StringTokenizer:
        /*
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        System.out.printf("Number of elements: %d%nThe tokens are:%n", tokenizer.countTokens());

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        */
    }
} // end class TokenTest

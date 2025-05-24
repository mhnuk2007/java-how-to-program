package chapter14.examples;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String text = "Java is a popular programming language";

        // Create tokenizer, split by space (default delimiter)
        StringTokenizer tokenizer = new StringTokenizer(text);

        // Loop through tokens
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

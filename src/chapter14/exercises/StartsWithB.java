package chapter14.exercises;
/*
Exercise: 14.13 (Tokenizing and Comparing Strings) Write an application that reads a line of text, tokenizes the line using space characters as delimiters and outputs only those words beginning with the
letter "b".
 */

import java.util.Scanner;

public class StartsWithB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = input.nextLine();

        String[] words = line.split(" ");

        System.out.println("Words that start with 'b':");
        for (String word : words) {
            if (word.toLowerCase().startsWith("b")) {
                System.out.println(word);
            }
        }

        input.close();
    }
}

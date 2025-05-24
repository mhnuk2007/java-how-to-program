package chapter14.exercises;
/*
Exercise: 14.14 (Tokenizing and Comparing Strings) Write an application that reads a
line of text, tokenizes it using space characters as delimiters and outputs only those
words ending with the letters "ED".
 */
import java.util.Scanner;

public class EndsWithED {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = input.nextLine();

        String[] words = line.split(" ");

        System.out.println("Words that end with 'ED':");
        for (String word : words) {
            if (word.toLowerCase().endsWith("ed")) {
                System.out.println(word);
            }
        }

        input.close();
    }
}

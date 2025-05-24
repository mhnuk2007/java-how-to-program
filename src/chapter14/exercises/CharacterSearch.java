package chapter14.exercises;
/*
Exercise: 14.11 (Searching Strings) Write an application that inputs a line of text and a search character and
uses String method indexOf to determine the number of occurrences of the character in the text.
*/

import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a line of text
        System.out.print("Enter a line of text: ");
        String text = input.nextLine();

        // Input the character to search for
        System.out.print("Enter a character to search for: ");
        char searchChar = input.next().charAt(0);

        // Convert both to lowercase for case-insensitive search
        text = text.toLowerCase();
        searchChar = Character.toLowerCase(searchChar);

        // Count occurrences
        int count = 0;
        int index = text.indexOf(searchChar);

        while (index != -1) {
            count++;
            index = text.indexOf(searchChar, index + 1);
        }

        System.out.printf("The character '%c' appears %d time(s).%n", searchChar, count);

        input.close();
    }
}

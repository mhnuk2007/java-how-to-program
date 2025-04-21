package chapter5.exercises;

/*
    5.24 (Diamond Printing Program)
    Write an application that prints the following diamond shape using nested for loops:

        *
       ***
      *****
     *******
    *********
     *******
      *****
       ***
        *

    Use repetition where possible and minimize output statements.
*/

public class DiamondPattern {
    public static void main(String[] args) {
        int rows = 5; // This represents the middle row's number of stars

        // Upper half including the middle row
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars: (2 * i - 1) stars per line
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = rows - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars: (2 * i - 1) stars per line
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

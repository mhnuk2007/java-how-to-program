package chapter4.Exercises;
/*
4.32 (Checkerboard Pattern of Asterisks) Write an application that uses only the output
statements
System.out.print("* ");
System.out.print(" ");
System.out.println();
to display the checkerboard pattern that follows. A System.out.println method call with
no arguments causes the program to output a single newline character.
[Hint: Repetition statements are required.]
 */

public class CheckerboardPattern {
    public static void main(String[] args) {
        int size = 16;  // Size of the checkerboard (rows and columns)
        int row = 1;

        while (row <= size) {
            int column = 1;

            while (column <= size) {
                // Check if row + column is even to print a star
                if ((row + column) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
                column++;
            }

            // Move to the next line
            System.out.println();
            row++;
        }
    }
}


package chapter5.exercises;

/*
    5.22 (Modified Triangle Printing Program)
    Combine the four triangle patterns from Exercise 5.15 into one side-by-side output.
*/

public class ModifiedStarPattern {
    public static void main(String[] args) {
        int rows = 10;

        // Header for clarity
        System.out.println("(a)\t\t\t(b)\t\t\t(c)\t\t\t(d)");

        for (int i = 1; i <= rows; i++) {

            // Pattern (a) Lower Left
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i + 1; j <= rows; j++) {
                System.out.print(" ");
            }
            System.out.print("\t");

            // Pattern (b) Upper Left
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("\t");

            // Pattern (c) Upper Right
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.print("\t");

            // Pattern (d) Lower Right
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next row
            System.out.println();
        }
    }
}

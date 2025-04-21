package chapter5.exercises;

import java.util.Scanner;

/*
    5.25 (Modified Diamond Printing Program)
    Accept an odd number between 1 and 19 and print a diamond of that size.
*/

public class ModifiedDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Prompt until valid odd number between 1 and 19 is entered
        do {
            System.out.print("Enter an odd number between 1 and 19: ");
            n = scanner.nextInt();
        } while (n < 1 || n > 19 || n % 2 == 0);

        int mid = n / 2;

        // Upper half including middle line
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

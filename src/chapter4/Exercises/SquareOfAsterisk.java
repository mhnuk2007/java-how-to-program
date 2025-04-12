package chapter4.Exercises;
/*
    4.29 (Square of Asterisks) Write an application that prompts the user to enter the
    size of the side of a square, then displays a hollow square of that size made of
    asterisks. Your program should work for squares of all side lengths between 1 and 20.
 */

import java.util.Scanner;

public class SquareOfAsterisk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the side of the square: ");
        int size = input.nextInt();

        while (size < 1 || size > 20) {
            System.out.print("Invalid input. Please enter a number between 1 and 20: ");
            size = input.nextInt();
        }
        int row = 1;

        while (row <= size) {
            int column = 1;
            while (column <= size) {
                if (row == 1 || row == size || column == 1 || column == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                column++;
            }

            row++;
            System.out.println();
        }


    }
}

package Chapter6.exercises;
/*
    6.18 (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays
    a solid square (the same number of rows and columns) of asterisks whose side is specified
    in integer parameter side. For example, if side is 4, the method should display
        ****
        ****
        ****
        ****
Incorporate this method into an application that reads an integer value for side from the
user and outputs the asterisks with the squareOfAsterisks method.
 */

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        int side = input.nextInt();
        squareOfAsterisks(side);
        input.close();
    }

    public static void squareOfAsterisks(int side) {
        int rows = side;
        while (rows > 0) {
            int columns = side;
            while (columns > 0){
                System.out.print("*");
                columns--;
            }
            System.out.println();
            rows--;
        }
    }
}


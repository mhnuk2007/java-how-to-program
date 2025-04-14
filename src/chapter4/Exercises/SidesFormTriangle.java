package chapter4.Exercises;
/*
    4.35 (Sides of a Triangle) Write an application that reads three nonzero values
    entered by the user and determines and prints whether they could represent the sides
    of a triangle.
 */

import java.util.Scanner;

public class SidesFormTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first side: ");
        int side1 = input.nextInt();
        System.out.println("Enter the second side:");
        int side2 = input.nextInt();
        System.out.println("Enter the third side:");
        int side3 = input.nextInt();

        if (side1 == 0 || side2 == 0 || side3 == 0) {
            System.out.println("All sides must be greater than 0");
            return;
        }
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
            System.out.println("These sides can form a triangle.");
        else
            System.out.println("These sides cannot form a triangle.");
    }
}


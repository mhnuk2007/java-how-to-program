package chapter6.exercises;

/*
    6.15 (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse
    of a right triangle when the lengths of the other two sides are given. The method should
    take two arguments of type double and return the hypotenuse as a double. Incorporate this
    method into an application that reads values for side1 and side2 and performs the
    calculation with the hypotenuse method. Use Math methods pow and sqrt to determine the
    length of the hypotenuse for each of the triangles in Fig. 6.15. [Note: Class Math also
    provides method hypot to perform this calculation.]
 */

import java.util.Scanner; // Import Scanner class for user input

public class HypotenuseCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for input

        // Prompt user to enter the lengths of the two sides
        System.out.println("Enter the lengths of the two sides of the triangle");
        System.out.print("Side 1: ");
        double side1 = input.nextDouble(); // Read first side

        System.out.print("Side 2: ");
        double side2 = input.nextDouble(); // Read second side

        // Calculate and display the hypotenuse
        System.out.printf("The length of the hypotenuse is: %.2f%n", hypotenuse(side1, side2));

        input.close(); // Close the Scanner to free resources
    }

    //Calculate the hypotenuse of a right triangle using Pythagoras' theorem.

    public static double hypotenuse(double side1, double side2) {
        // Use Math.pow to square the sides, and Math.sqrt to find the square root of the sum
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}

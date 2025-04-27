package Chapter6.exercises;
/*
    6.32 (Distance Between Points) Write method distance to calculate the distance between
    two points (x1, y1) and (x2, y2). All numbers and return values should be of type
    double. Incorporate this method into an application that enables the user to enter the
    coordinates of the points.
 */

import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for coordinates of the first point (x1, y1)
        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = input.nextDouble();
        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = input.nextDouble();

        // Prompt user for coordinates of the second point (x2, y2)
        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = input.nextDouble();
        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = input.nextDouble();

        // Calculate the distance between the two points
        double distance = distance(x1, y1, x2, y2);

        // Display the result
        System.out.printf("The distance between the points (%.2f, %.2f) and (%.2f, %.2f) is: %.2f%n", x1, y1, x2, y2, distance);

        // Close the scanner to prevent resource leaks
        input.close();
    }

    // Method to calculate the distance between two points
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}

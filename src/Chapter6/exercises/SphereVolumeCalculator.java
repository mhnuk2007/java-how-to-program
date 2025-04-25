package Chapter6.exercises;
/*
    6.6 Declare method sphereVolume to calculate and return the volume of the sphere. Use
    the following statement to calculate the volume:
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
    Write a Java application that prompts the user for the double radius of a sphere,
    calls sphereVolume to calculate the volume and displays the result.
 */

import java.util.Scanner;

public class SphereVolumeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner to get user input
        System.out.print("Enter the radius of the sphere: ");
        double radius = input.nextDouble();  // User input for radius

        // Call the sphereVolume method and store the result
        double volume = sphereVolume(radius);

        // Display the result
        System.out.printf("The volume of the sphere is: %.2f%n", volume);

        // Close the scanner to release resources
        input.close();
    }

    // Method to calculate the volume of the sphere
    public static double sphereVolume(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}

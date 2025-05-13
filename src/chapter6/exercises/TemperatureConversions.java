package chapter6.exercises;

/*
    6.22 (Temperature Conversions) Implement the following integer methods:
    a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using
       the calculation celsius = 5.0 / 9.0 * (fahrenheit - 32);
    b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
       the calculation fahrenheit = 9.0 / 5.0 * celsius + 32;
    c) Use the methods from parts (a) and (b) to write an application that enables the
       user either to enter a Fahrenheit temperature and display the Celsius equivalent or to
       enter a Celsius temperature and display the Fahrenheit equivalent.
 */

import java.util.Scanner; // Import Scanner class for user input

public class TemperatureConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for input

        // Display application menu
        System.out.println("Temperature Conversion Application");
        System.out.println("1 - Convert Fahrenheit to Celsius");
        System.out.println("2 - Convert Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt(); // Read user's choice

        // Perform conversion based on user's choice
        if (choice == 1) {
            // User chose to convert Fahrenheit to Celsius
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble(); // Read Fahrenheit value
            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius%n",
                    fahrenheit, celsius(fahrenheit)); // Display result
        } else if (choice == 2) {
            // User chose to convert Celsius to Fahrenheit
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = input.nextDouble(); // Read Celsius value
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit%n",
                    celsius, fahrenheit(celsius)); // Display result
        } else {
            // Invalid choice entered
            System.out.println("Invalid choice. Exiting the program.");
        }

        input.close(); // Close the Scanner to prevent resource leak
    }

    // Method to convert Fahrenheit to Celsius
    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    // Method to convert Celsius to Fahrenheit
    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}

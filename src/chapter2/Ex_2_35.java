package chapter2;
/*
    2.35 (Car-Pool Savings Calculator) Research several car-pooling websites. Create an
    application that calculates your daily driving cost, so that you can estimate how
    much money could be saved by car pooling, which also has other advantages such as
    reducing carbon emissions and reducing traffic congestion. The application should
    input the following information and display the user’s cost per day of driving to work:
        a) Total miles driven per day.
        b) Cost per gallon of gasoline.
        c) Average miles per gallon.
        d) Parking fees per day.
        e) Tolls per day.
 */

import java.util.Scanner;

public class Ex_2_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double milesPerDay, costPerGallon, milesPerGallon, parkingFees, tolls, fuelCostPerDay, totalDailyCost;


        System.out.print("Enter total miles driven per day: ");
        milesPerDay = scanner.nextDouble();

        System.out.print("Enter cost per gallon of gasoline ($): ");
        costPerGallon = scanner.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        milesPerGallon = scanner.nextDouble();

        System.out.print("Enter parking fees per day ($): ");
        parkingFees = scanner.nextDouble();

        System.out.print("Enter tolls per day ($): ");
        tolls = scanner.nextDouble();



        // Calculate fuel cost per day
        fuelCostPerDay = (milesPerDay / milesPerGallon) * costPerGallon;

        // Calculate total daily driving cost
        totalDailyCost = fuelCostPerDay + parkingFees + tolls;

        // Display the results
        System.out.println("\n--- Daily Driving Cost Breakdown ---");
        System.out.printf("Fuel Cost: $%.2f%n", fuelCostPerDay);
        System.out.printf("Parking Fees: $%.2f%n", parkingFees);
        System.out.printf("Tolls: $%.2f%n", tolls);
        System.out.printf("Total Daily Driving Cost: $%.2f%n", totalDailyCost);

        // Close the scanner
        scanner.close();
    }
}

package chapter6.exercises;
/*
    6.8 (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to
    three hours. The garage charges an additional $0.50 per hour for each hour or part thereof
    in excess of three hours. The maximum charge for any given 24-hour period is $10.00.
    Assume that no car parks for longer than 24 hours at a time. Write an application that
    calculates and displays the parking charges for each customer who parked in the garage
    yesterday. You should enter the hours parked for each customer. The program should display
    the charge for the current customer and should calculate and display the running total
    of yesterday’s receipts. It should use the method calculateCharges to determine the
    charge for each customer.

 */

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        double totalReceipts = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int numCustomers = input.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            System.out.print("Enter hours parked for customer #" + i + ": ");
            double hoursParked = input.nextDouble();

            double charge = calculateCharges(hoursParked);
            System.out.printf("Customer #%d charges: $%.2f%n", i, charge);

            totalReceipts += charge;
        }

        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
        input.close();
    }

    public static double calculateCharges(double hoursParked) {
        if (hoursParked >= 24) {
            return 10.00;
        }

        double charge = 2.00;

        if (hoursParked > 3) {
            charge += Math.ceil(hoursParked - 3) * 0.50;
        }

        return Math.min(charge, 10.00); // just in case, enforce max limit
    }
}

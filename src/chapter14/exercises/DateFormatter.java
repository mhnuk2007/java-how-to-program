package chapter14.exercises;
/*
Exercise: 14.19 (Printing Dates in Various Formats) Dates are printed in several common formats. Two of
the more common formats are
04/25/1955 and April 25, 1955
Write an application that reads a date in the first format and prints it in the second format.
 */

import java.util.Scanner;

public class DateFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of month names
        String[] monthNames = { 
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December" 
        };

        System.out.print("Enter date in MM/DD/YYYY format: ");
        String input = scanner.nextLine();
        scanner.close();

        // Split the input using "/" as delimiter
        String[] parts = input.split("/");

        if (parts.length != 3) {
            System.out.println("Invalid date format.");
            return;
        }

        try {
            int month = Integer.parseInt(parts[0]);
            int day = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            if (month < 1 || month > 12) {
                System.out.println("Invalid month. Must be between 01 and 12.");
                return;
            }

            String monthName = monthNames[month - 1];

            System.out.printf("Formatted date: %s %d, %d\n", monthName, day, year);

        } catch (NumberFormatException e) {
            System.out.println("Invalid date format. Please enter numbers in MM/DD/YYYY format.");
        }
    }
}

package chapter14.exercises;
/*
Exercise 14.20 - Check Protection, which adds leading asterisks to dollar amounts to
fill exactly 9 characters, helping prevent tampering
 */

import java.util.Scanner;

public class CheckProtection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for dollar amount
        System.out.print("Enter the check amount (e.g., 99.87): ");
        String amount = scanner.nextLine();

        // Remove commas (optional, if user enters something like 1,234.56)
        amount = amount.replace(",", "");

        // Format amount to 2 decimal places
        try {
            double numericAmount = Double.parseDouble(amount);
            amount = String.format("%.2f", numericAmount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid numeric amount.");
            return;
        }

        // Insert commas for thousands if necessary
        String[] parts = amount.split("\\.");
        String integerPart = parts[0];
        String decimalPart = parts[1];

        StringBuilder formatted = new StringBuilder();

        int count = 0;
        for (int i = integerPart.length() - 1; i >= 0; i--) {
            formatted.insert(0, integerPart.charAt(i));
            count++;
            if (count == 3 && i != 0) {
                formatted.insert(0, ',');
                count = 0;
            }
        }

        formatted.append(".").append(decimalPart);
        String finalAmount = formatted.toString();

        // Pad with leading asterisks if needed to fill 9 characters
        int totalLength = 9;
        int starsNeeded = totalLength - finalAmount.length();

        StringBuilder protectedAmount = new StringBuilder();
        for (int i = 0; i < starsNeeded; i++) {
            protectedAmount.append("*");
        }

        protectedAmount.append(finalAmount);

        // Output result
        System.out.println("Check-protected amount: " + protectedAmount);
    }
}
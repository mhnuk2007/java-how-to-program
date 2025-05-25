package chapter14.exercises;
/*
Exercise: 14.21 (Writing the Word Equivalent of a Check Amount) Continuing the discussion in
Exercise 14.20, we reiterate the importance of designing check-writing systems to prevent alteration
of check amounts. One common security method requires that the amount be written in numbers
and spelled out in words as well. Even if someone is able to alter the numerical amount of the check,
it’s extremely difficult to change the amount in words. Write an application that inputs a numeric
check amount that’s less than $1000 and writes the word equivalent of the amount. For example,
the amount 112.43 should be written as
ONE hundred TWELVE and 43/100
 */

import java.util.Scanner;

public class CheckAmountInWords {
    // Arrays for number words
    private static final String[] ones = {
        "", "ONE", "TWO", "THREE", "FOUR", "FIVE", 
        "SIX", "SEVEN", "EIGHT", "NINE", "TEN", 
        "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", 
        "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"
    };

    private static final String[] tens = {
        "", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", 
        "SIXTY", "SEVENTY", "EIGHTY", "NINETY"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount less than 1000 (e.g., 112.43): ");
        String input = scanner.nextLine();

        try {
            double amount = Double.parseDouble(input);
            if (amount < 0 || amount >= 1000) {
                System.out.println("Amount must be between 0 and 999.99");
                return;
            }

            int dollars = (int) amount;
            int cents = (int) Math.round((amount - dollars) * 100);

            String dollarWords = convert(dollars);
            System.out.printf("%s and %02d/100%n", dollarWords, cents);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        }

        scanner.close();
    }

    // Convert number to words for 0 <= number < 1000
    private static String convert(int number) {
        if (number == 0) {
            return "ZERO";
        } else if (number < 20) {
            return ones[number];
        } else if (number < 100) {
            return tens[number / 10] + (number % 10 != 0 ? " " + ones[number % 10] : "");
        } else {
            String hundredPart = ones[number / 100] + " hundred";
            int remainder = number % 100;
            if (remainder == 0) {
                return hundredPart.toUpperCase();
            } else {
                return (hundredPart + " " + convert(remainder)).toUpperCase();
            }
        }
    }
}

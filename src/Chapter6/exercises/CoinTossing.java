package Chapter6.exercises;
/*
    66.29 (Coin Tossing) Write an application that simulates coin tossing. Let the program
    toss a coin each time the user chooses the “Toss Coin” menu option. Count the number
    of times each side of the coin appears. Display the results. The program should call a
    separate method flip that takes no arguments and returns a value from a Coin enum
    (HEADS and TAILS).
    [Note: If the program realistically simulates coin tossing, each side of the coin
    should appear approximately half the time.]
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    // Enum to represent the two sides of a coin: HEADS and TAILS
    public enum Coin {
        HEADS,
        TAILS
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        // Initialize counters for heads and tails
        int headsCount = 0;
        int tailsCount = 0;

        // Main loop for the menu
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Toss Coin");
            System.out.println("2. Quit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            // If the user chooses to quit
            if (choice == 2) {
                System.out.println("Thanks for playing! Goodbye!");  // Display quit message
                break;  // Exit the loop and end the program
            }
            // If the user chooses to toss the coin
            else if (choice == 1) {
                // Call the flip method to simulate a coin toss
                Coin coin = flip();
                // Update the appropriate counter based on the toss result
                if (coin == Coin.HEADS) {
                    headsCount++;
                } else {
                    tailsCount++;
                }
                // Display the result of the coin toss and the current counts
                System.out.printf("The coin landed on %s%n", coin);
                System.out.printf("Heads count: %d%n", headsCount);
                System.out.printf("Tails count: %d%n", tailsCount);
            }
            // If the user enters an invalid choice
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }

    // Method to simulate a coin flip
    public static Coin flip() {
        // SecureRandom to generate random numbers for the coin toss
        SecureRandom random = new SecureRandom();
        // Return HEADS if the generated number is 0, TAILS if it is 1
        return (random.nextInt(2) == 0) ? Coin.HEADS : Coin.TAILS;
    }
}

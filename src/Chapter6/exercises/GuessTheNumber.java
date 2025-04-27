package Chapter6.exercises;
/*
6.30 (Guess the Number) Write an application that plays “guess the number” as follows:
Your program chooses the number to be guessed by selecting a random integer in the range
1 to 1000.
The application displays the prompt Guess a number between 1 and 1000. The player inputs
a first guess. If the player's guess is incorrect, your program should display Too high.
Try again. or Too low. Try again. to help the player “zero in” on the correct answer.
The program should prompt the user for the next guess. When the user enters the correct
answer, display Congratulations. You guessed the number!, and allow the user to choose
whether to play again. [Note: The guessing technique employed in this problem is similar
to a binary search, which is discussed in Chapter 19, Searching, Sorting and Big O.]
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = 1 + random.nextInt(1000); // Generate a random number between 1 and 1000
            System.out.println("I'm thinking of a number between 1 and 1000.");
            System.out.print("Try to guess it: ");

            int guess = -1; // Initialize guess to an invalid value

            // Loop until the user guesses correctly
            while (guess != numberToGuess) {
                // Ensure valid input
                while (!input.hasNextInt()) {
                    System.out.println("Please enter a valid number.");
                    input.next(); // Consume invalid input
                }

                guess = input.nextInt();

                // Check if the guess is too high, too low, or correct
                if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                }
            }

            // When the guess is correct
            System.out.println("Congratulations! You guessed the number!");

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String answer = input.next();
            if (!answer.equalsIgnoreCase("yes")) {
                playAgain = false; // Exit the loop if the user doesn't want to play again
            }
        }

        // Close the scanner to prevent resource leaks
        input.close();
        System.out.println("Thank you for playing! Goodbye!");
    }
}
